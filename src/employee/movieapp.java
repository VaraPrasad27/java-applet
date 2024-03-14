package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;

public class movieapp {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movieapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setBounds(190, 21, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		tb1 = new JTextField();
		tb1.setBounds(190, 70, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_2.setBounds(92, 104, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NAME");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setForeground(new Color(128, 0, 128));
		lblNewLabel_3.setBounds(92, 73, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TICKET");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setForeground(new Color(128, 0, 128));
		lblNewLabel_4.setBounds(92, 138, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "1", "2", "3", "4", "5", "6", "7"}));
		cb2.setBounds(190, 134, 86, 22);
		frame.getContentPane().add(cb2);
		

		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "RRR", "KGF", "GAAMI"}));
		cb1.setBounds(190, 101, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill = 0;
				String name = tb1.getText();
				String movie = (String) cb1.getSelectedItem();
				String tickets = (String) cb2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				if(movie.equals("RRR"))
					bill = bill+150*nt;
				if(movie.equals("KGF"))
					bill = bill+200*nt;
				if(movie.equals("GAAMI"))
					bill =bill+100*nt;
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton, "NAME "+name+"\n MOVIE "+movie+"\n NO.OF TICKETS "+tickets+"\n AMOUNT "+bill);
				int YES_OPTION = 0;
				if(res == YES_OPTION )
					JOptionPane.showMessageDialog(btnNewButton, "booking conformed");
				else
					JOptionPane.showMessageDialog(btnNewButton, "booking cancled");
			}
		});
		btnNewButton.setBounds(161, 185, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\photo-old-movie-projector-260nw-92369284.jpg"));
		lblNewLabel.setBounds(22, 11, 390, 239);
		frame.getContentPane().add(lblNewLabel);
	}
}
