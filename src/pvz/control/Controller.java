package pvz.control;

import pvz.logic.pvz.logic.Game;
import pvz.view.GamePrinter;
import pvz.view.GameView;
import pvz.view.Messages;

/**
 * Input/output coordinator of the game (the C in MVC).
 *
 * <p>Owns the game loop: reads a line from stdin, parses it into a
 * command, validates parameters (plant type, position), delegates
 * state changes to {@link Game}, and triggers a board reprint via
 * {@link tp1.pvz.view.GameView>} when the cycle advances. It holds no game
 * state of its own; the source of truth is always {@link Game}.
 */
public class Controller {

	private final Game game;
	private final GameView view;

	public Controller(Game game) {
		this.game = game;
		this.view = new GamePrinter(game);
	}

	/**
	 * Runs the game logic.
	 */
	public void run() {
		view.showGame();
		while (!game.hasGameFinished()) {
			
			String[] words = view.getPrompt();
			
			if (words.length > 0 && (words[0].equals("exit")) || (words[0].equals("e"))) {
	            break;
	        }
			else if(words.length > 0 &&words[0].equals("help") || (words[0].equals("h"))){
				view.showMessage(Messages.HELP);
			}
			else if(words.length > 0 &&words[0].equals("list") || (words[0].equals("l"))) {
				view.showMessage(Messages.LIST);
			}
			else if(words.length > 0 &&words[0].equals("add") || (words[0].equals("a"))) {
				
			}
		}
		view.showEndMessage();

	}

}