package br.com.buscape;

import java.util.ArrayList;
import java.util.List;

import br.com.buscape.comandos.Comand;
import br.com.buscape.entity.Submarino;

/***************************************************************************/
/**
 * @author MARCOS AUGUSTO MODESTO - 25/07/2016
 * @version 1.0
 * @category Teste de Programação
 * 
 ***************************************************************************/

public class Exploracao {

	public static void main(String[] args) {
		List<Submarino> submarinos = new ArrayList<Submarino>();

		Submarino submarino1 = new Submarino("SUBMARINO_1");
		submarino1.setComandos("LMRDDMMUU");
		submarinos.add(submarino1);

		Submarino submarino2 = new Submarino("SUBMARINO_2");
		submarino2.setComandos("RMMLMMMDDLL");
		submarinos.add(submarino2);

		for (Submarino sub : submarinos) {
			List<Comand> comandos = sub.getComandosConvertidos();
			for (Comand c : comandos) {
				c.execute();
			}
			System.out.println();
		}
		
	}

}
