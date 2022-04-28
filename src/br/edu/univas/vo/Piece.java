package br.edu.univas.vo;

public class Piece {
	
	private int a;
	private int b;
	
	
	@Override
	public String toString() {
		return "[" + a + "|" + b + "]"; // [a|b]
	}
	
	public boolean check(Piece piece) {
		
		if(piece.a == a && piece.b == b) {
			return true;
		} else {
			if(check(cross(piece))) {
				return true;
			}
			return false;
		}
	}
	
	public Piece cross(Piece piece) {
		int aux = piece.a;
		piece.a = piece.b;
		piece.b = aux;
		return piece;
	}
	
	public Piece(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}