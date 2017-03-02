import java.awt.Graphics;
import java.util.Set;

public class Player extends GameObject {

	public Player(int x, int y) {
		super(x, y, 10, 10);
	}

	public void updateMotion(Set<Double> directions) {
		if (directions.isEmpty()) {
			speed = 0;
		} else {
			double dx = 0;
			double dy = 0;
			for (Double d : directions) {
				dx += Math.cos(d);
				dy += Math.sin(d);
			}
			if (Math.abs(dx) < .001 && Math.abs(dy) < .001) {
				speed = 0;
			} else {
				direction = Math.atan2(dy, dx);
				speed = 1;
			}
		}

	}

	@Override
	public void checkOffScreen() {
		// TODO Auto-generated method stub
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect((int) x(), (int) y(), (int) width(), (int) height());
	}

}
