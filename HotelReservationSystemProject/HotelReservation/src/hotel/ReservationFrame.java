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
		final int FIELD_WIDTH = 30;
		final JTextField text = new JTextField(FIELD_WIDTH);
		
		//add "Sign up" and "Sign in" buttons
		JButton makeReservationButton = new JButton("Make a Reservation");
		JButton ViewCancelButton = new JButton("View/Cancel a Reservation");
		
		
		//add MouseListener to buttons
		makeReservationButton.addMouseListener(
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
}