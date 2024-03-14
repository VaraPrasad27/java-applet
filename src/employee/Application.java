package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Application {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application window = new Application();
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
	public Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(33, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No.");
		lblNewLabel_1.setBounds(33, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Branch");
		lblNewLabel_2.setBounds(33, 103, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(115, 50, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setBounds(33, 132, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBackground(new Color(135, 206, 235));
		r1.setBounds(92, 128, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBackground(new Color(135, 206, 235));
		r2.setBounds(215, 128, 109, 23);
		frame.getContentPane().add(r2);
		
		tb2 = new JTextField();
		tb2.setBounds(115, 75, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JCheckBox c1 = new JCheckBox("Python");
		c1.setBackground(new Color(135, 206, 235));
		c1.setBounds(104, 154, 97, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Java");
		c2.setBackground(new Color(135, 206, 235));
		c2.setBounds(215, 154, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("C");
		c3.setBackground(new Color(135, 206, 235));
		c3.setBounds(314, 154, 97, 23);
		frame.getContentPane().add(c3);
		
		JLabel lblNewLabel_4 = new JLabel("Language(s)");
		lblNewLabel_4.setBounds(33, 157, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"--SELECT--", "CSE", "CSE - AIML", "DS", "CS", "IOT", "IT", "EEE", "ECE", "CIVIL"}));
		cb1.setBounds(115, 99, 86, 20);
		frame.getContentPane().add(cb1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(135, 206, 235));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = tb1.getText();
				String roll = tb2.getText();
				String branch = (String) cb1.getSelectedItem();
				String gender = " ";
				String langs = " ";
				if(r1.isSelected()) {
					gender = "Male";
				}
				if(r2.isSelected()) {
					gender = "Female";
				}
				if(c1.isSelected()) {
					langs = langs+"Python";
				}
				if(c2.isSelected()) {
					langs = langs+" Java";
				}
				if(c3.isSelected()) {
					langs = langs+" C";
				}
				JOptionPane.showMessageDialog(btnNewButton, "NAME "+name+"\n ROLL "+roll+"\n BRANCH "+branch+"\n GENDER "+gender+"\n Languages"+langs);
			}
		});
		btnNewButton.setBounds(170, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Student Application");
		lblNewLabel_5.setBounds(178, 11, 97, 14);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
