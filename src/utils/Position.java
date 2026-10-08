package utils;

import java.util.Objects;

public class Position {
	private int row;
	
	private int col;
	
	public Position(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
	public int getRow() {
		return this.row;
	}

	public int getCol() {
		return this.col;
	}
	
	public boolean isValid() {
		return this.row >= 0 && this.row < 4 && this.col >= 0 && this.col < 8;
	}
	
	public boolean isEmpty() {
		boolean empty=true;
		
		
		return empty;
	}
	
	public boolean equals(Position pos) {
		if (this == pos) return true;
		if (pos == null || getClass() != pos.getClass()) return false;
		;
		return this.row == pos.getRow() && this.col == pos.getCol();
	}
	
}

