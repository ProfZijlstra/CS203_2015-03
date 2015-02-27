

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

/**
 * <p>
 * This is a class for creating a window with basic drawing operations similar
 * to the StdDraw class used in the "Introduction to Programming in Java" book
 * by Robert Sedgewick and Kevin Wayne.
 * </p>
 * 
 * <p>
 * Some of this code is also based on examples found in the Java2D tutorials,
 * and examples on {@linkplain http://www.gamedev.net/}
 * </p>
 * 
 * <p>
 * In essence this class is a {@link JFrame} with single {@link Canvas}
 * component for showing graphics. Both of these components are told to ignore
 * repaint requests since this class is meant to be used from inside a timed
 * loop.
 * </p>
 * 
 * <p>
 * Internally this class uses a {@link BufferedImage} as a double buffer for the
 * canvas. Using a BufferedImage as the back-buffer instead of the canvas its
 * own double buffering capabilities has the advantage that a BufferedImage can
 * create {@link Graphics2D} elements instead of the basic {@link Graphics}
 * element that Canvas returns.
 * </p>
 * 
 * @author Michael Zijlstra
 */
public class GraphicsWindow {
	private static final long serialVersionUID = 1L;

	/*
	 * Private variables:
	 * 
	 * width and height are used frequently enough to keep them locally
	 */
	private int width;
	private int height;
	private boolean mathCoords = false;

	private JFrame frame;
	private Canvas canvas;
	private BufferedImage bufferImage;
	private Graphics2D bufferG;

	/*
	 * Constructors, using constructor chaining
	 */

	/**
	 * Default constructor creates a 640x480 window with black drawing color and
	 * white clear color, not using mathematical coordinates
	 */
	public GraphicsWindow() {
		this(640, 480);
	}

	/**
	 * Create a a 640x480 window with black drawing color and white clear color
	 * using mathematical coordinates if specified (uses screen coordinates if
	 * false)
	 * 
	 * @param mathCoords
	 *            - specifies whether mathematical coordinates should be used
	 * 
	 * @see #setMathCoords(boolean)
	 */
	public GraphicsWindow(boolean mathCoords) {
		this.mathCoords = mathCoords;
	}

	/**
	 * Creates a window with the given size, using a white clear color and a
	 * black drawing color - not using mathematical coordinates
	 * 
	 * @param width
	 *            - width of the drawing area
	 * @param height
	 *            - height of the drawing area
	 */
	public GraphicsWindow(int width, int height) {
		this(width, height, Color.BLACK, Color.WHITE);
	}

	/**
	 * Creates a 640x480 window with the specified drawing and clearing colors -
	 * not using mathematical coordinates
	 * 
	 * @param drawColor
	 *            - color to draw graphics with
	 * @param clearColor
	 *            - color to clear the screen with
	 * 
	 * @see java.awt.Color
	 */
	public GraphicsWindow(Color drawColor, Color clearColor) {
		this(640, 480, drawColor, clearColor);
	}

	/**
	 * Creates a window with given width and height, using the given drawing and
	 * clearing colors - not using mathematical coordinates
	 * 
	 * @param width
	 *            - width of the drawing area
	 * @param height
	 *            - height of the drawing area
	 * @param drawColor
	 *            - color to draw graphics with
	 * @param clearColor
	 *            - color to clear the screen with
	 * 
	 * @see java.awt.Color
	 */
	public GraphicsWindow(int width, int height, Color drawColor,
			Color clearColor) {
		this(width, height, drawColor, clearColor, false);
	}

