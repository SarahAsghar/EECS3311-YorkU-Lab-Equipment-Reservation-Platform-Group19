package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Equipment.*;

class EquipmentTestCases {
	
	@Test
	void EquipmentTest_emptyConstructor() {
		//Test empty constructor
		Equipment e = new Equipment();
		assertEquals(true, e.isEnabled());
		assertEquals(EquipmentStatus.AVAILABLE, e.getStatus());

		e.setEnabled(false);
		e.disableEquipment();
		assertEquals(false, e.isEnabled());
		assertEquals(EquipmentStatus.DISABLED, e.getStatus());
	}
	
	@Test
	void EquipmentTest_constructorWithoutStatus() {
		//Test Constructor without status
		Equipment e1 = new Equipment("123", "Printer", "Prints stuff", "LAS1006", 10.00);
		assertEquals("123", e1.getEquipmentId());
		assertEquals("Printer", e1.getName());
		assertEquals("Prints stuff", e1.getDescription());
		assertEquals("LAS1006", e1.getLabLocation());
		assertEquals(10.00, e1.getHourlyFee());
		assertEquals(true, e1.isEnabled());
		assertEquals(EquipmentStatus.AVAILABLE, e1.getStatus());
	}
	
	@Test
	void EquipmentTest_constructorWithStatusAndEnabled() {
		//Test Constructor with status and enabled
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		assertEquals("1234", e2.getEquipmentId());
		assertEquals("Printer2", e2.getName());
		assertEquals("Prints stuff 2", e2.getDescription());
		assertEquals("LAS1006", e2.getLabLocation());
		assertEquals(10.00, e2.getHourlyFee());
		assertEquals(true, e2.isEnabled());
		assertEquals(EquipmentStatus.IN_USE, e2.getStatus());
	}
	
	@Test
	void EquipmentTest_setters() {
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		
		//test setters
		e2.setDescription("Prints stuff too");
		assertEquals("Prints stuff too", e2.getDescription());

		e2.setEquipmentId("1");
		assertEquals("1", e2.getEquipmentId());

		e2.setName("Brother Printer");
		assertEquals("Brother Printer", e2.getName());

		e2.setLabLocation("LAS1005");
		assertEquals("LAS1005", e2.getLabLocation());
	}
	
	@Test
	void EquipmentTest_setHourlyFee() {
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		
		//test setHourlyFee
		try { //invalid
			e2.setHourlyFee(-20.00);
			fail();
		} catch (Exception exc) {
			assertEquals(10.00, e2.getHourlyFee());

		}
		try { //valid
			e2.setHourlyFee(20.00);
			assertEquals(20.00, e2.getHourlyFee());

		} catch (Exception exc) {
			fail();
		}
	}
	
