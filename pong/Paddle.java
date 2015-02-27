public class Paddle {
	private double x;
	private double y;
	private double width;
	private double height;
	private double speed;

	public Paddle(double x, double y, double speed) {
		this(x, y, 10, 40, speed);
	}

	public Paddle(double x, double y, double w, double h, double s) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.speed = s;
	}

	public boolean contains(Ball ball) {
		boolean contains = false;
		if (ball.getX() > x && ball.getX() < x + width 
				&& ball.getY() > y && ball.getY() < y + height) {
			contains = true;
		}
		return contains;
	}

	public void moveUp() {
		y -= speed;
	}

	public void moveDown() {
		y += speed;
	}

	public void draw(GraphicsWindow graphics) {
		graphics.fillRoundedRectangle(x, y, width, height, 10.0, 10.0);
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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}
