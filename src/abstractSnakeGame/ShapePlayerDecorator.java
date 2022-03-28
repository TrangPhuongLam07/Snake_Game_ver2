package abstractSnakeGame;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import interfaceSnakeGame.ShapePlayer;

public abstract class ShapePlayerDecorator implements ShapePlayer{
	protected ShapePlayer playerDecorator;
	protected boolean running = false;
	protected final int GAME_UNIT = 1;
	protected int[] x = new int[1], y = new int[1];
	protected int bodyPlayer = 1;
	protected int unit_size = 1;
	protected char direction = 'R';
	protected ImageIcon iconHead_Down, iconHead_Up, iconHead_Left, iconHead_Right, iconHead;

	public ShapePlayerDecorator(ShapePlayer playerDecorator) {
		super();
		this.playerDecorator = playerDecorator;
		this.x = new int[playerDecorator.getGAME_UNIT()];
		this.y = new int[playerDecorator.getGAME_UNIT()];
		this.x = playerDecorator.getXPlayer();
		this.y = playerDecorator.getYPlayer();
		this.bodyPlayer = playerDecorator.getBodyPlayer();
		this.unit_size = playerDecorator.getUnit_size();
		this.running = playerDecorator.getRunningPlayer();
	}
	
	public void paintSkin(Graphics g) {
		playerDecorator.paintSkin(g);
		
	}
	
	public void directionIconHead() {
		switch (playerDecorator.getDirection()) {
		case 'U':
			direction = 'U';
			iconHead = iconHead_Up;
			break;
		case 'D':
			direction = 'D';
			iconHead = iconHead_Down;
			break;
		case 'L':
			direction = 'L';
			iconHead = iconHead_Left;
			break;
		case 'R':
			direction = 'R';
			iconHead = iconHead_Right;
			break;

		default:
			break;
		}
	}
	
	public void paintPlayer(ShapePlayer playerDecorator, Graphics g) {
		this.running = playerDecorator.getRunningPlayer();
		directionIconHead();
		if (running) {
			for(int i = 0; i< bodyPlayer;i++) {
				if(i == 1) {
					g.drawImage(iconHead.getImage(), x[i], y[i], 
							unit_size, unit_size, null);
				}
				
			}
			
		}
		
	}
	
	@Override
	public int[] getXPlayer() {
		// TODO Auto-generated method stub
		return x;
	}
	@Override
	public int[] getYPlayer() {
		// TODO Auto-generated method stub
		return y;
	}
	@Override
	public int getUnit_size() {
		// TODO Auto-generated method stub
		return unit_size;
	}
	@Override
	public int setUnit_size(int unit_size) {
		// TODO Auto-generated method stub
		return this.unit_size = unit_size;
	}
	@Override
	public int getBodyPlayer() {
		// TODO Auto-generated method stub
		return bodyPlayer;
	}
	@Override
	public int getGAME_UNIT() {
		// TODO Auto-generated method stub
		return GAME_UNIT;
	}
	@Override
	public boolean getRunningPlayer() {
		// TODO Auto-generated method stub
		return running;
	}
	
	@Override
	public char getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}
}
