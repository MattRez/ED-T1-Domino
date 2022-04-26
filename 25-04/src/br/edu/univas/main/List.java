package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.*;

public class List {
	
	private Node begin;
	private Node end;
	private int length;
	
	
	
	static void populate() {
			
	}
	
	public void addPiece(Piece piece, Scanner scan) {
		Node node = new Node();
		node.setPiece(piece);
		
		if(isEmpty()) {
			begin = node;
			end = node;
		} else {
			System.out.println(":::Adicionar Peça:::");
			System.out.println("1. Adicionar no Começo");
			System.out.println("2. Adicionar no Final");
			System.out.println("3. Adicionar no Índice");
			int opt = readInt(scan);
			
			switch (opt) {
			case 1:
				addPieceBegin(node);
				break;
			case 2:
				addPieceEnd(node);
				break;
			case 3:
				addPieceIndex(node, index(scan));
				break;
			}
		}
	}
	
	private void addPieceBegin(Node node) {
		node.setPrev(begin);
		begin = node;
	}
	
	private void addPieceEnd(Node node) {
		node.setNext(end);
		end = node;
	}
	
	private void addPieceIndex(Node node, int index) {
		//get to the index position, set index.prev.next = added, set added.next = index, set index.prev = added
	}
	
	
	public Piece delPiece(Scanner scan) {
		
		if(isEmpty()) {
			
		} else {
			System.out.println(":::Deletar Peça:::");
			System.out.println("1. Deletar no Começo");
			System.out.println("2. Deletar no Final");
			System.out.println("3. Deletar no Índice");
			int opt = scan.nextInt();
			
			switch (opt) {
			case 1:
				delPieceBegin();
				break;
			case 2:
				delPieceEnd();
				break;
			case 3:
				delPieceIndex(index(scan));
				break;
			}
		}
		
		return null;
	}
	
	private Piece delPieceBegin() {
		Piece piece = begin.getPiece();
		begin = begin.getNext();
		return piece;
	}
	
	private Piece delPieceEnd() {
		Piece piece = end.getPiece();
		end = end.getPrev();
		return piece;
	}
	
	private Piece delPieceIndex(int index) {
		Piece piece = getPieceIndex(index);
		
		//get to the index position, set prev.next = current.next, set next.prev = current.prev, return current
		return piece;
	}
	
	public boolean isEmpty() {
		if(begin == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Piece getPiece(Scanner scan) {
		System.out.println(":::Buscar Peça:::");
		System.out.println("1. Buscar o Começo");
		System.out.println("2. Buscar o Final");
		System.out.println("3. Buscar por Índice");
		
		Piece piece = null;
		int opt = scan.nextInt();
		
		switch(opt) {
		case 1:
			piece = getPieceBegin();
			break;
		case 2:
			piece = getPieceEnd();
			break;
		case 3:
			piece = getPieceIndex(index(scan));
			break;
		}
		
		return piece;
	}
	
	private Piece getPieceBegin() {
		return begin.getPiece();
	}
	
	private Piece getPieceEnd() {
		return end.getPiece();
	}
	
	private Piece getPieceIndex(int index) {
		Node node = begin;
		for(int i=0; i<index; i++) {
			if(i==index) {
				return null;
			}
			
		}
		return node.getPiece();
	}
	
	//
	
	public Node getBegin() {
		return begin;
	}
	public void setBegin(Node begin) {
		this.begin = begin;
	}
	public Node getEnd() {
		return end;
	}
	public void setEnd(Node end) {
		this.end = end;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	//
	
	static int index(Scanner scan) {
		System.out.println("Por Favor, Digite o Índice: ");
		return readInt(scan);
	}
	
	static int readInt(Scanner scan) {
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
}