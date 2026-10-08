package pvz.logic.gameobjects;

import utils.Position;

public class Zombie {
	private int damage;
	private int endurance;
	private Position pos;
	private int velocidad;
	
	Zombie(int row, int col){
		this.endurance=5;
		this.damage=1;
		this.pos= new Position (row, col);
		//this.velocidad=?;
	}
	
	public Position getPosition() {
		return this.pos;
	}
	
}
