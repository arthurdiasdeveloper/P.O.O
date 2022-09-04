package br.edu.ifg;

public class FormaTresDimencoes extends Forma {
	private double volume;
	
	public FormaTresDimencoes(String nome, double perimetro, double volume) {
		super(nome, perimetro);
		
		this.volume = volume;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	

}
