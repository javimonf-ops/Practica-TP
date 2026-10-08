package pvz.logic.gameobjects;
import utils.Position;
import pvz.view.Messages;

public class Sunflower {
	private int cost;
	private int damage;
	private int endurance;
	private Position pos;
	
	public Sunflower() {
		this.cost=20;
		this.damage=0;
		this.endurance=1;
	}
	
	public Sunflower(int col, int row) {
		this.cost=20;
		this.damage=0;
		this.endurance=1;
		this.pos= new Position(row, col);
	}
	
	public int getCost() {
		return this.cost;	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	
	
	public static String getDescription() {
		Sunflower p=new Sunflower();
		String s= Messages.SUNFLOWER_DESCRIPTION.formatted( p.getCost(), p.getDamage(), p.getEndurance());
		return s;
	}
}

	
	
	
	
	

