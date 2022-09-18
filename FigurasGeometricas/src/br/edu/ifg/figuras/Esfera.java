package br.edu.ifg.figuras;

import br.edu.ifg.interfaces.IEsfera;

public class Esfera extends FormaTresDimencoes implements IEsfera {

	private double raio;

	public double calculaVolume() {
		double v = 4 / 3;
		return (v * Math.PI) * (Math.pow(getRaio(), 3));
	}

	public double calculaArea() {
		return (4 * Math.PI) * (Math.pow(getRaio(), 2));
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return String.format("Esfera \n" + "Raio: %.2f" + "\n" + "Volume: %.2f" + "\n" + "Area: %.2f", getRaio(),
				calculaVolume(), calculaArea());
	}

}
