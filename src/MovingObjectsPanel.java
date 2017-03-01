import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;


public class MovingObjectsPanel extends JPanel {
	
	final Dimension defaultDim;// = new Dimension(800,600);
	GameMap gm;
	Timer t;
	Graphics g;
	
	public MovingObjectsPanel() {
		this( new Dimension(800,600));
	}
	
	public MovingObjectsPanel(Dimension dim) {
		defaultDim = dim;
		this.setPreferredSize(defaultDim);
		makeGameMap();
	}
	
	private void makeGameMap() {
		gm = new PlatformerMap(defaultDim);
		t = new Timer(10, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				gm.tick(g);
				repaint();
				
			}

		});
		setUpKeyMappings();
		t.start();
	}
	
	private void setUpKeyMappings() {
		// maps keys with actions...
		//  The code below maps a KeyStroke to an action to be performed
		// In this case I mapped the space bar key to the action named "shoot"
		// Whenever someone hits the Space Bar the action shoot is sent out

		this.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"shoot");
		this.getInputMap().put(KeyStroke.getKeyStroke("A"), "left");
		this.getInputMap().put(KeyStroke.getKeyStroke("D"), "right");
		this.getInputMap().put(KeyStroke.getKeyStroke("W"), "up");
		this.getInputMap().put(KeyStroke.getKeyStroke("S"), "down");
		
		this.getActionMap().put("shoot",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("space");
				gm.shoot();
			}
		});
		
		this.getActionMap().put("left",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		this.getActionMap().put("down",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		this.getActionMap().put("up",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {


			}
		});
		this.getActionMap().put("right",new AbstractAction(){
			@Override
			public void actionPerformed(ActionEvent e) {

				

			}
		});
		this.requestFocusInWindow();		

		
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		gm.draw(g);
	}
	

}
