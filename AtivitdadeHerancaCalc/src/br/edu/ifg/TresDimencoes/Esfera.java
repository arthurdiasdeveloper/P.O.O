package br.edu.ifg.TresDimencoes;

import br.edu.ifg.FormaTresDimencoes;

public class Esfera extends FormaTresDimencoes {

	private double raio;
	
	public Esfera(String nome, double perimetro, double volume) {
		super(nome, perimetro, volume);
		this.raio = raio;

	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public static double calcuVolumeEsfera(double raio) {
		return(4* Math.PI * raio * raio * raio / 3);
	}
	

}
