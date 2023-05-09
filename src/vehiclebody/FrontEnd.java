package vehiclebody;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrontEnd extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd frame = new FrontEnd();
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
	public FrontEnd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1540, 800);
		
		
		cleanmod cm=new cleanmod();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Services");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Accessories");
	
		
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("Help");
		menuBar.add(mnNewMenu_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel hompan = new JPanel();
		hompan.setBackground(new Color(224, 255, 255));
		hompan.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		hompan.setBounds(10, 10, 1503, 719);
		contentPane.add(hompan);
		hompan.setLayout(null);
		
		JLabel down = new JLabel("");
		down.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		down.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\downscrolls.png"));
		down.setBounds(748, 433, 59, 58);
		hompan.add(down);
		
		JLabel uparr = new JLabel("");
		
			uparr.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\upscroll.png"));
			uparr.setBounds(748, 372, 59, 58);
			hompan.add(uparr);
			
			JLabel schlbl = new JLabel("Periodic Services");
			schlbl.setBounds(64, 205, 179, 38);
			schlbl.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
			hompan.add(schlbl);
			
			JLabel perio = new JLabel("");
			perio.setBounds(418, 509, 132, 76);
			perio.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\periodicimage1.png"));
			perio.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(perio);
			
			JLabel acre = new JLabel("");
			acre.setBounds(255, 253, 132, 106);
			acre.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\AC1.png"));
			acre.setHorizontalTextPosition(SwingConstants.LEADING);
			acre.setAlignmentY(Component.TOP_ALIGNMENT);
			acre.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(acre);
			
			JLabel batt = new JLabel("");
			batt.setBounds(397, 268, 132, 85);
			batt.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\tyer battery1.png"));
			batt.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(batt);
			
			JLabel tywh = new JLabel("");
			tywh.setBounds(548, 268, 132, 86);
			tywh.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\tyre1.png"));
			tywh.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(tywh);
			
			JLabel periolbl = new JLabel("Periodic Services");
			periolbl.setBounds(424, 615, 132, 25);
			periolbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(periolbl);
			
			JLabel aclbl = new JLabel("AC Repair");
			aclbl.setBounds(276, 372, 100, 25);
			aclbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(aclbl);
			
			JLabel battlbl = new JLabel("Batteries");
			battlbl.setBounds(426, 372, 92, 25);
			battlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(battlbl);
			
			JLabel tywhlbl = new JLabel("Coolant & Oil Change");
			tywhlbl.setBounds(558, 372, 154, 25);
			tywhlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(tywhlbl);
			
			JLabel mechlbl = new JLabel("Mechanical Repairs");
			mechlbl.setBounds(64, 453, 206, 38);
			mechlbl.setFont(new Font("Yu Gothic UI", Font.BOLD, 20));
			hompan.add(mechlbl);
			
			JLabel dent = new JLabel("");
			dent.setBounds(64, 514, 132, 91);
			dent.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\Body Paint1.png"));
			dent.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(dent);
			
			JLabel dentlbl = new JLabel("Denting & Painting");
			dentlbl.setBounds(64, 615, 145, 25);
			dentlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(dentlbl);
			
			JLabel suspen = new JLabel("");
			suspen.setBounds(240, 514, 132, 91);
			suspen.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\suspen1.png"));
			suspen.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(suspen);
			
			JLabel suspenlbl = new JLabel("Suspension & Fitments");
			suspenlbl.setBounds(224, 615, 163, 25);
			suspenlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(suspenlbl);
			
			
			
			JLabel clean = new JLabel("");
			clean.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					cm.setVisible(true);
				}
			});
			clean.setBounds(85, 253, 132, 106);
			clean.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\detail1.png"));
			clean.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(clean);
			
			JLabel cleanlbl = new JLabel("Cleaning & Polishing");
			cleanlbl.setBounds(85, 372, 148, 25);
			cleanlbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(cleanlbl);
			
			JLabel body = new JLabel("");
			body.setBounds(580, 509, 132, 91);
			body.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\Clutch1.png"));
			body.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(body);
			
			JLabel bodylbl = new JLabel("Body Parts");
			bodylbl.setBounds(607, 615, 84, 25);
			bodylbl.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			hompan.add(bodylbl);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(42, 426, 684, 17);
			separator.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
			hompan.add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBounds(843, 224, 16, 448);
			separator_1.setBorder(new MatteBorder(0, 4, 0, 0, (Color) new Color(0, 0, 0)));
			hompan.add(separator_1);
			
			JLabel lblNewLabel_4_1_2_1 = new JLabel("");
			lblNewLabel_4_1_2_1.setBounds(1040, 224, 313, 344);
			lblNewLabel_4_1_2_1.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\ins3.png"));
			lblNewLabel_4_1_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 16));
			hompan.add(lblNewLabel_4_1_2_1);
			
			JLabel lblInsuranceClaims = new JLabel("Insurance Claims");
			lblInsuranceClaims.setBounds(1105, 567, 206, 38);
			lblInsuranceClaims.setFont(new Font("Yu Gothic UI", Font.BOLD, 24));
			hompan.add(lblInsuranceClaims);
			
			JLabel lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setBounds(42, 20, 834, 194);
			lblNewLabel_5.setIcon(new ImageIcon("E:\\Java eclipse\\E-VehicleService\\Free Car Logo2.png"));
			hompan.add(lblNewLabel_5);
