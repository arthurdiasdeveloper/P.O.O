package br.edu.ifg;

public class FormaDuasDimencoes extends Forma {
	private double area;

	public FormaDuasDimencoes(String nome, double perimetro, double area) {
		super(nome, perimetro);
		this.area = area;

	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
}
