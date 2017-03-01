import java.awt.Graphics;

public class Player extends GameObject {
	
	public Player(int x, int y){
		super(x,y,10,10);	
	}

	@Override
	public void checkOffScreen() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void draw(Graphics g){
		g.fillRect((int)x(), (int)y(), (int)width(), (int)height());
	}

}
