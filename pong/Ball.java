public class Ball {
	private double x;
	private double y;
	private double rad;// radius
	private double vX; // x velocity
	private double vY; // y velocity

	public Ball(double rad) {
		this.rad = rad;
	}

	public void move() {
		x += vX;
		y += vY;
	}

	public void flipvX() {
		vX = -vX;
	}
	
	public void flipvY() {
		vY = -vY;
	}
	
	public void increasevX(double speed) {
		if (((Math.abs(vX) -2) * 2) < 9) {
			vX += speed;
		}
	}
	
	public void setRandomvY() {
		vY = (Math.random() * 3) - 1.5; 
	}
	
	public void reset(double x, double y, boolean goRight) {
		this.x = x;
		this.y = y;
		setRandomvY();
		
		if (goRight) {
			vX = 2;
		} else {
			vX = -2;
		}
	}
	
	public void draw(GraphicsWindow graphics) {
		graphics.fillEllipse(x, y, rad * 2, rad * 2);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRad() {
		return rad;
	}

	public void setRad(double rad) {
		this.rad = rad;
	}

	public double getvX() {
		return vX;
	}

	public void setvX(double vX) {
		this.vX = vX;
	}

	public double getvY() {
		return vY;
	}

	public void setvY(double vY) {
		this.vY = vY;
	}

}
