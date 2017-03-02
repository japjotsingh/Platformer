import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public abstract class GameMap {

	private List<MovingObject> movers;
	Image backgroundImage;
	Player player1;
	
	public GameMap() {
		movers = new ArrayList();
		openBackgroundImage();
	}

	public void addGameObject(GameObject go) {
		movers.add(go);
	}
	public abstract void openBackgroundImage();

	public void shoot() {
		// TODO Auto-generated method stub
		
	}

	public void tick(Graphics g) {
		// TODO Auto-generated method stub	
	}
	
	public void playerUpdateMotion(Set<Double> directions) {
		player1.updateMotion(directions);
	}

	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		for(MovingObject m:movers){
			m.draw(g);
		}
	} 	
}
