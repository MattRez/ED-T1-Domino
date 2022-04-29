package br.edu.univas.main;

import java.util.Random;

import br.edu.univas.vo.Player;

public class StartApp {
	
public static void main(String[] args) {
		
		List piecesList = new List();
		List piecesTable = new List();
		List piecesPlayer = new List();
		List piecesMachine = new List();
		
		Player p1;
		Player p2;
		
		Random r = new Random();
		
		piecesList.populate();
		
		int cont = 0;
		
		while(!piecesList.isEmpty()) {
			if(cont % 2 == 0) {// par 
				piecesPlayer.push(
						piecesList.pop(
								r.nextInt(
										piecesList.getLength())));
			} else {// impar 
				piecesMachine.push(
						piecesList.pop(
								r.nextInt(
										piecesList.getLength())));
			}
		}
		p1 = new Player(piecesPlayer);
		p2 = new Player(piecesMachine);
		play(p1, p2);
	}
	
	static void play(Player p1, Player p2) {
		// TODO
		
		
		while(!p1.getPieces().isEmpty() || !p2.getPieces().isEmpty()) {
			
		}
		
	}
}