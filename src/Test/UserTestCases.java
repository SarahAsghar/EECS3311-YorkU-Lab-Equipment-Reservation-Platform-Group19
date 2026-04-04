package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.User.*;

class UserTestCases {

	@Test
	void UserTest_constructor() {
		//Creates new User, should be able to get all parameters and change them
		User u = new User("email", "pass", UserType.STUDENT, "123", "John");
		assertEquals("email", u.getEmail());
		assertEquals("pass", u.getPassword());
		assertEquals(UserType.STUDENT, u.getUserType());
		assertEquals("123", u.getIDNum());
		assertEquals("John", u.getName());
		assertEquals(false, u.getStatus());
	}
	
	@Test
	void UserTest_setters() {
		User u = new User("email", "pass", UserType.STUDENT, "123", "John");
		
		//Changed 
		u.setEmail("email2");
		u.setIDNum("321");
		u.setPassword("newPass");
		u.setStatus(true);
		u.setUserType(UserType.GUEST);
		
		assertEquals("email2", u.getEmail());
		assertEquals("newPass", u.getPassword());
		assertEquals(UserType.GUEST, u.getUserType());
		assertEquals("321", u.getIDNum());
		assertEquals("John", u.getName());
		assertEquals(true, u.getStatus());
	}
	
	@Test
	void UserFactoryTest_createUser_duplicateEmail() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.RESEARCHER, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		//Same email as u1, throw exception
		User u = null;
		try {
		u =  UserFactory.createUser("email", "pass123", UserType.FACULTY, "1234321", "May", users);
		fail();
		} catch(Exception e) {
			assertEquals(null, u);
		}
	}
	
	@Test
	void UserFactoryTest_createUser_validEmail() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.RESEARCHER, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		//different email, should return a user/u is not null anymore
		User u = null;
		try {
			u =  UserFactory.createUser("emailDifferent", "pass123", UserType.FACULTY, "1234321", "May", users);
			assertNotEquals(null, u);
			} catch(Exception e) {
				fail();
				
			}
	}
	
	@Test
	void UserFactoryTest_createUser_validateFields() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.RESEARCHER, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		User u = null;
		try {
			u =  UserFactory.createUser("emailDifferent", "pass123", UserType.FACULTY, "1234321", "May", users);
			} catch(Exception e) {
				fail();
			}
		
		//validate fields of u
		assertEquals("emailDifferent", u.getEmail());
		assertEquals("pass123", u.getPassword());
		assertEquals(UserType.FACULTY, u.getUserType());
		assertEquals("1234321", u.getIDNum());
		assertEquals("May", u.getName());
		assertEquals(false, u.getStatus());
	}
	
	@Test
	void UserFactoryTest_createLabManager_duplicateEmail() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		//Same email as u1, throw exception
		User u = null;
		try {
		u =  UserFactory.createLabManager("email", "pass123", "1234321", "May", users);
		fail();
		} catch(Exception e) {
			assertEquals(null, u);
		}
	}
	
	@Test
	void UserFactoryTest_createLabManager_validEmail() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		//different email, should return a user/u is not null anymore
		User u = null;
		try {
			u =  UserFactory.createLabManager("emailDifferent", "pass123", "1234321", "May", users);
			assertNotEquals(null, u);
			
			if(!(u instanceof LabManager)) {
				fail();
			}
			} catch(Exception e) {
				fail();
				
			}
	}
	
	@Test
	void UserFactoryTest_createLabManager_validateFields() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		User u = null;
		try {
			u =  UserFactory.createLabManager("emailDifferent", "pass123", "1234321", "May", users);
			} catch(Exception e) {
				fail();
			}
		
		//validate fields of u
		assertEquals("emailDifferent", u.getEmail());
		assertEquals("pass123", u.getPassword());
		assertEquals(UserType.LABMANAGER, u.getUserType());
		assertEquals("1234321", u.getIDNum());
		assertEquals("May", u.getName());
		assertEquals(true, u.getStatus());
	}
	
	@Test
	void LabManagerTest_constructor() {
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		User labManager = new LabManager("emailLab", "pass", "123", "l1");
		assertEquals("emailLab", labManager.getEmail());
		assertEquals("pass", labManager.getPassword());
		assertEquals(UserType.LABMANAGER, labManager.getUserType());
		assertEquals("123", labManager.getIDNum());
		assertEquals("l1", labManager.getName());
		assertEquals(true, labManager.getStatus());
	}
	
	@Test
	void LabManagerTest_canManageEquipment() {
		LabManager labManager = new LabManager("emailLab", "pass", "123", "l1");
		assertEquals(true, labManager.canManageEquipment());
	}
	
	@Test
	void HeadLabCoordinatorTest_constructor() {
		HeadLabCoordinator head = new HeadLabCoordinator("emailhead", "pass", "123", "Head");
		assertEquals("emailhead", head.getEmail());
		assertEquals("pass", head.getPassword());
		assertEquals(UserType.HEADLABCOORDINATOR, head.getUserType());
		assertEquals("123", head.getIDNum());
		assertEquals("Head", head.getName());
		assertEquals(true, head.getStatus());
	}
	
	@Test
	void HeadLabCoordinatorTest_generateLabManagerAccount() {
		HeadLabCoordinator head = new HeadLabCoordinator("emailhead", "pass", "123", "Head");
		
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		try {
		User labManager = head.generateLabManagerAccount("emailLab", "pass", "123", "l1", users);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	void HeadLabCoordinatorTest_approveUser() {
		HeadLabCoordinator head = new HeadLabCoordinator("emailhead", "pass", "123", "Head");
		
		ArrayList<User> users = new ArrayList<User>();
		User u1 = new User("email", "pass", UserType.STUDENT, "123", "John");
		User u2 = new User("email2", "pass2", UserType.STUDENT, "1234", "Alice");
		users.add(u2);
		users.add(u1);
		
		try {
		User labManager = head.generateLabManagerAccount("emailLab", "pass", "123", "l1", users);
		} catch (Exception e) {
			fail();
		}
		
		//approve user
		assertEquals(false, u1.getStatus());
		head.approveUser(u1);
		assertEquals(true, u1.getStatus());
		assertEquals(false, u2.getStatus());
	}
}