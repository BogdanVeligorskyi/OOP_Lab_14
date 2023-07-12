package graph;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

// клас для роботи з графікою
public class TestGraph {

	private JFrame frmOopthLab;
	//private URL url = TestGraph.class.getResource("/other/DSC_9029_2.jpg");
	//private BufferedImage img = null;
	/*{
		try {
			img = ImageIO.read(url);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}*/
	
/*	private JPanel panel = new JPanel() {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			Image scaledImg = img.getScaledInstance(getWidth(),
							getHeight(),Image.SCALE_SMOOTH);
			g2d.drawImage(scaledImg, 0, 0, this);
		}
	};*/



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					TestGraph window = new TestGraph();
					window.frmOopthLab.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestGraph() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOopthLab = new JFrame();
		frmOopthLab.getContentPane().setBackground(new Color(218, 165, 32));
		frmOopthLab.setTitle("OOP. 14th Lab");
		frmOopthLab.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				time();
			}
		});
		frmOopthLab.setBounds(100, 100, 537, 268);
		frmOopthLab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOopthLab.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Press a mouse button to run");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(121, 85, 268, 51);
		frmOopthLab.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Current Time in Ukraine (Animation)");
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(49, 42, 412, 42);
		frmOopthLab.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2020. Bogdan Veligorskyi, KI-191");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(56, 149, 394, 51);
		frmOopthLab.getContentPane().add(lblNewLabel_2);
	}

	/*public void testGraph() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		int w = c.getWidth();
		int h = c.getHeight();
		int size = h / 4;
		int top = h / 16;
		int left = w / 16;

		g.setColor(Color.ORANGE);
		g.fillOval(left, top, size, size);

		g.setColor(Color.YELLOW.darker());
		g.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, 
		BasicStroke.JOIN_MITER, 1, new float[]{ 10, 5 }, 0));

		int x1, x2, y1, y2, r1 = size / 2, r2 = w * 2 / 3;
		for (double fi = 0; fi < 2 * Math.PI; fi += Math.PI / 12) {
			x1 = (int) (left + size / 2 + r1 * Math.cos(fi));
			y1 = (int) (top + size / 2 + r1 * Math.sin(fi));
			x2 = (int) (left + size / 2 + r2 * Math.cos(fi));
			y2 = (int) (top + size / 2 + r2 * Math.sin(fi));
			g.drawLine(x1, y1, x2, y2);
		}

		int penSize = size / 16;
		g.setStroke(new BasicStroke(penSize));
		g.setColor(Color.ORANGE.brighter());
		g.drawOval(left, top, size, size);

		System.out.println("This is testGraph");
	}*/
	
	/*private void testShape() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();

		int w = c.getWidth();
		int h = c.getHeight();
		g.clearRect(0, 0, w, h);

		Shape line = new Line2D.Float(40, 20, w-40, h-20);
		g.draw(line);
		
		Rectangle rk = line.getBounds();
		g.setColor(Color.RED);
		g.drawRect(rk.x, rk.y, rk.width, rk.height);
	}*/
	
	/*private void testShape1() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		
		int w = c.getWidth();
		int h = c.getHeight();
		g.clearRect(0, 0, w, h);
		
		GeneralPath gp = new GeneralPath();
		gp.moveTo(20, h-10);
		gp.lineTo(40, h-200);
		gp.lineTo(w-20, h-100);
		gp.closePath();
		gp.quadTo(40, h-200, w-20, h-100);
		g.draw(gp);	
	}*/
	
	/*private void testShape2() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		
		int w = c.getWidth();
		int h = c.getHeight();
		g.clearRect(0, 0, w, h);
		
		GeneralPath gp = new GeneralPath();
		gp.moveTo(20, h - 10);
		gp.lineTo(40, h - 250);
		gp.lineTo(w - 20, h - 200);
		gp.lineTo(w - 20, h - 10);
		gp.lineTo(20, h - 10);
		gp.curveTo(45, h - 100, 150, h - 150, w - 20, h - 200);
		g.draw(gp);
	}*/

	/*private Color altColor(Graphics2D g, Color c) {
		Color back = g.getBackground();
		int rgb = back.getRGB() ^ c.getRGB();
		return new Color(rgb);
	}*/
	
	/*private void testXOR() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		int w = c.getWidth();
		int h = c.getHeight();
		g.clearRect(0, 0, w, h);
		int size = 50;
		int x = 0, y = (h - size) / 2, dx = 5;
		g.setXORMode(altColor(g, Color.RED));
		while (true) {
			g.fillOval(x, y, size, size);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
			g.fillOval(x, y, size, size);
			x += dx;
			if (x > w - size || x <= 0 && dx < 0)
				dx = -dx;
		}
	}*/
	
	//private Shape sh;
	/*public void movingRect() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		g.setColor(Color.GREEN);
		int w = c.getWidth();
		int h = c.getHeight();
		g.clearRect(0, 0, w, h);
		new Thread(() -> {
			// Створюємо прямокутник
			sh = new Rectangle2D.Float(0, h / 2 - h / 8, w / 4, h / 4);
			while (sh.getBounds().getWidth() > 5) {
				Rectangle r = sh.getBounds();
				// Відображення
				EventQueue.invokeLater(() -> g.fill(sh));
				// Затримка у часі
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				// Відновлення фонового зображення панелі
				c.repaint(r.x, r.y, r.width, r.height);
				// Формування афінного перетворення
				AffineTransform at = new AffineTransform();
				at.translate(40, 0);
				at.scale(0.9, 0.95);
				at.rotate(0.08, r.x + r.width / 2, r.y + r.height / 2);
				// Перетворення зображення
				sh = at.createTransformedShape(sh);
			}
		}).start();
	}*/
	
	private void time() {
		Container c = frmOopthLab.getContentPane();
		Graphics2D g = (Graphics2D) c.getGraphics();
		int w = c.getWidth();
		int h = c.getHeight();
		g.setBackground(Color.ORANGE.darker());
		Font font = new Font(Font.DIALOG, Font.ITALIC, 28);
		new Thread(() -> {
			Date date = null;
			while (true) {
				date = new Date();
				g.clearRect(0, 0, w, h);
				g.setColor(Color.BLUE.brighter());
				g.setFont(font);
				g.drawString("Current time in Ukraine:", 5, 50);
				g.drawString(date.toString(), 5, 100);
				date = null;
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		}).start();
	}
}
