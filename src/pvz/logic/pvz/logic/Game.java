package pvz.logic.pvz.logic;

import java.util.Random;
import pvz.control.Level;
import pvz.logic.ZombiesManager;
import utils.Position;


public class Game {
	public static final int NUM_ROWS = 4;
    public static final int NUM_COLS = 8;
    
    private int cycle;
    private int sunCoins;
    private Level level;
    private ZombiesManager zombiesManager;
    
    public Game(long seed, Level level) {
        this.cycle = 0;
        this.sunCoins = 50;
        this.level = level;
        this.zombiesManager = new ZombiesManager(this, level, new Random(seed));
    }
    
    public int getCycle() {
        return this.cycle;
    }

    public int getSunCoins() {
        return this.sunCoins;
    }

    public int getRemainingZombies() {
        return this.zombiesManager.getRemainingZombies();
    }
    
    public String positionToString(Position pos) {
       if(pos.isEmpty()) {
    	return "";
       }
       else {
    	   
       }
    }
    
    public boolean hasGameFinished() {
        return false;
    }
    
    public static Position newZombiePosition(int row) {
    	Position pos= new Position(row,7);
    	return pos;
    }

	public boolean isEmpty(Position p) {
		Position pos= new Position(0,0);
		return(p.equals(pos));
	}
    
 
}
