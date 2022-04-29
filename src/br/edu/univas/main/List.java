package br.edu.univas.main;

import java.util.Scanner;

import br.edu.univas.vo.*;

public class List {
	
	private String name;
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
		
		System.out.println(name + ":");
		
		if(isEmpty()) {
			System.out.println("Lista Vazia :)");
		} else {
			while(current != null) {
				System.out.println(
						current.getPiece().toString());
				current = current.getNext();
			}
		}
		return "";
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
			int opt = readInt(scan);
			
			switch (opt) {
			case 1:
				addPieceBegin(node);
				break;
			case 2:
				addPieceEnd(node);
				break;
			}
		}
	}
	
	private void addPieceBegin(Node node) {
		node.setNext(begin);
		begin = node;
	}
	
	private void addPieceEnd(Node node) {
		node.setPrev(end);
		end = node;
	}
	
	public Node delPiece(Scanner scan) {
		//TODO
		Node node = null;
		
		if(isEmpty()) {
			System.out.println("Lista Vazia :)");
		} else {
			System.out.println(":::Remover Peça:::");
			System.out.println("1. Remover no Começo");
			System.out.println("2. Remover no Final");
			System.out.println("3. Remover no Índice");
			int opt = scan.nextInt();
			
			switch (opt) {
			case 1:
				node = delPieceBegin();
				break;
			case 2:
				node = delPieceEnd();
				break;
			case 3:
				node = delPieceIndex(scan);
				break;
			}
		}
		return node;
	}
	
	private Node delPieceBegin() {
		Node node = begin;
		begin = begin.getNext();
		return node;
	}
	
	private Node delPieceEnd() {
		Node node = end;
		end = end.getPrev();
		return node;
	}
	
	private Node delPieceIndex(Scanner scan) {
		System.out.println("Remover Peça no Índice: ");
		Node current = runner(index(scan));
		reattach(current);
		return current;
	}
	
	public void push(Node node) {// push = addPiedeEnd()
		addPieceEnd(node);
	}
	
	public Node pop(int num) {// pop = delPieceRandom()
		Node current = runner(num);
		reattach(current);
		return current;
	}
	
	// get set
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	
	// misc
	
	void reattach(Node current) {// reconectar
		current.getNext().setPrev(current.getPrev());
		current.getPrev().setNext(current.getNext());
	}
	
	Node runner(int num) {
		int aux = 0;
		Node current = begin;
		
		while(aux != num) {
			if(current.getNext() != null) {
				current = current.getNext();
			}
		}
		return current;
	}
	
	boolean isEmpty() {
		if(begin == null) {
			return true;
		} else {
			return false;
		}
	}
	
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