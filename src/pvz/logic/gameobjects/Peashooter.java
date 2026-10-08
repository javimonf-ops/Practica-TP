package pvz.logic.gameobjects;
import utils.Position;
import pvz.view.Messages;

public class Peashooter {
	private int cost;
	private int damage;
	private int endurance;
	private Position pos;
	
	public Peashooter() {
		this.cost=50;
		this.damage=1;
		this.endurance=3;
	}
	
	public Peashooter(int col, int row) {
		this.cost=50;
		this.damage=1;
		this.endurance=3;
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
		Peashooter p=new Peashooter();
		String s= Messages.PEASHOOTER_DESCRIPTION.formatted( p.getCost(), p.getDamage(), p.getEndurance());
		return s;
	}
}
