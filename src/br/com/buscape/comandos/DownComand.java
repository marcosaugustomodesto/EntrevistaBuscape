package br.com.buscape.comandos;

import br.com.buscape.entity.Submarino;

public class DownComand implements Comand{
	private Submarino submarino;
	
	public DownComand(Submarino submarino){
		this.submarino = submarino;
	}
	
	@Override
	public void execute() {
		submarino.down();
	}
}
