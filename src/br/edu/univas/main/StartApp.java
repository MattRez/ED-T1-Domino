package br.edu.univas.main;

import java.util.Random;

public class StartApp {
	
	public static void main(String[] args) {
		
		List piecesList = new List();
		List piecesTable = new List();
		List piecesPlayer = new List();
		List piecesMachine = new List();
		
		Random r = new Random(piecesList.getLength());
		
		piecesList.populate();
		
		Integer cont = 0;
		
		while(!piecesList.isEmpty()) {
			/*
			if(impar) {
				
			}
			*/
			piecesList.pop(r.nextInt());
		}
		
		
	}
}