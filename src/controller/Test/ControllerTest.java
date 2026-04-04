package controller.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import controller.EquipmentController;
import controller.UserController;
import model.DatabaseManager;
import model.Equipment.Equipment;
import model.Equipment.EquipmentStatus;
import model.User.User;
import model.User.UserType;

class ControllerTest {

	@Test
	void UserControllerTests() {
		 //get instance of UserController
		UserController c1 = UserController.getInstance();
		UserController c2 = UserController.getInstance();
		assertEquals(c1, c2);
		
		DatabaseManager db = DatabaseManager.getInstance();
		ArrayList<User> users = db.loadUsers();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1232", "Alice");
		u2.setStatus(true);
		User l1 = new User("labemail", "labPass", UserType.LABMANAGER, "123lab", "l1");
		l1.setStatus(true);
		
		users.add(u2);
		users.add(u1);
		users.add(l1);
		db.saveUsers(users);
		
		//Test loginUser
		String lu = c1.loginUser("EmailNotInDb", "Failure");
		assertEquals("Fail", lu);
		
		String lu2 = c1.loginUser("Email", "12");
		assertEquals("Fail", lu2);
		
		String lu3 = c1.loginUser("email", "pass");
		assertEquals("Department has not approved this account", lu3);
		
		String lu4 = c1.loginUser("email2", "pass2");
		assertEquals("Good", lu4);
		User loggedInUser = UserController.getLoggedInUser();
		assertEquals(u2, loggedInUser);
		
		//test registerUser
		String ru1 = c1.registerUser("email", "pass", UserType.GUEST, "132", "Lilu");
		assertEquals("Email not unique", ru1);
		
		String ru2 = c1.registerUser("email3", "pass", UserType.GUEST, "132", "Lilu");
		assertEquals("Invalid email", ru2);
		
		String ru3 = c1.registerUser("email@3", "pass", UserType.GUEST, "132", "Lilu");
		assertEquals("Invalid email", ru3);
		
		String ru4 = c1.registerUser("email@-3", "pass", UserType.GUEST, "132", "Lilu");
		assertEquals("Invalid email", ru4);
		
		String ru5 = c1.registerUser("lily@email.com", "pass", UserType.GUEST, "132", "Lilu");
		assertEquals("Password must contain uppercase, lowercase, number, and special character", ru5);

		String ru6 = c1.registerUser("lily@email.com", "pass1", UserType.GUEST, "132", "Lilu");
		assertEquals("Password must contain uppercase, lowercase, number, and special character", ru6);

		String ru7 = c1.registerUser("lily@email.com", "Pass1", UserType.GUEST, "132", "Lilu");
		assertEquals("Password must contain uppercase, lowercase, number, and special character", ru7);

		String ru8 = c1.registerUser("lily@email.com", "Pass1!", UserType.GUEST, "132", "Lilu");
		assertEquals("User successfully created!", ru8);
		
		//Since user is added, email cannot be duplicated
		String ru9 = c1.registerUser("lily@email.com", "Pass1!", UserType.GUEST, "132", "Lilu");
		assertEquals("Email not unique", ru9);

		//Test createLabManager
		String clm1 = c1.createLabManagerUser();
		assertEquals("New Lab Manager Created:\n"
				+ "email=LabManager2@account.ca\n"
				+ "password=LabManager@2", clm1);
		
		String clm2 = c1.createLabManagerUser();
		assertEquals("New Lab Manager Created:\n"
				+ "email=LabManager3@account.ca\n"
				+ "password=LabManager@3", clm2);
		
		//check if lab manager is in users via its email
		String ru10 = c1.registerUser("LabManager3@account.ca", "LabManager@3", UserType.LABMANAGER, "132", "Lilu");
		assertEquals("Email not unique", ru10);
		
		//Test approveUser
		boolean au1 = c1.approveUser("fakeemail");
		assertEquals(false, au1);
		boolean au2 = c1.approveUser("lily@email.com");
		assertEquals(true, au2);
		
		//Test removeUser
		boolean remu1 = c1.removeUser("fakeemail");
		assertEquals(false, remu1);
		boolean remu2 = c1.removeUser("lily@email.com");
		assertEquals(true, remu2);
		//can recreate this user if successfully deleted
		String ru11 = c1.registerUser("lily@email.com", "Pass1!", UserType.GUEST, "132", "Lilu");
		assertEquals("User successfully created!", ru11);
		
	}
	
