package j_login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawWindow extends JPanel implements MouseMotionListener {

	private static final long serialVersionUID = 1L;

	public DrawWindow() {
		addMouseMotionListener(this);
		setPreferredSize(new Dimension(500, 500));
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		points.add(new Point(x, y));
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.setColor(Color.BLACK);
		drawRectangles(g2d);
	}

	private void drawRectangles(Graphics2D g2d) {
		int x, y;
		for (Point p : points) {
			x = (int) p.getX();
			y = (int) p.getY();
			g2d.fillRect(x, y, lineWeight, lineWeight);
		}
	}
	
	private int lineWeight = 4;
	private int x, y;
	ArrayList<Point> points = new ArrayList<Point>();
}