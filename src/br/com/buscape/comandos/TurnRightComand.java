package br.com.buscape.comandos;

import br.com.buscape.entity.Submarino;

public class TurnRightComand implements Comand{
	private Submarino submarino;
	
	public TurnRightComand(Submarino submarino){
		this.submarino = submarino;
	}
	
	@Override
	public void execute() {
		submarino.turnRight();
	}

}