//			uparr.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					schlbl.setBounds(64, 205, 179, 38);
//					
//					
//					perio.setBounds(77, 278, 132, 76);
//					periolbl.setBounds(87, 364, 132, 25);
//
//					acre.setBounds(255, 253, 132, 106);
//					aclbl.setBounds(278, 364, 100, 25);
//
//					batt.setBounds(397, 268, 132, 85);
//					battlbl.setBounds(421, 364, 92, 25);
//
//					tywh.setBounds(548, 268, 132, 86);
//					tywhlbl.setBounds(558, 364, 132, 25);
//					
//					mechlbl.setBounds(64, 453, 206, 38);
//
//
//					dent.setBounds(64, 514, 132, 91);
//					dentlbl.setBounds(64, 615, 145, 25);
//
//					suspen.setBounds(240, 514, 132, 91);
//					suspenlbl.setBounds(224, 615, 163, 25);
//
//					clean.setBounds(409, 503, 132, 106);
//					cleanlbl.setBounds(419, 615, 118, 25);
//
//					body.setBounds(560, 514, 132, 91);
//					bodylbl.setBounds(584, 615, 84, 25);
//
//					schlbl.setVisible(true);
//					perio.setVisible(true);
//					acre.setVisible(true);
//					batt.setVisible(true);
//					tywh.setVisible(true);
//					periolbl.setVisible(true);
//					aclbl.setVisible(true);
//					battlbl.setVisible(true);
//					tywhlbl.setVisible(true);
//					mechlbl.setVisible(true);
//					dent.setVisible(true);
//					suspen.setVisible(true);
//					clean.setVisible(true);
//					body.setVisible(true);
//					dentlbl.setVisible(true);
//					suspenlbl.setVisible(true);
//					cleanlbl.setVisible(true);
//					bodylbl.setVisible(true);
//					
//
//				}
//			});
//			down.addMouseListener(new MouseAdapter() {
//				@Override
//				public void mouseClicked(MouseEvent e) {
//					schlbl.setVisible(false);
//					perio.setVisible(false);
//					acre.setVisible(false);
//					batt.setVisible(false);
//					tywh.setVisible(false);
//					periolbl.setVisible(false);
//					aclbl.setVisible(false);
//					battlbl.setVisible(false);
//					tywhlbl.setVisible(false);
//					mechlbl.setVisible(false);
//					dent.setVisible(false);
//					suspen.setVisible(false);
//					clean.setVisible(false);
//					body.setVisible(false);
//					dentlbl.setVisible(false);
//					suspenlbl.setVisible(false);
//					cleanlbl.setVisible(false);
//					bodylbl.setVisible(false);
//					
//				}
//			});
//		
		mnNewMenu_2.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
			}
			public void menuDeselected(MenuEvent e) {
				//accspan.setVisible(false);
			}
			public void menuSelected(MenuEvent e) {
				//accspan.setVisible(true);
			}
		});
		mnNewMenu.addMenuListener(new MenuListener() {
			public void menuCanceled(MenuEvent e) {
//				hompan.setVisible(false);
			}
			public void menuDeselected(MenuEvent e) {
//				hompan.setVisible(false);
			}
			public void menuSelected(MenuEvent e) {
//				hompan.setVisible(true);
			}
		});
		
	}
}
