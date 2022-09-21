package br.edu.ifg.figuras;

import br.edu.ifg.interfaces.IQuadrado;

public class Quadrado extends FormaDuasDimencoes implements IQuadrado {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(getLado(), 2);
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public String toString() {
		return String.format("Quadrado \n" + "Lado: %.2f" + "\n" + "Area: %.2f", getLado(), calculaArea());

	}

}