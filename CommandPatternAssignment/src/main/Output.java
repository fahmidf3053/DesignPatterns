package main;

import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Output {
	int i;
	JFrame frame;
	JPanel panel;
	Graphics2D g2d;
	int x,y,x1,y1,r;
	double r1;
	Command command= new Command();
	Circle circle;
	public Output() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.BLACK);
		panel.setBounds(10, 11, 386, 345);
		frame.getContentPane().add(panel);
		int cordinates[][]=new int[2][2];
		i=0;
		
		
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(i<2) {
					cordinates[i][0]=e.getX();
					cordinates[i][1]=e.getY();
					i=i+1;
					System.out.println(e.getX() + "," + e.getY());
				}
				else {
					i=0;
				}
				
//				x=e.getX();
//				y=e.getY();
//				x1=e.getX();
//				y1=e.getY();
//				r1=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
//				System.out.println(r1);
//				r=(int) r1;
//				circle = new Circle(x,y,r);
//				System.out.println(e.getX() + "," + e.getY());	
			}
		});
		
		
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r1=Math.sqrt((cordinates[0][0]-cordinates[1][0])*(cordinates[0][0]-cordinates[1][0])+(cordinates[0][1]-cordinates[1][1])*(cordinates[0][1]-cordinates[1][1]));
				System.out.println(r1);
				r=(int) r1;
				g2d=(Graphics2D)panel.getGraphics();
				circle = new Circle(cordinates[0][0],cordinates[0][1],r);
				circle.draw(g2d);
				command.addCommand(new Draw(circle,g2d));
			}
		});
		btnDraw.setBounds(414, 30, 89, 23);
		frame.getContentPane().add(btnDraw);
		
		JButton btnVanish = new JButton("Vanish");
		btnVanish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				circle.vanish(g2d);
				command.addCommand(new Vanish(circle,g2d));
			}
		});
		btnVanish.setBounds(414, 64, 89, 23);
		frame.getContentPane().add(btnVanish);
		
		JButton btnExpand = new JButton("Expand");
		btnExpand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circle.expand(g2d);
				command.addCommand(new Expand(circle,g2d));
			}
		});
		btnExpand.setBounds(414, 101, 89, 23);
		frame.getContentPane().add(btnExpand);
		
		JButton btnShrink = new JButton("Shrink");
		btnShrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circle.shrink(g2d);
				command.addCommand(new Shrink(circle,g2d));
			}
		});
		btnShrink.setBounds(414, 135, 89, 23);
		frame.getContentPane().add(btnShrink);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				command.undo();
			}
		});
		btnUndo.setBounds(414, 169, 89, 23);
		frame.getContentPane().add(btnUndo);
		
		JButton btnRedo = new JButton("Redo");
		btnRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				command.redo();
			}
		});
		btnRedo.setBounds(414, 203, 89, 23);
		frame.getContentPane().add(btnRedo);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
				i=0;
			}
		});
		btnClear.setBounds(152, 367, 89, 23);
		frame.getContentPane().add(btnClear);
	}
}
