package br.com.buscape.comandos;

import br.com.buscape.entity.Submarino;

public class TurnLeftComand implements Comand{
	private Submarino submarino;
	
	public TurnLeftComand(Submarino submarino){
		this.submarino = submarino;
	}
	
	@Override
	public void execute() {
		submarino.turnleft();
	}

}
