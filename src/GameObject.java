import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;


public abstract class GameObject implements MovingObject {

	private double speed;// 0 - 10
	private double direction, // degrees or radians
		x, y, // >= 0
		width,height,
		health; // 0 - 100	
	

	public GameObject(int x, int y, int w, int h){
		initialize(x,y,w,h);
	}
	
	public void initialize(int x, int y, int w, int h){
		this.x=x;
		this.y=y;
		width=w;
		height=h;
	}

	
	public void draw(Graphics g){
		
	}
	
	public double height() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double width() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double y() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double x() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
	


	private Image img;
	
	@Override
	public void move() {
		x+= speed*Math.cos(direction);
		
		checkOffScreen();
		// maybe "push" back onto the screen change direction if
		// this object goes off the screen
	}

	public abstract void checkOffScreen();
	
	
	@Override
	public Rectangle getBoundingRect() {
		
		return new Rectangle((int)x,(int)y,(int)width,(int)height);
	}

}
