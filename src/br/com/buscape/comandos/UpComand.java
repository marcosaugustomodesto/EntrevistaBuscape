package br.com.buscape.comandos;

import br.com.buscape.entity.Submarino;

public class UpComand implements Comand{
	private Submarino submarino;
	
	public UpComand(Submarino submarino){
		this.submarino = submarino;
	}
	
	@Override
	public void execute() {
		submarino.up();
	}
}
