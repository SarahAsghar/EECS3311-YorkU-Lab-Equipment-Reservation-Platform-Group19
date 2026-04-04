package Test;

import org.junit.jupiter.api.Test;

public class AllTests {


	@Test
	void runAllControllerTests() {
		ControllerTest controllerTests = new ControllerTest();

		// Call each test method individually
		controllerTests.UserControllerTest_singletonInstance();
		controllerTests.UserControllerTest_loginUser_emailNotInDb();
		controllerTests.UserControllerTest_loginUser_wrongPassword();
		controllerTests.UserControllerTest_loginUser_notApproved();
		controllerTests.UserControllerTest_loginUser_success();
		controllerTests.UserControllerTest_registerUser_duplicateEmail();
		controllerTests.UserControllerTest_registerUser_invalidEmail();
		controllerTests.UserControllerTest_registerUser_invalidPassword();
		controllerTests.UserControllerTest_registerUser_success();
		controllerTests.UserControllerTest_registerUser_duplicateAfterSuccess();
		controllerTests.UserControllerTest_createLabManagerUser();
		controllerTests.UserControllerTest_createLabManagerUser_duplicateEmail();
		controllerTests.UserControllerTest_approveUser();
		controllerTests.UserControllerTest_removeUser();
		controllerTests.UserControllerTest_recreateUserAfterRemoval();
		controllerTests.EquipmentControllerTest_singletonInstance();
		controllerTests.EquipmentControllerTest_addEquipment_duplicateId();
		controllerTests.EquipmentControllerTest_addEquipment_success();
		controllerTests.EquipmentControllerTest_addEquipment_duplicateAfterSuccess();
		controllerTests.EquipmentControllerTest_enableEquipment();
		controllerTests.EquipmentControllerTest_disableEquipment();
		controllerTests.EquipmentControllerTest_markMaintenance();
		controllerTests.EquipmentControllerTest_markAvailable();
		controllerTests.EquipmentControllerTest_removeEquipment();
		controllerTests.EquipmentControllerTest_getEquipment();
		controllerTests.EquipmentControllerTest_getAllEquipment();
		controllerTests.EquipmentControllerTest_getEquipmentStatus();
		controllerTests.EquipmentControllerTest_updateEquipmentStatus();
		controllerTests.EquipmentControllerTest_reAddEquipmentAfterRemoval();
	}

	@Test
	void runAllEquipmentTests() {
		EquipmentTestCases equipmentTests = new EquipmentTestCases();

		equipmentTests.EquipmentTest_emptyConstructor();
		equipmentTests.EquipmentTest_constructorWithoutStatus();
		equipmentTests.EquipmentTest_constructorWithStatusAndEnabled();
		equipmentTests.EquipmentTest_setters();
		equipmentTests.EquipmentTest_setHourlyFee();
		equipmentTests.EquipmentTest_setStatus();
		equipmentTests.EquipmentTest_setEnabled();
		equipmentTests.EquipmentTest_isAvailable();
		equipmentTests.EquipmentTest_isReservable();
		equipmentTests.EquipmentTest_enableEquipment();
		equipmentTests.EquipmentTest_disableEquipment();
		equipmentTests.EquipmentTest_markReserved();
		equipmentTests.EquipmentTest_markInUse();
		equipmentTests.EquipmentTest_markAvailable();
		equipmentTests.EquipmentTest_markUnderMaintenance();
		equipmentTests.EquipmentTest_updateStatus();
		equipmentTests.EquipmentTest_toString();
		equipmentTests.EquipmentSensorTest_constructor();
		equipmentTests.EquipmentSensorTest_attachAndNotify();
		equipmentTests.EquipmentSensorTest_detectUsage_null();
		equipmentTests.EquipmentSensorTest_detectUsage_IN_USE();
		equipmentTests.EquipmentSensorTest_detectUsage_AVAILABLE();
		equipmentTests.EquipmentSensorTest_detectUsage_MAINTENANCE();
		equipmentTests.EquipmentSensorTest_detectUsage_DISABLED();
		equipmentTests.EquipmentSensorTest_detectUsage_RESERVED();
		equipmentTests.EquipmentSensorTest_consecutiveIN_USE();
		equipmentTests.EquipmentSensorTest_getUsageRecords_unmodifiable();
		equipmentTests.EquipmentSensorTest_generateRecordId();
		equipmentTests.EquipmentSensorTest_detectUsageWithoutStartingUsage();
		equipmentTests.EquipmentSensorTest_detachObserver();
		equipmentTests.EquipmentSensorTest_multipleRecords();
		equipmentTests.EquipmentSensorTest_endUsageOnlyOnce();
		equipmentTests.EquipmentStatusObserverTest_constructorNullEquipment();
		equipmentTests.EquipmentStatusObserverTest_constructorNullSensor();
		equipmentTests.EquipmentStatusObserverTest_constructorAndGetters();
		equipmentTests.EquipmentStatusObserverTest_updateToIN_USE();
		equipmentTests.EquipmentStatusObserverTest_updateToMAINTENANCE();
		equipmentTests.EquipmentStatusObserverTest_updateToRESERVED();
		equipmentTests.EquipmentStatusObserverTest_updateToDISABLED();
		equipmentTests.EquipmentStatusObserverTest_updateToAVAILABLE();
		equipmentTests.EquipmentStatusObserverTest_multipleUpdatesInRow();
		equipmentTests.EquipmentStatusObserverTest_multipleObservers();
		equipmentTests.EquipmentStatusObserverTest_updateWithNull();
		equipmentTests.UsageRecordTest_emptyConstructor();
		equipmentTests.UsageRecordTest_setters();
		equipmentTests.UsageRecordTest_constructorWithAllParams();
		equipmentTests.UsageRecordTest_updateValues();
		equipmentTests.UsageRecordTest_setNullValues();
		equipmentTests.UsageRecordTest_partialData();
		equipmentTests.UsageRecordTest_toString();
		equipmentTests.UsageRecordTest_endBeforeStart();
		equipmentTests.UsageRecordTest_multipleRecords();
		equipmentTests.UsageRecordTest_setEndAfterCreation();
	}

	@Test
	void runAllUserTests() {
		UserTestCases userTests = new UserTestCases();

		userTests.UserTest_constructor();
		userTests.UserTest_setters();
		userTests.UserFactoryTest_createUser_duplicateEmail();
		userTests.UserFactoryTest_createUser_validEmail();
		userTests.UserFactoryTest_createUser_validateFields();
		userTests.UserFactoryTest_createLabManager_duplicateEmail();
		userTests.UserFactoryTest_createLabManager_validEmail();
		userTests.UserFactoryTest_createLabManager_validateFields();
		userTests.LabManagerTest_constructor();
		userTests.LabManagerTest_canManageEquipment();
		userTests.HeadLabCoordinatorTest_constructor();
		userTests.HeadLabCoordinatorTest_generateLabManagerAccount();
		userTests.HeadLabCoordinatorTest_approveUser();
	}
}


