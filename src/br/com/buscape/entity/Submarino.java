package br.com.buscape.entity;

import java.util.ArrayList;
import java.util.List;

import br.com.buscape.comandos.Comand;
import br.com.buscape.comandos.DownComand;
import br.com.buscape.comandos.MoveComand;
import br.com.buscape.comandos.TurnLeftComand;
import br.com.buscape.comandos.TurnRightComand;
import br.com.buscape.comandos.UpComand;

public class Submarino {

	private int x;
	private int y;
	private int z;
	private int angulo;
	private PontoCardelEnum pontoCardeal;
	private String nome;
	private List<Comand> comandosConvertidos = new ArrayList<Comand>();
	
	public Submarino(String nome){
		// leve em consideração que o submarino sempre começará no ponto (0, 0, 0, NORTE)
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.pontoCardeal = PontoCardelEnum.NORTE;
		this.angulo = 90;
		this.nome = nome;
	}
	
	private List<Comand> comandosConversor(String comandos) {
		if(comandos != null){
			for (int i = 0; i < comandos.length(); i++) {
				char acao = comandos.charAt(i);
				switch (acao) {
				case 'R':
					comandosConvertidos.add(new TurnRightComand(this));break;
				case 'L':
					comandosConvertidos.add(new TurnLeftComand(this));break;
				case 'U':
					comandosConvertidos.add(new UpComand(this));break;
				case 'D':
					comandosConvertidos.add(new DownComand(this));break;
				case 'M':
					comandosConvertidos.add(new MoveComand(this));break;
				}
			}
		}
		return comandosConvertidos;
	}
	
	public void turnleft(){
		System.out.print(this.toString() + " ----> ");
		
		this.angulo= this.angulo + 90;
		if(this.angulo == 360){
			this.angulo = 0;
		}
		this.pontoCardeal = apontarSubmarino(this.angulo);
		
		System.out.println(this.toString());
	}
	

	public void turnRight(){
		System.out.print(this.toString() + " ----> ");
		
		if(this.angulo == 0){
			this.angulo = 270;
		} else {
		   this.angulo = this.angulo - 90;
		}
		if(this.angulo == 360){
			this.angulo = 0;
		}
		this.pontoCardeal = apontarSubmarino(this.angulo);
		
		System.out.println(this.toString());
	}
	
	public void move(){		
		System.out.print(this.toString() + " ----> ");
		
		// todo movimento quando o submarino estiver apontada para o NORTE, somará 1 ao eixo Y
		if(this.pontoCardeal == PontoCardelEnum.NORTE){
			this.y++;
		}
		// todo movimento quando o submarino estiver apontada para o LESTE somará 1 ao eixo X
		if(this.pontoCardeal == PontoCardelEnum.LESTE){
			this.x++;
		}
		// TODO: VERIFICAR PORQUE O SUBMARINO NAO SE MOVE PARA OESTE E SUL
		
		if(this.pontoCardeal == PontoCardelEnum.OESTE){
			this.x--;
		}
		if(this.pontoCardeal == PontoCardelEnum.SUL){
			this.y--;
		}	

		System.out.println(this.toString());
	}
	
	private PontoCardelEnum apontarSubmarino(int angulo) {
		switch (angulo) {
		case  90: return PontoCardelEnum.NORTE;
		case 180: return PontoCardelEnum.OESTE;
		case 270: return PontoCardelEnum.SUL;
		case   0: return PontoCardelEnum.LESTE;
		default:
			break;
		}
		return null;
	}

	public void up(){
		System.out.print(this.toString() + " ----> ");
		
		// TODO: VERIFICAR SE O SUBMARINO DEVE EMERGIR
		// todo movimento para cima aumentara 1 do eixo Z.
		this.z++;
	    System.out.println(this.toString());	
	}
	
	public void down(){
		System.out.print(this.toString() + " ----> ");
		
		// todo movimento para baixo diminuirá 1 do eixo Z.
		this.z--;
		System.out.println(this.toString());
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}

	public PontoCardelEnum getPontoCardeal() {
		return pontoCardeal;
	}

	public void setPontoCardeal(PontoCardelEnum pontoCardeal) {
		this.pontoCardeal = pontoCardeal;
	}

	@Override
	public String toString() {
		return "Submarino [Nome=" + nome + " x=" + x + ", y=" + y + ", z=" + z
				+ ", pontoCardeal=" + pontoCardeal + "]";
	}

	public void setComandos(String comandos) {
		comandosConversor(comandos);
	}

    public List<Comand> getComandosConvertidos(){
    	return this.comandosConvertidos;
    }
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
