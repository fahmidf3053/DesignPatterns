package main;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Output {
	int i;
	public JFrame frame;
	JPanel panel;
	Graphics2D g2d;
	
	
	public Output() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 11, 286, 211);
		frame.getContentPane().add(panel);
		int cordinates[][]=new int[4][2];
		i=0;
		
		panel.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(i<4) {
					cordinates[i][0]=e.getX();
					cordinates[i][1]=e.getY();
					i=i+1;
					System.out.println(e.getX() + "," + e.getY());
				}
				else {
					JOptionPane.showMessageDialog(frame,"Can not click more than 4 times!\n Try Again....");
					i=0;
					
				}
				
				
			}
		});
		
		
		JButton btnNewButton = new JButton("Line");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g2d=(Graphics2D)panel.getGraphics();
				IShape line=new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				line.draw(g2d);
				i=0;
				 
			}
		});
		btnNewButton.setBounds(306, 11, 118, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReactangle = new JButton("Reactangle");
		btnReactangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Line l1 = new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				Line l2 = new Line(cordinates[1][0],cordinates[1][1],cordinates[2][0],cordinates[2][1]);
				Line l3 = new Line(cordinates[2][0],cordinates[2][1],cordinates[3][0],cordinates[3][1]);
				Line l4 = new Line(cordinates[3][0],cordinates[3][1],cordinates[0][0],cordinates[0][1]);
				IShape rec = new Reactangle(l1,l2,l3,l4);
				g2d=(Graphics2D)panel.getGraphics();
				rec.draw(g2d);
				i=0;
				
			}
		});
		btnReactangle.setBounds(306, 192, 118, 58);
		frame.getContentPane().add(btnReactangle);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Line l1 = new Line(cordinates[0][0],cordinates[0][1],cordinates[1][0],cordinates[1][1]);
				Line l2 = new Line(cordinates[1][0],cordinates[1][1],cordinates[2][0],cordinates[2][1]);
				Line l3 = new Line(cordinates[2][0],cordinates[2][1],cordinates[0][0],cordinates[0][1]);
				IShape tri = new Triangle(l1,l2,l3);
				g2d=(Graphics2D)panel.getGraphics();
				tri.draw(g2d);
				i=0;
			}
		});
		btnTriangle.setBounds(306, 98, 118, 67);
		frame.getContentPane().add(btnTriangle);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.repaint();
				i=0;
			}
		});
		btnClear.setBounds(95, 227, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
		
		
		
		
		
		
	}
}
