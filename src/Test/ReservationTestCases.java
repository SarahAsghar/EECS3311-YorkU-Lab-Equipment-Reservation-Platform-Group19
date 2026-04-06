package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import org.junit.*;
import model.Reservation.*;

public class ReservationTestCases {

	@Test
	void reservationSetterTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		r.setState(new CompletedState());
		
		assertEquals(r.getState(), new CompletedState());
	}
	
	@Test
	void reservationExtendReservationTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		r.extendReservation(LocalDateTime.parse("2026-06-06T17:00:00"));
		
		assertEquals(r.getEndTime(), LocalDateTime.parse("2026-06-06T17:00:00"));
	}
	
	@Test
	void reservationCancelReservationTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		Reservation temp = r.cancelReservation();
		
		assertEquals(r, temp);
	}
	
	@Test
	void reservationGetReservationIdTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		String str = r.getReservationId();
		
		assertEquals("1000", str);
	}
	
	@Test
	void reservationGetEquipmentIDTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		String str = r.getEquipmentID();
		
		assertEquals("1001", str);
	}
	
	@Test
	void reservationGetStartTimeTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		LocalDateTime time = r.getStartTime();
		
		assertEquals(LocalDateTime.parse("2026-06-06T14:30:00"), time);
	}
	
	@Test
	void reservationGetEndTimeTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		LocalDateTime time = r.getEndTime();
		
		assertEquals(LocalDateTime.parse("2026-06-06T14:30:00"), time);
	}
	
	@Test
	void reservationGetReservationStateTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		ReservationState state = r.getState();
		
		assertNotNull(state);
	}
	
	@Test
	void reservationCalcukateHoursTest() {
		Reservation r = new Reservation("1000", "1001", LocalDateTime.parse("2026-06-06T14:30:00"), LocalDateTime.parse("2026-06-06T16:00:00"), new ActiveState());
		double ans = r.calculateHours();
		
		assertEquals(1.50, ans);
	}
	
	
	
}
