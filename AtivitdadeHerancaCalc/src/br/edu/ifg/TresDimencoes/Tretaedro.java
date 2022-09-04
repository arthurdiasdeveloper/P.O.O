package br.edu.ifg.TresDimencoes;

import br.edu.ifg.FormaTresDimencoes;

public class Tretaedro extends FormaTresDimencoes {
	private double altura;
	private double aresta;
	
	

	public Tretaedro(String nome, double perimetro, double volume) {
		super(nome, perimetro, volume);
		this.altura = altura;
		this.aresta = aresta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAresta() {
		return aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}
	
	public static double calcVolumeTretaedro(double aresta, double altura) {
		return (aresta * aresta * aresta * 2 / 12);
	}
	public static double calcAlturaTretaedro(double aresta) {
		return (aresta * 3 / 3 );
	}
}
