package br.edu.ifg.TresDimencoes;

import br.edu.ifg.FormaTresDimencoes;

public class Cubo extends FormaTresDimencoes {
	private double areaDaBase;

	public Cubo(String nome, double perimetro,double volume) {
		super(nome, perimetro, volume);
		this.areaDaBase = areaDaBase;
	}

	public double getAreaDaBase() {
		return areaDaBase;
	}

	public void setAreaDaBase(double areaDaBase) {
		this.areaDaBase = areaDaBase;
	}

	

	public static double calcVolumeCubo(double areaDaBase) {
		return ( areaDaBase * areaDaBase * areaDaBase);
	}
	
}
