


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {

	private boolean[] keys = new boolean[KeyEvent.KEY_LAST];
	
	@Override
	public synchronized void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public synchronized void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// not needed
	}
	
	public synchronized boolean keyDown(int keyCode) {
		return keys[keyCode];
	}
	
	public synchronized boolean[] getKeyState() {
		return keys.clone();
	}
}
