package br.com.buscape.comandos;

import br.com.buscape.entity.Submarino;

public class MoveComand implements Comand{
	private Submarino submarino;
	
	public MoveComand(Submarino submarino){
		this.submarino = submarino;
	}
	
	@Override
	public void execute() {
		submarino.move();
	}
}
