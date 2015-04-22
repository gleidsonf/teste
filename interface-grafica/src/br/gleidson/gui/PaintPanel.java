package br.gleidson.gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int pointCount = 0;
	private Point[] points = new Point[10_000];

	public PaintPanel() {
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent event) {
				if (pointCount < points.length) {
					points[pointCount] = event.getPoint();
					pointCount++;
					repaint();

				}
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < pointCount; i++) {
			g.fillOval(points[i].x, points[i].y, 4, 4);

		}
	}

	public static void main(String[] args) {
		JFrame app = new JFrame("Pinte.");
		PaintPanel paintPanel = new PaintPanel();
		app.add(paintPanel, BorderLayout.CENTER);
		app.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(400, 200);
		app.setVisible(true);
	}
}
