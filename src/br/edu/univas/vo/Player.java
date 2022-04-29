package br.edu.univas.vo;

import br.edu.univas.main.List;

public class Player {
	
	List pieces;

	public Player(List pieces) {
		this.pieces = pieces;
	}
	
	
	public List getPieces() {
		return pieces;
	}
	public void setPieces(List pieces) {
		this.pieces = pieces;
	}
}