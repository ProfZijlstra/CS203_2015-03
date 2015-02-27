import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;

public class Pong {
	private int gameW = 640;
	private int gameH = 480;

	private int scoreLeft;
	private int scoreRight;

	private Paddle paddleLeft;
	private Paddle paddleRight;
	private Ball ball;

	private GraphicsWindow graphics;
	private KeyboardInput keyboard;
	
	public static void main(String[] args) throws InterruptedException {
		Pong pong = new Pong(Color.GREEN, Color.BLACK);
		pong.gameLoop();
	}

	public Pong(Color drawColor, Color clearColor) {
		scoreLeft = 0;
		scoreRight = 0;

		graphics = new GraphicsWindow(gameW, gameH, drawColor, clearColor);
		Font font = new Font("Monospaced", Font.BOLD, 16);
		graphics.setFont(font);
		keyboard = new KeyboardInput();
		graphics.addKeyListener(keyboard);

		paddleLeft = new Paddle(10, 220, 1.5);
		paddleRight = new Paddle(gameW - 20, 220, 1.5);
		ball = new Ball(6);
		ball.reset(gameW/2, gameH/2, true);
	}

	public void gameLoop() throws InterruptedException {

		// variables needed for game loop
		long fps = 40;
		long startTime = 0;
		long execTime = 0;
		long sleepTime = 0;
		long frameTime = 1000 / fps;
		boolean running = true;

		// game loop
		while (running) {
			startTime = System.currentTimeMillis();

			running = checkInput();
			checkCollision();
			ball.move();
			updateGraphics();

			// use a properly timed game loop
			execTime = System.currentTimeMillis() - startTime;
			sleepTime = frameTime - execTime;
			if (sleepTime > 0) {
				Thread.sleep(sleepTime);
			}
		}

		// exit when loop is done
		System.exit(0);
	}

	private boolean checkInput() {
		boolean esc = false;

		if (keyboard.keyDown(KeyEvent.VK_S)
				&& paddleLeft.getY() + paddleLeft.getHeight() < gameH) {
			paddleLeft.moveDown();
		}
		if (keyboard.keyDown(KeyEvent.VK_W) && paddleLeft.getY() > 0) {
			paddleLeft.moveUp();
		}
		if (keyboard.keyDown(KeyEvent.VK_DOWN)
				&& paddleRight.getY() + paddleRight.getHeight() < gameH) {
			paddleRight.moveDown();
		}
		if (keyboard.keyDown(KeyEvent.VK_UP) && paddleRight.getY() > 0) {
			paddleRight.moveUp();
		}
		if (keyboard.keyDown(KeyEvent.VK_ESCAPE)) {
			esc = true;
		}

		return !esc;
	}

	private void checkCollision() {
		double speedIncrease = 0.5;
		
		// check if ball collides with paddles
		if (paddleLeft.contains(ball)) {
			ball.flipvX();
			ball.increasevX(speedIncrease);
			ball.setRandomvY();
		} else if (paddleRight.contains(ball)) {
			ball.flipvX();
			ball.increasevX(-speedIncrease);
			ball.setRandomvY();
		}
		
		if (ball.getX() - ball.getRad() < 0) {
			// if the ball reached the left edge right gets a point
			scoreRight++;
			ball.reset(gameW/2, gameH/2, true);
		}
		else if (ball.getX() + ball.getRad() > gameW) {
			// if the ball reached the right edge left gets a point
			scoreLeft++;
			ball.reset(gameW/2, gameH/2, false);
		}

		// bounce against screen top and bottom 
		if (ball.getY() - ball.getRad() < 0 || ball.getY() + ball.getRad() > gameH) {
			ball.flipvY();
		}
	}

	private void updateGraphics() {
		graphics.clearBuffer();

		// draw paddles
		paddleLeft.draw(graphics);
		paddleRight.draw(graphics);

		// draw center line and circle
		double d = 61; // diameter
		graphics.drawLine(gameW / 2, 0, gameW / 2, gameH);
		Color drawColor = graphics.getDrawColor();
		graphics.setDrawColor(graphics.getClearColor());
		graphics.fillEllipse(gameW / 2, gameH / 2, d, d);
		graphics.setDrawColor(drawColor);
		graphics.drawEllipse(gameW / 2, gameH / 2, d, d);

		// show ball speed
		String displaySpeed = "" + Math.round((Math.abs(ball.getvX()) -2) * 2);
		graphics.drawText(displaySpeed, (int) Math.round(gameW / 2) - 5,
				(int) Math.round(gameH / 2) + 5);

		// show scores
		int scoreOffset = 30;
		graphics.drawText(Integer.toString(scoreLeft), scoreOffset, 20);
		graphics.drawText(Integer.toString(scoreRight), gameW
				- (int) (scoreOffset + 10), 20);

		// draw ball
		ball.draw(graphics);

		graphics.showOnScreen();
	}
}
