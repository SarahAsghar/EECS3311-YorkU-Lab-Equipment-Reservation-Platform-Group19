package view;

import javax.swing.JPanel;

import model.Reservation.Reservation;

public class ReservationView {
	private JPanel ReservationViewPanel;
	
	public ReservationView() {
		
	}
	
	public ReservationView(Reservation selectedReservation) {
		
	}

	public void setReservationViewVisibility(boolean b) {
		ReservationViewPanel.setVisible(b);
	}

}