	/**
	 * Creates a window with the given width and height, using the given drawing
	 * and clearing colors, and using the mathematical coordinates as specified
	 * 
	 * @param width
	 *            - width of the drawing area
	 * @param height
	 *            - height of the drawing area
	 * @param drawColor
	 *            - color to draw graphics with
	 * @param clearColor
	 *            - color to clear the screen with
	 * @param mathCoords
	 *            - boolean sets the use of math coordinates
	 * 
	 * @see java.awt.Color
	 * @see #setMathCoords(boolean)
	 */
	public GraphicsWindow(int width, int height, Color drawColor,
			Color clearColor, boolean mathCoords) {
		this.width = width;
		this.height = height;
		this.mathCoords = mathCoords;

		// JFrame methods
		frame = new JFrame();
		frame.setIgnoreRepaint(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setup the drawing area (canvas)
		canvas = new Canvas();
		canvas.setIgnoreRepaint(true);
		canvas.setSize(width, height);

		// create the back buffer (double buffer)
		bufferImage = new BufferedImage(width, height,
				BufferedImage.TYPE_4BYTE_ABGR);

		bufferG = bufferImage.createGraphics();
		RenderingHints hints = new RenderingHints(
				RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		hints.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		bufferG.addRenderingHints(hints);

		// set the requested colors
		bufferG.setBackground(clearColor);
		bufferG.setColor(drawColor);

		// combine everything on the frame and display
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}

	/*
	 * Basic getters and setters
	 */

	/**
	 * Returns width of the Canvas and BufferedImage graphic areas
	 * 
	 * @return the width of the drawing area 
	 */
	public int getWidth() {
		return bufferImage.getWidth();
	}

	/**
	 * Returns height of the Canvas and BufferedImage graphic areas
	 * 
	 * @return the height of the drawing area 
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Returns the font used by the Graphics2D for drawing text on the buffer
	 * 
	 * @return the font currently used by the Graphics2D element
	 * 
	 * @see java.awt.Font
	 * @see java.awt.Graphics2D
	 */
	public Font getFont() {
		return bufferG.getFont();
	}

	/**
	 * Sets the font used to draw text on the Graphics2D buffer
	 * 
	 * @param font
	 *            the font to be used for drawing text
	 *            
	 * @see java.awt.Font
	 * @see java.awt.Graphics2D
	 */
	public void setFont(Font font) {
		bufferG.setFont(font);
	}

	/**
	 * Returns the color used by the Graphics2D to clear the buffer
	 * 
	 * @return the color used to clear the drawing area
	 * 
	 * @see java.awt.Color
	 * @see java.awt.Graphics2D
	 */
	public Color getClearColor() {
		return bufferG.getBackground();
	}

	/**
	 * Sets the color to use for clearing the buffer
	 * 
	 * @param color
	 *            - color to use for drawing
	 *            
	 * @see java.awt.Color
	 * @see java.awt.Graphics2D
	 */
	public void setClearColor(Color color) {
		bufferG.setBackground(color);
	}

	/**
	 * Returns the color used by the Graphics2D to draw on the buffer
	 * 
	 * @return the color used to draw graphics
	 * 
	 * @see java.awt.Color
	 * @see java.awt.Graphics2D
	 */
	public Color getDrawColor() {
		return bufferG.getColor();
	}

	/**
	 * Sets the color to used by the Graphics2D for drawing on the buffer
	 * 
	 * @param color
	 *            - Color to be used for drawing graphics
	 *            
	 * @see java.awt.Color
	 * @see java.awt.Graphics2D
	 */
	public void setDrawColor(Color color) {
		bufferG.setColor(color);
	}

	/**
	 * Returns whether math coordinates are used instead of screen coordinates
	 * 
	 * @return boolean, true for math coordinates, false for screen coordinates
	 * 
	 * @see #setMathCoords(boolean)
	 */
	public boolean getMathCoords() {
		return mathCoords;
	}

	/**
	 * Sets whether to use math coordinates or not (not using math coordinates
	 * means using screen coordinates instead)
	 * 
	 * With mathematical coordinates the point x=0, y=0 is at the bottom left of
	 * the screen. An increase in the Y value moves the point up, an increase in
	 * the X value moves the point to the right
	 * 
	 * With screen coordinates the point x=0, y=0 is at the top right of the
	 * screen. An increase in the Y value moves the point down, an increase in
	 * the X value moves the point to the right
	 * 
	 * @param mathCoords
	 *            - boolean for setting math coordinates on / off
	 */
	public void setMathCoords(boolean mathCoords) {
		this.mathCoords = mathCoords;
	}

	/**
	 * Adds a key listener to our window
	 * 
	 * @param listener
	 *            - key listener to be added
	 * 
	 * @see java.awt.event.KeyListener
	 */
	public void addKeyListener(KeyListener listener) {
		frame.addKeyListener(listener);
	}

	/*
	 * Basic screen methods
	 */

	/**
	 * Clears the buffer with the set clear color
	 */
	public void clearBuffer() {
		bufferG.clearRect(0, 0, width, height);
	}

	/**
	 * Draws the buffer image onto the canvas, thereby showing the image on
	 * screen
	 */
	public void showOnScreen() {
		Graphics onscreen = canvas.getGraphics();
		onscreen.drawImage(bufferImage, 0, 0, null);
	}

	/*
	 * General Geometry drawing methods
	 */

	/**
	 * Draws the given text starting at the given position using the set drawing
	 * color and font
	 * 
	 * Position should be specified using screen coordinates or mathematical
	 * coordinates, based on how setMathCoords(boolean) is set
	 * 
	 * @param text
	 *            - text to draw on the screen
	 * @param x
	 *            - X position to start the text
	 * @param y
	 *            - Y position to start the text
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setFont(Font)
	 * @see #setDrawColor(Color)
	 */
	public void drawText(String text, int x, int y) {
		if (mathCoords) {
			y = height - y;
		}
		bufferG.drawString(text, x, y);
	}

	/**
	 * Draws a pixel onto the given position using the set drawing color
	 * 
	 * Position should be specified using screen coordinates or mathematical
	 * coordinates, based on how setMathCoords(boolean) is set
	 * 
	 * @param x
	 *            - the x position of the pixel
	 * @param y
	 *            - the y position of the pixel
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawPixel(double x, double y) {
		if (mathCoords) {
			y = height - y;
		}
		bufferG.fillRect((int) Math.round(x), (int) Math.round(y), 1, 1);
	}

	/**
	 * Draws a line from the coordinates specified by the first two parameters
	 * to the coordinates specified by the second set of parameters, using the
	 * set draw color
	 * 
	 * Positions should be specified using screen coordinates or mathematical
	 * coordinates, based on how setMathCoords(boolean) is set
	 * 
	 * @param x1
	 *            - X for the starting point
	 * @param y1
	 *            - Y for the starting point
	 * @param x2
	 *            - X for the ending point
	 * @param y2
	 *            - Y for the ending point
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawLine(double x1, double y1, double x2, double y2) {
		if (mathCoords) {
			y1 = height - y1;
			y2 = height - y2;
		}
		bufferG.draw(new Line2D.Double(x1, y1, x2, y2));
	}

	/**
	 * Draws a rectangle from the specified coordinates, with the given width
	 * and height, using the set draw color
	 * 
	 * When using screen coordinates, the point specified by x and y is the top
	 * left corner of the rectangle
	 * 
	 * When using mathematical coordinates the point specified by x and y is the
	 * bottom left corner of the rectangle
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the rectangle
	 * @param h
	 *            - Height of the rectangle
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawRectangle(double x, double y, double w, double h) {
		if (mathCoords) {
			y = height - y - h;
		}
		bufferG.draw(new Rectangle2D.Double(x, y, w, h));
	}

	/**
	 * Draws a rectangle with rounded corners from the specified coordinates
	 * with the given width and height, using the set draw color
	 * 
	 * When using screen coordinates, the point specified by x and y is the top
	 * left corner of the rectangle
	 * 
	 * When using mathematical coordinates the point specified by x and y is the
	 * bottom left corner of the rectangle
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the rectangle
	 * @param h
	 *            - Height of the rectangle
	 * @param arcw
	 *            - Width of the rounded corner arc
	 * @param arch
	 *            - Height of the rounded corner arc
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawRoundedRectangle(double x, double y, double w, double h,
			double arcw, double arch) {
		if (mathCoords) {
			y = height - y - h;
		}
		bufferG.draw(new RoundRectangle2D.Double(x, y, w, h, arcw, arch));
	}

	/**
	 * Draws an ellipse around the given coordinate point with the specified
	 * width and height, using the set draw color
	 * 
	 * Position should be specified using screen coordinates or mathematical
	 * coordinates, based on how setMathCoords(boolean) is set
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the ellipse
	 * @param h
	 *            - Height of the ellipse
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawEllipse(double x, double y, double w, double h) {
		if (mathCoords) {
			y = height - y;
		}

		// X and Y were specified as the center of the ellipse (like StdDraw)
		// but should be the top left corner of the bounding box
		x = x - (w / 2);
		y = y - (h / 2);

		bufferG.draw(new Ellipse2D.Double(x, y, w, h));
	}

	/**
	 * Draws a polygon based on the given points, using the set draw color
	 * 
	 * A point is specified by xArray[i], yArray[i]. Points should be specified
	 * using screen coordinates or mathematical coordinates, based on how
	 * setMathCoords(boolean) is set
	 * 
	 * @param xArray
	 *            - Array of X coordinates for the polygon vertices
	 * @param yArray
	 *            - Array of Y coordinates for the polygon vertices
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void drawPolygon(double[] xArray, double[] yArray) {
		Path2D.Double path = new Path2D.Double();
		double x, y;

		path.moveTo(xArray[0], yArray[0]);
		for (int i = 1; i < xArray.length; i++) {
			x = xArray[i];
			y = yArray[i];
			if (mathCoords) {
				y = height - y;
			}

			path.lineTo(x, y);
		}
		path.closePath();

		bufferG.draw(path);
	}

	/*
	 * Filled Geometry drawing methods
	 */

	/**
	 * Draws a filled rectangle from the specified coordinates, with the given
	 * width and height using the set draw color
	 * 
	 * When using screen coordinates, the point specified by x and y is the top
	 * left corner of the rectangle
	 * 
	 * When using mathematical coordinates the point specified by x and y is the
	 * bottom left corner of the rectangle
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the rectangle
	 * @param h
	 *            - Height of the rectangle
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void fillRectangle(double x, double y, double w, double h) {
		if (mathCoords) {
			y = height - y - h;
		}
		bufferG.fill(new Rectangle2D.Double(x, y, w, h));
	}

	/**
	 * Draws a filled rectangle with rounded corners from the specified
	 * coordinates with the given width and height, using the set draw color
	 * 
	 * When using screen coordinates, the point specified by x and y is the top
	 * left corner of the rectangle
	 * 
	 * When using mathematical coordinates the point specified by x and y is the
	 * bottom left corner of the rectangle
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the rectangle
	 * @param h
	 *            - Height of the rectangle
	 * @param arcw
	 *            - Width of the rounded corner arc
	 * @param arch
	 *            - Height of the rounded corner arc
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void fillRoundedRectangle(double x, double y, double w, double h,
			double arcw, double arch) {
		if (mathCoords) {
			y = height - y - h;
		}
		bufferG.fill(new RoundRectangle2D.Double(x, y, w, h, arcw, arch));
	}

	/**
	 * Draws a filled ellipse around the given coordinate point with the
	 * specified width and height, using the set draw color
	 * 
	 * Position should be specified using screen coordinates or mathematical
	 * coordinates, based on how setMathCoords(boolean) is set
	 * 
	 * @param x
	 *            - X coordinate of the starting point
	 * @param y
	 *            - Y coordinate of the starting point
	 * @param w
	 *            - Width of the ellipse
	 * @param h
	 *            - Height of the ellipse
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void fillEllipse(double x, double y, double w, double h) {
		if (mathCoords) {
			y = height - y;
		}

		// X and Y were specified as the center of the ellipse (like StdDraw)
		// but should be the top left corner of the bounding box
		x = x - (w / 2);
		y = y - (h / 2);

		bufferG.fill(new Ellipse2D.Double(x, y, w, h));
	}

	/**
	 * Draws filled a polygon based on the given points, using the set draw
	 * color
	 * 
	 * A point is specified by xArray[i], yArray[i]. Points should be specified
	 * using screen coordinates or mathematical coordinates, based on how
	 * setMathCoords(boolean) is set
	 * 
	 * @param xArray
	 *            - Array of X coordinates for the polygon vertices
	 * @param yArray
	 *            - Array of Y coordinates for the polygon vertices
	 * 
	 * @see #setMathCoords(boolean) 
	 * @see #setDrawColor(Color)
	 */
	public void fillPolygon(double[] xArray, double[] yArray) {
		Path2D.Double path = new Path2D.Double();
		double x, y;

		path.moveTo(xArray[0], yArray[0]);
		for (int i = 1; i < xArray.length; i++) {
			x = xArray[i];
			y = yArray[i];
			if (mathCoords) {
				y = height - y;
			}

			path.lineTo(x, y);
		}
		path.closePath();

		bufferG.fill(path);
	}
}
