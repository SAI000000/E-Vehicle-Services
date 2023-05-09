package vehiclebody;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class cleanmod extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cleanmod frame = new cleanmod();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cleanmod() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(230, 230, 250));
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setFont(new Font("Trebuchet MS", Font.ITALIC, 26));
		btnSubmit.setBorder(new LineBorder(new Color(0, 255, 255), 3, true));
		btnSubmit.setBounds(661, 612, 195, 49);
		contentPane.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setBorder(new LineBorder(new Color(0, 255, 255), 3, true));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.ITALIC, 26));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(317, 612, 195, 49);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Select Nearest Center   ~");
		lblNewLabel_1_1_1_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_1_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		lblNewLabel_1_1_1_1.setBounds(82, 494, 267, 60);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tw Cen MT", Font.ITALIC, 22));
		comboBox_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		comboBox_1.setBackground(new Color(255, 250, 250));
		comboBox_1.setBounds(866, 331, 230, 44);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Cleaning &  Polish");
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 79));
		lblNewLabel.setBounds(82, 52, 1291, 126);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fill your details    ~");
		lblNewLabel_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 28));
		lblNewLabel_1.setBounds(92, 207, 305, 60);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = 	new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setBounds(382, 416, 230, 44);
		contentPane.add(comboBox);
		comboBox.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		comboBox.setBackground(new Color(255, 250, 250));
		comboBox.setFont(new Font("Tw Cen MT", Font.ITALIC, 22));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Car Interior Cleaning", "Deep All Round Cleaning", "Car Rubbing & Polishing"}));
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		textField.setBounds(382, 334, 230, 44);
		contentPane.add(textField);
		textField.setBackground(new Color(255, 250, 250));
		textField.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vehicle No   ~");
		lblNewLabel_1_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_1.setBounds(182, 320, 159, 60);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Cleaning types   ~");
		lblNewLabel_1_1_1.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_1_1.setBounds(160, 405, 181, 60);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Vehicle Name   ~");
		lblNewLabel_1_1_2.setForeground(new Color(230, 230, 250));
		lblNewLabel_1_1_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 22));
		lblNewLabel_1_1_2.setBounds(675, 320, 181, 60);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\201021.jpg"));
		lblNewLabel_2.setBounds(0, 0, 1526, 763);
		contentPane.add(lblNewLabel_2);
	}
}
