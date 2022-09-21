package br.edu.ifg.figuras;

import br.edu.ifg.interfaces.ITretaedro;

public class Tretaedro extends FormaTresDimencoes implements ITretaedro{
	private double aresta;

	public Tretaedro(double aresta) {
		this.aresta = aresta;
	}

	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public double getAresta() {
		return aresta;
	}

	public double calculaArea() {
		return Math.sqrt(3) * Math.pow(getAresta(), 2);
	}

	public double calculaVolume() {
		return Math.pow(getAresta(), 3) / (6 * Math.sqrt(2));
	}

	@Override
	public String toString() {

		return String.format("Tretaedro \n" + "Aresta: %.2f" + "\n" + "Area: %.2f" + "\n" + "Volume: %.2f", getAresta(),
				calculaArea(), calculaVolume());

	}

}
