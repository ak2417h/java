import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class tictactoe extends JFrame {

	private JPanel contentPane;
	
	boolean p = true;

	private String[][] arr = {
	{null,null,null},
	{null,null,null},
	{null,null,null},
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tictactoe frame = new tictactoe();
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
	public tictactoe() {
		
		
		Border blackline = BorderFactory.createLineBorder(Color.black,2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[0][0] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l1.setIcon(new ImageIcon(img));						
				}
				else {
					arr[0][0] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l1.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l1.setBounds(10, 11, 167, 141);
		contentPane.add(l1);
		l1.setBorder(blackline);
		
		JLabel l2 = new JLabel("");
		l2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[0][1] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l2.setIcon(new ImageIcon(img));						
				}
				else {
					arr[0][1] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l2.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l2.setBounds(218, 11, 167, 141);
		contentPane.add(l2);
		l2.setBorder(blackline);
		
		JLabel l3 = new JLabel("");
		l3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[0][2] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l3.setIcon(new ImageIcon(img));						
				}
				else {
					arr[0][2] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l3.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l3.setBounds(424, 11, 167, 141);
		contentPane.add(l3);
		l3.setBorder(blackline);
		
		JLabel l5 = new JLabel("");
		l5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[1][1] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l5.setIcon(new ImageIcon(img));						
				}
				else {
					arr[1][1] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l5.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l5.setBounds(218, 181, 167, 141);
		contentPane.add(l5);
		l5.setBorder(blackline);
		
		JLabel l8 = new JLabel("");
		l8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (l8.getIcon() == null) {
					if (p) {
						arr[2][1] = "o";
						Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l8.setIcon(new ImageIcon(img));						
					}
					else {
						arr[2][1] = "x";
						Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
						l8.setIcon(new ImageIcon(img));
					}
					p = !p;					
				}
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l8.setBounds(218, 348, 167, 141);
		contentPane.add(l8);
		l8.setBorder(blackline);
		
		JLabel l4 = new JLabel("");
		l4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[1][0] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l4.setIcon(new ImageIcon(img));						
				}
				else {
					arr[1][0] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l4.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l4.setBounds(10, 181, 167, 141);
		contentPane.add(l4);
		l4.setBorder(blackline);
		
		JLabel l6 = new JLabel("");
		l6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[1][2] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l6.setIcon(new ImageIcon(img));						
				}
				else {
					arr[1][2] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l6.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l6.setBounds(424, 181, 167, 141);
		contentPane.add(l6);
		l6.setBorder(blackline);
		
		JLabel l9 = new JLabel("");
		l9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[2][2] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l9.setIcon(new ImageIcon(img));						
				}
				else {
					arr[2][2] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l9.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l9.setBounds(424, 348, 167, 141);
		contentPane.add(l9);
		l9.setBorder(blackline);
		
		JLabel l7 = new JLabel("");
		l7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (p) {
					arr[2][0] = "o";
					Image img = new ImageIcon("images/o.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l7.setIcon(new ImageIcon(img));						
				}
				else {
					arr[2][0] = "x";
					Image img = new ImageIcon("images/x.png").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(),Image.SCALE_SMOOTH);
					l7.setIcon(new ImageIcon(img));
				}
				p = !p;
				System.out.println(Arrays.toString(arr[0]));
				System.out.println(Arrays.toString(arr[1]));
				System.out.println(Arrays.toString(arr[2]));
				System.out.println();
			}
		});
		l7.setBounds(10, 348, 167, 141);
		contentPane.add(l7);
		l7.setBorder(blackline);
	}
}
