package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AssemblyLine extends JFrame {

	Timer painter;
	Toolkit tk;
	Tile[][] tiles;

	public static void main(String args[]) {
		new AssemblyLine();
	}

	private AssemblyLine() {
		setup();
	}

	private void setup() {
		tk = Toolkit.getDefaultToolkit();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.fillRect(10, 10, 10, 10);
			}
		});
		getContentPane().setPreferredSize(new Dimension(1000, 800));
		pack();
		setLocation((int) (tk.getScreenSize().getWidth() / 2 - getContentPane().getWidth() / 2),
				(int) (tk.getScreenSize().getHeight() / 2 - getContentPane().getHeight() / 2));
		init();
		painter = new Timer(1, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().repaint();
			}
		});
		painter.start();
		setVisible(true);
	}

	private void init() {
		tiles = new Tile[16][16];
		for (int iy = 0; iy < tiles.length; iy++) {
			for (int ix = 0; ix < tiles[0].length; ix++) {
				
			}
		}
	}
}