package br.edu.univas.main;

import java.util.Random;
import java.util.Scanner;

import br.edu.univas.vo.*;

public class List {
	
	private Node begin;
	private Node end;
	private int length;
	
	
	void populate() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(i<=j) {
					if(isEmpty()) {
						begin = new Node();
						begin.setPiece(new Piece(i, j));
						end = begin;
					} else {
						end.setNext(new Node());
						end.getNext().setPiece(new Piece(i, j));
						end.getNext().setPrev(end);
						end = end.getNext();
					}
					length++;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO
		Node current = begin;
		while(current.getNext() != null) {
			System.out.println(
					current.getPiece().toString());
			current = current.getNext();
		}
		return "...";
	}
	
	public void addPiece(Piece piece) {
		//TODO
		//addPieceBegin()
		//addPieceEnd()
	}
	
	public Piece delPiece() {
		//TODO
		//delPieceBegin()
		//delPieceEnd()
		//delPieceIndex()
		return null;
	}
	
	public Node pop(int num) {
		// TODO
		
		Node current = runner(num);
		
		return current;
	}
	
	Node runner(int num) {
		// TODO
		int aux=0;
		Node current = begin;
		
		while(aux != num) {
			current = current.getNext();
		}
		
		return current;
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
	
	boolean isEmpty() {
		if(begin == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//
	
	int index(Scanner scan) {
		System.out.println("Por Favor, Digite o Índice: ");
		return readInt(scan);
	}
	
	int readInt(Scanner scan) {
		int num = scan.nextInt();
		scan.nextLine();
		return num;
	}
}