	@Test
	void EquipmentControllerTests() {
		//get instance of EquipmentController
		EquipmentController c1 = EquipmentController.getInstance();
		EquipmentController c2 = EquipmentController.getInstance();
		assertEquals(c1, c2);
		
		DatabaseManager db = DatabaseManager.getInstance();
		
		Equipment e1 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		Equipment e2 = new Equipment("12345", "Printer3", "Prints stuff 3", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);

		ArrayList<Equipment> equipments = db.loadEquipment();
		equipments.add(e2);
		equipments.add(e1);
		db.saveEquipment(equipments);
		
		
		//Test addEquipment
		String ae1 = c1.addEquipment("1234", "Printer2", "Prints", "1006Las", 10.00);
		assertEquals("Equipment ID already exists", ae1);
		
		String ae2 = c1.addEquipment("1", "Camera", "Pics", "Home", 10.00);
		assertEquals("Equipment added successfully!", ae2);
		
		String ae3 = c1.addEquipment("1", "Camera", "Pics", "Home", 10.00);
		assertEquals("Equipment ID already exists", ae3);
		
		
		//Test enableEquipment
		String ee1 = c1.enableEquipment("FakeId");
		assertEquals("Equipment not found", ee1);

		String ee2 = c1.enableEquipment("1");
		assertEquals("Equipment enabled successfully!", ee2);
		equipments = db.loadEquipment();
		for(Equipment e : equipments) {
			if(e.getEquipmentId().equals("1")) {
				assertEquals(true, e.isEnabled());
			}
		}
		
		//Test disableEquipment
		String de1 = c1.disableEquipment("FakeId");
		assertEquals("Equipment not found", de1);

		String de2 = c1.disableEquipment("1");
		assertEquals("Equipment disabled successfully!", de2);
		equipments = db.loadEquipment();
		for(Equipment e : equipments) {
			if(e.getEquipmentId().equals("1")) {
				assertEquals(false, e.isEnabled());
			}
		}
		
		c1.enableEquipment("1");
		
		//Test markMaintenance
		String mm1 = c1.markMaintenance("FakeId");
		assertEquals("Equipment not found", mm1);

		String mm2 = c1.markMaintenance("1");
		assertEquals("Equipment marked for maintenance", mm2);
		equipments = db.loadEquipment();
		for(Equipment e : equipments) {
			if(e.getEquipmentId().equals("1")) {
				assertEquals(EquipmentStatus.MAINTENANCE, e.getStatus());
			}
		}
		
		//Test markAvailable
		String ma1 = c1.markAvailable("FakeId");
		assertEquals("Equipment not found", ma1);

		String ma2 = c1.markAvailable("1");
		assertEquals("Equipment marked available", ma2);
		equipments = db.loadEquipment();
		for(Equipment e : equipments) {
			if(e.getEquipmentId().equals("1")) {
				assertEquals(EquipmentStatus.AVAILABLE, e.getStatus());
			}
		}
		
		//Test removeEquipment
		String re1 = c1.removeEquipment("FakeId");
		assertEquals("Equipment not found", re1);

		String re2 = c1.removeEquipment("1");
		assertEquals("Equipment removed successfully!", re2);
		equipments = db.loadEquipment();
		for(Equipment e : equipments) {
			if(e.getEquipmentId().equals("1")) {
				fail();
			}
		}
		
		String ae4 = c1.addEquipment("1", "Camera", "Pics", "Home", 10.00);
		assertEquals("Equipment added successfully!", ae4);

		
		Equipment equip1 = c1.getEquipment("1");
		assertEquals("1", equip1.getEquipmentId());
		assertEquals("Camera", equip1.getName());
		assertEquals("Pics", equip1.getDescription());
		assertEquals("Home", equip1.getLabLocation());
		assertEquals(10.00, equip1.getHourlyFee());
		
		Equipment equip2 = c1.getEquipment("notinlist");
		assertNull(equip2);

		equipments = db.loadEquipment();
		assertEquals(equipments, c1.getAllEquipment());
		
		//Test getEquipmentStatus
		String ma4 = c1.markAvailable("1");
		String ges1 = c1.getEquipmentStatus("noteveninlist");
		assertEquals("Equipment not found", ges1);
		String ges2 = c1.getEquipmentStatus("1");
		assertEquals("AVAILABLE", ges2);

		//Test updateEquipmentStatus
		boolean ues0 = EquipmentController.updateEquipmentStatus("10000", EquipmentStatus.AVAILABLE);
		assertEquals(false, ues0);
		
		boolean ues1 = EquipmentController.updateEquipmentStatus("1", EquipmentStatus.AVAILABLE);
		assertEquals(true, ues1);
		
		boolean ues2 = EquipmentController.updateEquipmentStatus("1", EquipmentStatus.RESERVED);
		assertEquals(true, ues2);
		
		
		boolean ues5 = EquipmentController.updateEquipmentStatus("1", EquipmentStatus.IN_USE);
		assertEquals(true, ues5);
		
		boolean ues4 = EquipmentController.updateEquipmentStatus("1", EquipmentStatus.MAINTENANCE);
		assertEquals(true, ues4);
		
		boolean ues3 = EquipmentController.updateEquipmentStatus("1", EquipmentStatus.DISABLED);
		assertEquals(true, ues3);

		
	}
	
	

}
