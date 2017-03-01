import java.awt.Graphics;

public class Obstacle extends GameObject {
	
	public Obstacle(int x, int y, int w, int h){
		super(x,y,w,h);
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
