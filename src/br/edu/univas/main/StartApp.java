package br.edu.univas.main;

import java.util.Random;

import br.edu.univas.vo.Player;

public class StartApp {
	
	static List piecesTable = new List();
	static List piecesPlayer = new List();
	static List piecesMachine = new List();
	
public static void main(String[] args) {
		
		List piecesList = new List();
		
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
		p1 = new Player("Player", piecesPlayer);
		p2 = new Player("Machine", piecesMachine);
		playGame(p1, p2);
	}
	
	static void playGame(Player p1, Player p2) {
		// TODO
		int cont = 0;
		
		while(!p1.getPieces().isEmpty() || !p2.getPieces().isEmpty()) {
			if(cont % 2 == 0) {// par 
				playerTurn();
			} else {// impar 
				machineTurn();
			}
			cont++;
		}
	}
	
	static void printTable() {
		// TODO
		piecesTable.toString();
	}
	
	static void playerTurn() {
		// TODO
		printTable();
		
	}
	
	static void machineTurn() {
		// TODO
		
	}
	
	static Player endGame(Player winner) {
		// TODO
		
		return null;
	}
}