	@Test
	void EquipmentTest_setStatus() {
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		
		//test setStatus
		try { //invalid
			e2.setStatus(null);
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.IN_USE, e2.getStatus());

		}
		try { //valid
			e2.setStatus(EquipmentStatus.RESERVED);
			assertEquals(EquipmentStatus.RESERVED, e2.getStatus());

		} catch (Exception exc) {
			fail();
		}
	}
	
	@Test
	void EquipmentTest_setEnabled() {
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		
		e2.setEnabled(false);
		assertEquals(false, e2.isEnabled());
		assertEquals(EquipmentStatus.DISABLED, e2.getStatus());

		e2.setEnabled(true);
		assertEquals(true, e2.isEnabled());
		assertEquals(EquipmentStatus.AVAILABLE, e2.getStatus());

		e2.setStatus(EquipmentStatus.MAINTENANCE);
		e2.setEnabled(true);
		assertEquals(EquipmentStatus.MAINTENANCE, e2.getStatus());
	}
	
	@Test
	void EquipmentTest_isAvailable() {
		//Test isAvailable
		Equipment e3 = new Equipment();
		e3.setEnabled(true);
		e3.setStatus(EquipmentStatus.AVAILABLE);
		assertEquals(true, e3.isAvailable());
		e3.setEnabled(false);
		assertEquals(false, e3.isAvailable());
		e3.setEnabled(true);
		e3.setStatus(EquipmentStatus.MAINTENANCE);
		assertEquals(false, e3.isAvailable());
	}
	
	@Test
	void EquipmentTest_isReservable() {
		//Test isReservable
		Equipment e4 = new Equipment();
		e4.setEnabled(true);
		e4.setStatus(EquipmentStatus.AVAILABLE);
		assertEquals(true, e4.isReservable());
		e4.setEnabled(false);
		assertEquals(false, e4.isReservable());
		e4.setEnabled(true);
		e4.setStatus(EquipmentStatus.MAINTENANCE);
		assertEquals(false, e4.isReservable());
	}
	
	@Test
	void EquipmentTest_enableEquipment() {
		//Test enableEquipment
		Equipment e5 = new Equipment();
		e5.setStatus(EquipmentStatus.IN_USE);
		e5.enableEquipment();
		assertEquals(EquipmentStatus.IN_USE, e5.getStatus());
		assertEquals(true, e5.isEnabled());
		e5.setStatus(EquipmentStatus.DISABLED);
		e5.setEnabled(false);
		e5.enableEquipment();
		assertEquals(EquipmentStatus.AVAILABLE, e5.getStatus());
		assertEquals(true, e5.isEnabled());
	}
	
	@Test
	void EquipmentTest_disableEquipment() {
		//Test disableEquipment
		Equipment e6 = new Equipment();
		e6.disableEquipment();
		assertEquals(EquipmentStatus.DISABLED, e6.getStatus());
		assertEquals(false, e6.isEnabled());
	}
	
	@Test
	void EquipmentTest_markReserved() {
		//Test markReserved
		Equipment e7 = new Equipment();
		e7.setEnabled(false);
		try {
			e7.markReserved();
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.DISABLED, e7.getStatus());
		}

		e7.setEnabled(true);
		e7.setStatus(EquipmentStatus.MAINTENANCE);

		try {
			e7.markReserved();
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.MAINTENANCE, e7.getStatus());
		}

		e7.setStatus(EquipmentStatus.AVAILABLE);
		try {
			e7.markReserved();
			assertEquals(EquipmentStatus.RESERVED, e7.getStatus());
		} catch (Exception exc) {
			fail();
		}
	}
	
	@Test
	void EquipmentTest_markInUse() {
		//Test markInUse
		Equipment e8 = new Equipment();
		e8.setEnabled(false);
		try {
			e8.markInUse();
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.DISABLED, e8.getStatus());

		}
		e8.setEnabled(true);
		e8.setStatus(EquipmentStatus.MAINTENANCE);
		try {
			e8.markInUse();
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.MAINTENANCE, e8.getStatus());

		}
		e8.setStatus(EquipmentStatus.AVAILABLE);
		try {
			e8.markInUse();
			assertEquals(EquipmentStatus.IN_USE, e8.getStatus());
		} catch (Exception exc) {
			fail();
		}
	}
	
	@Test
	void EquipmentTest_markAvailable() {
		//Test markAvailable
		Equipment e9 = new Equipment();
		e9.setEnabled(false);
		try {
			e9.markAvailable();
			fail();
		} catch(Exception exc) {
			assertEquals(EquipmentStatus.DISABLED, e9.getStatus());

		}
		e9.setEnabled(true);
		e9.setStatus(EquipmentStatus.IN_USE);
		try {
			e9.markAvailable();
			assertEquals(EquipmentStatus.AVAILABLE, e9.getStatus());
		} catch(Exception exc) {
			fail();

		}
	}
	
	@Test
	void EquipmentTest_markUnderMaintenance() {
		Equipment e9 = new Equipment();
		//Test markUnderMaitenence
		e9.markUnderMaintenance();
		assertEquals(EquipmentStatus.MAINTENANCE, e9.getStatus());
	}
	
	@Test
	void EquipmentTest_updateStatus() {
		Equipment e9 = new Equipment();
		e9.markUnderMaintenance();
		
		//Test updateStatus
		try {
			e9.updateStatus(null);
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.MAINTENANCE, e9.getStatus());
		}
		try {
			e9.setEnabled(false);
			e9.updateStatus(EquipmentStatus.MAINTENANCE);
			fail();
		} catch (Exception exc) {
			assertEquals(EquipmentStatus.DISABLED, e9.getStatus());
		}
		try {
			e9.setEnabled(true);
			e9.updateStatus(EquipmentStatus.MAINTENANCE);
			assertEquals(EquipmentStatus.MAINTENANCE, e9.getStatus());
		} catch (Exception exc) {
			fail();		
		}
	}
	
	@Test
	void EquipmentTest_toString() {
		Equipment e2 = new Equipment("1234", "Printer2", "Prints stuff 2", "LAS1006", 10.00, EquipmentStatus.IN_USE, true);
		e2.setEquipmentId("1");
		e2.setName("Brother Printer");
		e2.setStatus(EquipmentStatus.MAINTENANCE);
		
		//Test toString
		assertEquals("1 - Brother Printer [MAINTENANCE]", e2.toString());
	}


	
	@Test
	void EquipmentSensorTest_constructor() {
		//Test constructor with null equipment
		try {
			EquipmentSensor sensor = new EquipmentSensor(null);
			fail();
		} catch (Exception exc) {}

		// Test constructor with valid equipment
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);

		assertEquals(equipment.getStatus(), sensor.getCurrentStatus());
		assertEquals(equipment, sensor.getEquipment());
		assertEquals(null, sensor.getLatestRecord());
		assertEquals(0, sensor.getUsageRecords().size());
	}
	
	@Test
	void EquipmentSensorTest_attachAndNotify() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		//test attach
		final int[] updateCount = {0};
		final EquipmentStatus[] lastStatus = {null};

		Observer testObserver = new Observer() {
			@Override
			public void update(EquipmentStatus status) {
				updateCount[0]++;
				lastStatus[0] = status;
			}
		};

		sensor.attach(null);
		sensor.attach(testObserver);
		sensor.attach(testObserver); 

		//Test notifyObservers
		sensor.notifyObservers();
		assertEquals(1, updateCount[0]);
		assertEquals(EquipmentStatus.AVAILABLE, lastStatus[0]);
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_null() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		//Test detectUsage with null
		try { 
			sensor.detectUsage(null);
			fail();
		} catch (Exception exc) {}
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_IN_USE() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		final int[] updateCount = {0};
		final EquipmentStatus[] lastStatus = {null};

		Observer testObserver = new Observer() {
			@Override
			public void update(EquipmentStatus status) {
				updateCount[0]++;
				lastStatus[0] = status;
			}
		};
		sensor.attach(testObserver);

		sensor.detectUsage(EquipmentStatus.IN_USE);
		assertEquals(EquipmentStatus.IN_USE, sensor.getCurrentStatus());
		assertEquals(1, updateCount[0]);
		assertEquals(EquipmentStatus.IN_USE, lastStatus[0]);

		UsageRecord record = sensor.getLatestRecord();
		assertNotNull(record);
		assertNotNull(record.getRecordId());
		assertEquals(true, record.getRecordId().startsWith("UR-"));
		assertEquals(equipment.getEquipmentId(), record.getEquipmentId());
		assertNotNull(record.getStartUsage());
		assertEquals(null, record.getEndUsage());
		assertEquals("Equipment started being used.", record.getStatusUpdate());
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_AVAILABLE() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		final int[] updateCount = {0};
		final EquipmentStatus[] lastStatus = {null};

		Observer testObserver = new Observer() {
			@Override
			public void update(EquipmentStatus status) {
				updateCount[0]++;
				lastStatus[0] = status;
			}
		};
		sensor.attach(testObserver);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		sensor.detectUsage(EquipmentStatus.AVAILABLE);
		
		assertEquals(EquipmentStatus.AVAILABLE, sensor.getCurrentStatus());
		assertEquals(2, updateCount[0]);
		assertEquals(EquipmentStatus.AVAILABLE, lastStatus[0]);
		assertEquals(null, sensor.getLatestRecord());
		assertEquals(1, sensor.getUsageRecords().size());

		UsageRecord completedRecord = sensor.getUsageRecords().get(0);
		assertNotNull(completedRecord.getEndUsage());
		assertEquals(true, completedRecord.getEndUsage().isAfter(completedRecord.getStartUsage()));
		assertEquals("Equipment status changed to AVAILABLE.", completedRecord.getStatusUpdate());
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_MAINTENANCE() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		sensor.detectUsage(EquipmentStatus.MAINTENANCE);
		
		assertEquals(EquipmentStatus.MAINTENANCE, sensor.getCurrentStatus());
		assertEquals(null, sensor.getLatestRecord());
		assertEquals(1, sensor.getUsageRecords().size());
		assertEquals("Equipment status changed to MAINTENANCE.", sensor.getUsageRecords().get(0).getStatusUpdate());
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_DISABLED() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		sensor.detectUsage(EquipmentStatus.DISABLED);
		
		assertEquals(EquipmentStatus.DISABLED, sensor.getCurrentStatus());
		assertEquals(null, sensor.getLatestRecord());
		assertEquals(1, sensor.getUsageRecords().size());
		assertEquals("Equipment status changed to DISABLED.", sensor.getUsageRecords().get(0).getStatusUpdate());
	}
	
	@Test
	void EquipmentSensorTest_detectUsage_RESERVED() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		sensor.detectUsage(EquipmentStatus.RESERVED);
		
		assertEquals(EquipmentStatus.RESERVED, sensor.getCurrentStatus());
		assertEquals(null, sensor.getLatestRecord());
		assertEquals(1, sensor.getUsageRecords().size());
		assertEquals("Equipment status changed to RESERVED.", sensor.getUsageRecords().get(0).getStatusUpdate());
	}
	
	@Test
	void EquipmentSensorTest_consecutiveIN_USE() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		UsageRecord firstRecord = sensor.getLatestRecord();

		sensor.detectUsage(EquipmentStatus.IN_USE);
		assertEquals(firstRecord, sensor.getLatestRecord());
		assertEquals(0, sensor.getUsageRecords().size()); // still 0, no new record
	}
	
	@Test
	void EquipmentSensorTest_getUsageRecords_unmodifiable() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		sensor.detectUsage(EquipmentStatus.AVAILABLE);
		
		//Test getUsageRecords 
		List<UsageRecord> records = sensor.getUsageRecords();
		assertEquals(1, records.size());

		try {
			records.add(new UsageRecord());
			fail();
		} catch (Exception exc) {}

		try {
			records.remove(0);
			fail();
		} catch (Exception exc) {}
	}
	
	@Test
	void EquipmentSensorTest_generateRecordId() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		//Test generateRecordId
		sensor.detectUsage(EquipmentStatus.IN_USE);
		String recordId1 = sensor.getLatestRecord().getRecordId();
		assertNotNull(recordId1);
		assertEquals(true, recordId1.startsWith("UR-"));
		assertEquals(11, recordId1.length());

		sensor.detectUsage(EquipmentStatus.AVAILABLE);
		sensor.detectUsage(EquipmentStatus.IN_USE);
		String recordId2 = sensor.getLatestRecord().getRecordId();
		assertNotNull(recordId2);
		assertEquals(true, recordId2.startsWith("UR-"));
		assertEquals(11, recordId2.length());
		assertEquals(false, recordId1.equals(recordId2));
	}
	
	@Test
	void EquipmentSensorTest_detectUsageWithoutStartingUsage() {
		//Test detectUsage without starting usage
		Equipment equipment2 = new Equipment("E2", "Scanner", "Document Scanner", "LAS1002", 10.00);
		EquipmentSensor sensor2 = new EquipmentSensor(equipment2);

		sensor2.detectUsage(EquipmentStatus.AVAILABLE);
		assertEquals(EquipmentStatus.AVAILABLE, sensor2.getCurrentStatus());
		assertEquals(null, sensor2.getLatestRecord());
		assertEquals(0, sensor2.getUsageRecords().size());

		sensor2.detectUsage(EquipmentStatus.MAINTENANCE);
		assertEquals(EquipmentStatus.MAINTENANCE, sensor2.getCurrentStatus());
		assertEquals(null, sensor2.getLatestRecord());
		assertEquals(0, sensor2.getUsageRecords().size());

		sensor2.detectUsage(EquipmentStatus.DISABLED);
		assertEquals(EquipmentStatus.DISABLED, sensor2.getCurrentStatus());
		assertEquals(null, sensor2.getLatestRecord());
		assertEquals(0, sensor2.getUsageRecords().size());

		sensor2.detectUsage(EquipmentStatus.RESERVED);
		assertEquals(EquipmentStatus.RESERVED, sensor2.getCurrentStatus());
		assertEquals(null, sensor2.getLatestRecord());
		assertEquals(0, sensor2.getUsageRecords().size());
	}
	
	@Test
	void EquipmentSensorTest_detachObserver() {
		Equipment equipment = new Equipment("E1", "Printer", "Prints Stuff", "LAB101", 15.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		final int[] updateCount = {0};
		final int[] secondObserverCount = {0};
		
		Observer testObserver = new Observer() {
			@Override
			public void update(EquipmentStatus status) {
				updateCount[0]++;
			}
		};
		
		Observer observer2 = new Observer() {
			@Override
			public void update(EquipmentStatus status) {
				secondObserverCount[0]++;
			}
		};
		
		sensor.attach(testObserver);
		sensor.attach(observer2);
		
		sensor.detectUsage(EquipmentStatus.IN_USE);
		assertEquals(1, updateCount[0]);
		assertEquals(1, secondObserverCount[0]);

		sensor.detach(observer2);
		sensor.detectUsage(EquipmentStatus.AVAILABLE);
		assertEquals(2, updateCount[0]); 
		assertEquals(1, secondObserverCount[0]); 

		sensor.detach(null);
		sensor.detach(new Observer() {
			@Override
			public void update(EquipmentStatus status) {}
		});
	}
	
	@Test
	void EquipmentSensorTest_multipleRecords() {
		Equipment equipment = new Equipment("E3", "Camera", "Takes photos", "LAB103", 25.00);
		EquipmentSensor sensor = new EquipmentSensor(equipment);
		
		for (int i = 0; i < 3; i++) {
			sensor.detectUsage(EquipmentStatus.IN_USE);
			sensor.detectUsage(EquipmentStatus.AVAILABLE);
		}
		
		assertEquals(3, sensor.getUsageRecords().size());
		
		for (UsageRecord r : sensor.getUsageRecords()) {
			assertNotNull(r.getStartUsage());
			assertNotNull(r.getEndUsage());
			assertEquals(true, r.getEndUsage().isAfter(r.getStartUsage()));
		}
	}
	
	@Test
	void EquipmentSensorTest_endUsageOnlyOnce() {
		Equipment equipment4 = new Equipment("E4", "Projector", "Woah Projector", "LAS1004", 30.00);
		EquipmentSensor sensor4 = new EquipmentSensor(equipment4);

		sensor4.detectUsage(EquipmentStatus.IN_USE);
		UsageRecord currentRecord = sensor4.getLatestRecord();

		sensor4.detectUsage(EquipmentStatus.AVAILABLE);
		sensor4.detectUsage(EquipmentStatus.MAINTENANCE); 

		assertEquals(1, sensor4.getUsageRecords().size());
		assertEquals(currentRecord, sensor4.getUsageRecords().get(0));
	}


	
	@Test
	void EquipmentStatusObserverTest_constructorNullEquipment() {
	    //Test constructor with null equipment
	    Equipment eq1 = new Equipment("E1", "Printer", "Prints", "LAB1", 10.00);
	    EquipmentSensor s1 = new EquipmentSensor(eq1);
	    
	    try {
	        EquipmentStatusObserver o1 = new EquipmentStatusObserver(null, s1);
	        fail();
	    } catch (Exception exc) { }
	}
	
	@Test
	void EquipmentStatusObserverTest_constructorNullSensor() {
	    Equipment eq1 = new Equipment("E1", "Printer", "Prints", "LAB1", 10.00);
	    
	    //Test constructor with null sensor
	    try {
	        EquipmentStatusObserver o2 = new EquipmentStatusObserver(eq1, null);
	        fail();
	    } catch (Exception exc) {}
	}
	
	@Test
	void EquipmentStatusObserverTest_constructorAndGetters() {
	    //Test valid constructor and getters
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    assertEquals(eq2, obs.getEquipment());
	    assertEquals(s2, obs.getSensor());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateToIN_USE() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    // Test update method directly
	    assertEquals(EquipmentStatus.AVAILABLE, eq2.getStatus());
	    
	    obs.update(EquipmentStatus.IN_USE);
	    assertEquals(EquipmentStatus.IN_USE, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateToMAINTENANCE() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    obs.update(EquipmentStatus.MAINTENANCE);
	    assertEquals(EquipmentStatus.MAINTENANCE, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateToRESERVED() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    obs.update(EquipmentStatus.RESERVED);
	    assertEquals(EquipmentStatus.RESERVED, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateToDISABLED() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    obs.update(EquipmentStatus.DISABLED);
	    assertEquals(EquipmentStatus.DISABLED, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateToAVAILABLE() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    obs.update(EquipmentStatus.DISABLED);
	    obs.update(EquipmentStatus.AVAILABLE);
	    assertEquals(EquipmentStatus.AVAILABLE, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_multipleUpdatesInRow() {
	    Equipment eq2 = new Equipment("E2", "Scanner", "Scans", "LAS1006", 20.00);
	    EquipmentSensor s2 = new EquipmentSensor(eq2);
	    EquipmentStatusObserver obs = new EquipmentStatusObserver(eq2, s2);
	    
	    // Test multiple updates in a row
	    obs.update(EquipmentStatus.IN_USE);
	    assertEquals(EquipmentStatus.IN_USE, eq2.getStatus());
	    
	    obs.update(EquipmentStatus.MAINTENANCE);
	    assertEquals(EquipmentStatus.MAINTENANCE, eq2.getStatus());
	    
	    obs.update(EquipmentStatus.AVAILABLE);
	    assertEquals(EquipmentStatus.AVAILABLE, eq2.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_multipleObservers() {
	    Equipment eq3 = new Equipment("E3", "Camera", "Takes photos", "WSC104", 30.00);
	    Equipment eq4 = new Equipment("E4", "Projector", "Projects", "WSC105", 40.00);
	    EquipmentSensor s3 = new EquipmentSensor(eq3);
	    
	    EquipmentStatusObserver obs2 = new EquipmentStatusObserver(eq3, s3);
	    EquipmentStatusObserver obs3 = new EquipmentStatusObserver(eq4, s3);
	    
	    assertEquals(EquipmentStatus.AVAILABLE, eq3.getStatus());
	    assertEquals(EquipmentStatus.AVAILABLE, eq4.getStatus());
	    
	    obs2.update(EquipmentStatus.IN_USE);
	    assertEquals(EquipmentStatus.IN_USE, eq3.getStatus());
	    assertEquals(EquipmentStatus.AVAILABLE, eq4.getStatus());
	    
	    obs3.update(EquipmentStatus.MAINTENANCE);
	    assertEquals(EquipmentStatus.IN_USE, eq3.getStatus());
	    assertEquals(EquipmentStatus.MAINTENANCE, eq4.getStatus());
	}
	
	@Test
	void EquipmentStatusObserverTest_updateWithNull() {
	    //Test update with null
	    Equipment eq5 = new Equipment("E5", "Mouse", "Clicks", "SCOTT", 5.00);
	    EquipmentSensor s5 = new EquipmentSensor(eq5);
	    EquipmentStatusObserver obs4 = new EquipmentStatusObserver(eq5, s5);
	    
	    try {
	        obs4.update(null);
	        fail();
	    } catch (Exception exc) {}
	}


	
	@Test
	void UsageRecordTest_emptyConstructor() {
	    //Test empty constructor
	    UsageRecord r1 = new UsageRecord();
	    assertEquals(null, r1.getRecordId());
	    assertEquals(null, r1.getEquipmentId());
	    assertEquals(null, r1.getStartUsage());
	    assertEquals(null, r1.getEndUsage());
	    assertEquals(null, r1.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_setters() {
	    UsageRecord r1 = new UsageRecord();
	    
	    //Test setters
	    r1.setRecordId("123");
	    assertEquals("123", r1.getRecordId());
	    
	    r1.setEquipmentId("E1");
	    assertEquals("E1", r1.getEquipmentId());
	    
	    LocalDateTime start = LocalDateTime.now();
	    r1.setStartUsage(start);
	    assertEquals(start, r1.getStartUsage());
	    
	    LocalDateTime end = start.plusHours(2);
	    r1.setEndUsage(end);
	    assertEquals(end, r1.getEndUsage());
	    
	    r1.setStatusUpdate("Started using");
	    assertEquals("Started using", r1.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_constructorWithAllParams() {
	    // Test constructor with all params
	    LocalDateTime t1 = LocalDateTime.of(2024, 1, 1, 9, 0);
	    LocalDateTime t2 = LocalDateTime.of(2024, 1, 1, 11, 0);
	    UsageRecord r2 = new UsageRecord("ABC", "EQ2", t1, t2, "Done");
	    
	    assertEquals("ABC", r2.getRecordId());
	    assertEquals("EQ2", r2.getEquipmentId());
	    assertEquals(t1, r2.getStartUsage());
	    assertEquals(t2, r2.getEndUsage());
	    assertEquals("Done", r2.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_updateValues() {
	    LocalDateTime t1 = LocalDateTime.of(2024, 1, 1, 9, 0);
	    LocalDateTime t2 = LocalDateTime.of(2024, 1, 1, 11, 0);
	    UsageRecord r2 = new UsageRecord("ABC", "EQ2", t1, t2, "Done");
	    
	    //Test updating values
	    r2.setRecordId("wasd");
	    assertEquals("wasd", r2.getRecordId());
	    
	    r2.setEquipmentId("E3");
	    assertEquals("E3", r2.getEquipmentId());
	    
	    LocalDateTime t3 = LocalDateTime.of(2024, 2, 1, 10, 0);
	    r2.setStartUsage(t3);
	    assertEquals(t3, r2.getStartUsage());
	    
	    LocalDateTime t4 = LocalDateTime.of(2024, 2, 1, 12, 0);
	    r2.setEndUsage(t4);
	    assertEquals(t4, r2.getEndUsage());
	    
	    r2.setStatusUpdate("New status");
	    assertEquals("New status", r2.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_setNullValues() {
	    UsageRecord r3 = new UsageRecord();
	    r3.setRecordId(null);
	    assertEquals(null, r3.getRecordId());
	    
	    r3.setEquipmentId(null);
	    assertEquals(null, r3.getEquipmentId());
	    
	    r3.setStartUsage(null);
	    assertEquals(null, r3.getStartUsage());
	    
	    r3.setEndUsage(null);
	    assertEquals(null, r3.getEndUsage());
	    
	    r3.setStatusUpdate(null);
	    assertEquals(null, r3.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_partialData() {
	    UsageRecord r4 = new UsageRecord();
	    r4.setRecordId("PARTIAL");
	    r4.setEquipmentId("E4");
	    r4.setStartUsage(LocalDateTime.now());
	    
	    assertEquals("PARTIAL", r4.getRecordId());
	    assertEquals("E4", r4.getEquipmentId());
	    assertNotNull(r4.getStartUsage());
	    assertEquals(null, r4.getEndUsage());
	    assertEquals(null, r4.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_toString() {
	    LocalDateTime x1 = LocalDateTime.of(2024, 3, 15, 14, 30);
	    LocalDateTime x2 = LocalDateTime.of(2024, 3, 15, 16, 45);
	    UsageRecord r5 = new UsageRecord("test", "E5", x1, x2, "test record");
	    
	    String str = r5.toString();
	    assertTrue(str.contains("test"));
	    assertTrue(str.contains("E5"));
	    assertTrue(str.contains("2024-03-15T14:30"));
	    assertTrue(str.contains("2024-03-15T16:45"));
	    assertTrue(str.contains("test record"));
	}
	
	@Test
	void UsageRecordTest_endBeforeStart() {
	    LocalDateTime late = LocalDateTime.of(2024, 5, 1, 15, 0);
	    LocalDateTime early = LocalDateTime.of(2024, 5, 1, 14, 0);
	    UsageRecord r6 = new UsageRecord("BAD", "E6", late, early, "Wrong order");
	    
	    assertEquals(late, r6.getStartUsage());
	    assertEquals(early, r6.getEndUsage());
	    assertTrue(r6.getEndUsage().isBefore(r6.getStartUsage()));
	}
	
	@Test
	void UsageRecordTest_multipleRecords() {
	    UsageRecord r7 = new UsageRecord();
	    r7.setRecordId("ID1");
	    r7.setEquipmentId("EQ1");
	    r7.setStartUsage(LocalDateTime.now());
	    r7.setEndUsage(LocalDateTime.now().plusHours(1));
	    r7.setStatusUpdate("First");
	    
	    UsageRecord r8 = new UsageRecord();
	    r8.setRecordId("ID2");
	    r8.setEquipmentId("EQ2");
	    r8.setStartUsage(LocalDateTime.now().plusDays(1));
	    r8.setEndUsage(LocalDateTime.now().plusDays(1).plusHours(2));
	    r8.setStatusUpdate("Second");
	    
	    assertEquals("ID1", r7.getRecordId());
	    assertEquals("EQ1", r7.getEquipmentId());
	    assertEquals("First", r7.getStatusUpdate());
	    
	    assertEquals("ID2", r8.getRecordId());
	    assertEquals("EQ2", r8.getEquipmentId());
	    assertEquals("Second", r8.getStatusUpdate());
	}
	
	@Test
	void UsageRecordTest_setEndAfterCreation() {
	    UsageRecord r9 = new UsageRecord();
	    r9.setStartUsage(LocalDateTime.now());
	    assertEquals(null, r9.getEndUsage());
	    
	    LocalDateTime later = LocalDateTime.now().plusMinutes(30);
	    r9.setEndUsage(later);
	    assertEquals(later, r9.getEndUsage());
	}
}