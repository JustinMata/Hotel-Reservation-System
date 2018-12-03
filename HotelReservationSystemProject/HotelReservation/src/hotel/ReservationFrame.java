package hotel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.*;

public class ReservationFrame {
	final int FIELD_WIDTH = 20;
	public ReservationFrame()
	{
	}

	public void makeReservationFrame(){
		
		JFrame frame = new JFrame();
		final JLabel text = new JLabel("What would you like to do? ");
		
		//add "Make a Reservation" and "makeReservationButton" buttons
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
		final JLabel roomTypeText = new JLabel("Room type: ");
		
		//add "Sign up" and "Sign in" buttons
		JButton luxuriousButton = new JButton("$300");
		JButton economicButton = new JButton("$100");
		JButton showAllButton = new JButton("Show Me Available Rooms");
		
		//create Check in and Check out Date options
		JPanel cont1 = new JPanel();
		JPanel cont2 = new JPanel();
		final JLabel checkInText = new JLabel("Check in");
		final JLabel checkOutText = new JLabel("Check out");
		//make this open GUI calendar
		JTextField checkInDate = new JTextField(FIELD_WIDTH);
		JTextField checkOutDate = new JTextField(FIELD_WIDTH);
		
		
		
		
		//add MouseListeners to buttons
		luxuriousButton.addMouseListener(
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
		economicButton.addMouseListener(
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
		showAllButton.addMouseListener(
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
		
		
		
		frame.setLayout(new BorderLayout());
		
		//frame.getContentPane().add(cont1);
		frame.add(cont1, BorderLayout.PAGE_START);
		frame.setSize(400, 300);
		
		//TODO need to add in the selectable date stuffs/////////////
		cont1.add(checkInText);
		cont1.add(checkInDate);
		cont1.add(checkOutText);
		cont1.add(checkOutDate);
		
		
		cont2.add(roomTypeText);
		cont2.add(luxuriousButton);
		cont2.add(economicButton);
		cont2.add(showAllButton);
		frame.add(cont2, BorderLayout.PAGE_END);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public String toString(String room, String start, String end){
		return String.format("Room #: "+room+" Start date: "+start+" End date: "+end+"\n");
	}
	
	
	
	//////////NEED TO FINISH
	public void viewCancelReservation(){
		JFrame frame = new JFrame();
		final JLabel reservationsText = new JLabel("Your room reservations: ");
		
		//add "Sign up" and "Sign in" buttons
		JButton cancelButton = new JButton("Cancel");
		
		//create Check in and Check out Date options
		JPanel cont1 = new JPanel();

		String userID = User.getId();
		File userList = new File("reservations.txt");
	    try {
		Scanner in = new Scanner(new FileReader(userList));
		
		while(in.hasNextLine()){
			
				String currentLine = in.nextLine();
				String[] split = currentLine.split(",");
				
				String tempID = split[0];
				
				if (tempID.equals(userID)){
					JPanel panel = new JPanel();
					String listing = toString(split[3],split[1],split[2]);
					JTextField aListing = new JTextField(listing);
					
					panel.setLayout(new FlowLayout());
					panel.add(aListing);
					panel.add(cancelButton);
					
					//add MouseListeners to buttons
					cancelButton.addMouseListener(
							new MouseListener(){

								@Override
								public void mouseClicked(MouseEvent e) {
									// TODO Auto-generated method stub
									//TODO figure out how to delete text from files
									
									
									frame.repaint();
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
					
					
				}
				
				
				
	        }	
		}

	        
	     catch (IOException e1) {e1.printStackTrace();}
	
	
		
		
		
		frame.setLayout(new BorderLayout());
		
		
		frame.setSize(400, 300);
		
		//TODO need to add in the selectable date stuffs/////////////
		cont1.add(cancelButton);
		frame.add(reservationsText, BorderLayout.PAGE_START);
		frame.add(cont1, BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
//part of Stina and Mata's code from Room
	public void isAvailable(Date start, Date end) throws ParseException {
		boolean roomAvail = false;
		
				File userList = new File("reservations.txt");
			    try {
				Scanner in = new Scanner(new FileReader(userList));
				while(in.hasNextLine()){
					
						String currentLine = in.nextLine();
						String[] split = currentLine.split(",");
						
						//changes dates in file to Date object
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						Date startDate = dateFormat.parse(split[2]); //check this
						Date endDate = dateFormat.parse(split[3]); //check this
						
				        if(((startDate.after(start) || startDate.equals(start))
				  	          && (startDate.before(end)) || startDate.equals(end))
				  	          ||  ((endDate.after(start) || endDate.equals(start)) 
				                && (endDate.before(end) || endDate.equals(end)))){
				        	roomAvail = false;}
				         if (roomAvail==true)
				        {
				        	ReservationFrame resFrame = new ReservationFrame();
				        	resFrame.makeReservationFrame();
				        	break;
				        }
			        }	
				}
	
			        
			     catch (IOException e1) {e1.printStackTrace();}
	}
	
	
}
