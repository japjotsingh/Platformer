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
	
	public void jump(){
		double vY = 0;
		double gravity = 0.5;
		boolean onGround = false;
	}


	@Override
	public void openBackgroundImage() {
		// TODO Auto-generated method stub

	}

}
