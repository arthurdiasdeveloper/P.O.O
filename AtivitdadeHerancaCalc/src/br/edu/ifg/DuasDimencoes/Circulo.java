package br.edu.ifg.DuasDimencoes;

import br.edu.ifg.FormaDuasDimencoes;

public class Circulo extends FormaDuasDimencoes {

	private double raio;
	private double circunferencia;
	private double comprimento;

	public Circulo(String nome, double perimetro, double area) {
		super(nome, perimetro, area);
		this.raio = raio;
		this.circunferencia = circunferencia;
		this.comprimento = comprimento;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(double circunferencia) {
		this.circunferencia = circunferencia;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public static double comprimento(double comprimento, double raio) {
		return (2 * Math.PI * raio);

	}

	public static double diametro(double raio, double diametro) {

		return (raio * diametro);

	}
	public static double area(double raio) {
		return(raio * raio * Math.PI);
	}
	
}