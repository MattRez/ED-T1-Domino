package br.edu.univas.vo;

import br.edu.univas.main.List;

public class Player {
	
	private String name;
	private List pieces;

	public Player(String name, List pieces) {
		this.name = name;
		this.pieces = pieces;
	}
	
	// get set 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPieces() {
		return pieces;
	}
	public void setPieces(List pieces) {
		this.pieces = pieces;
	}
}