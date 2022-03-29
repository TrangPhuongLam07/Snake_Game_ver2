package controller;

import javax.swing.JOptionPane;

import abstractSnakeGame.ScreenGame;
import interfaceSnakeGame.Controller;
import panel.PanelMap_1;
import view.GameFrameView;
import view.HelpView;
import view.LevelView;
import view.MenuView;
import view.PlayerView;

public class MenuController implements Controller{
	public MenuView menuView;
	public ScreenGame screenGame;

	public MenuController(MenuView menuView) {
		super();
		this.menuView = menuView;
	}
	
	@Override
	public void newGame() {
		screenGame = new PanelMap_1();
		GameFrameView gameFrameView = new GameFrameView(screenGame);
		menuView.dispose();
	}

	@Override
	public void exitGame() {
		if (JOptionPane.showConfirmDialog(menuView, "Are you sure to Exit the Game", "Exit Game!!!",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION)
			System.exit(0);
	}

	@Override
	public void scoreGame() {
		String str = "Best Score:" + "\n";

//		if (HighScore.getInstance().get().size() <= 3) {
//			for (int i = 0; i < HighScore.getInstance().get().size(); i++) {
//				str += "no" + "." + (i + 1) + "    " + HighScore.getInstance().get().get(i) + "\n";
//			}
//		} else {
//			for (int i = 0; i < 3; i++) {
//				str += "no" + "." + (i + 1) + "    " + HighScore.getInstance().get().get(i) + "\n";
//			}
//		}
		JOptionPane.showConfirmDialog(menuView, str, "High Score", JOptionPane.DEFAULT_OPTION,
				JOptionPane.DEFAULT_OPTION);

	}

	@Override
	public void levelGame() {
		LevelView levelView = new LevelView();
		

	}

	@Override
	public void helpGame() {
		// TODO Auto-generated method stub
		HelpView helpView = new HelpView();
		
	}

	@Override
	public void playerGame() {
		// TODO Auto-generated method stub
		PlayerView playerView = new PlayerView();
		
	}

}
