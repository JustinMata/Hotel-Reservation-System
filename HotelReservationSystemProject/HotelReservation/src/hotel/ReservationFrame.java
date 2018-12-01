package hotel;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ReservationFrame {
	
	public ReservationFrame()
	{
	}

	public void makeReservationFrame(){
		
		JFrame frame = new JFrame();
		final JLabel text = new JLabel("What would you like to do? ");
		
		//add "Sign up" and "Sign in" buttons
		JButton makeReservationButton = new JButton("Make a Reservation");
		JButton ViewCancelButton = new JButton("View/Cancel a Reservation");
		
		
		//add MouseListener to buttons
		makeReservationButton.addMouseListener(
				new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						makeReservation();
						frame.dispose();
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
		
		ViewCancelButton.addMouseListener(
				new MouseListener(){

					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
						frame.dispose();
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
		
		frame.setLayout(new FlowLayout());
		frame.add(text);
		frame.add(makeReservationButton);
		frame.add(ViewCancelButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public void makeReservation()
	{
		JFrame frame = new JFrame();
		final JLabel text = new JLabel("Room type: ");
		
		//add "Sign up" and "Sign in" buttons
		JButton luxuriousButton = new JButton("$300");
		JButton economicButton = new JButton("$100");
		JButton showAllButton = new JButton("Show Me Available Rooms");
		
		
		frame.setLayout(new FlowLayout());
		
		//TODO need to add in the selectable date stuffs//
		
		frame.add(text);
		frame.add(luxuriousButton);
		frame.add(economicButton);
		frame.add(showAllButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
