import java.awt.Dimension;

public class PlatformerMap extends GameMap {

	
	public PlatformerMap(Dimension d) {
		addPlayer();
		Obstacle ground = new Obstacle(0,750,(int)d.getWidth(),(int)d.getHeight()-750);
		this.addGameObject(ground);
		
		
	}
	
	
	private void addPlayer() {
		this.addGameObject(new Player(10,10));
		
	}


	@Override
	public void openBackgroundImage() {
		// TODO Auto-generated method stub

	}

}
