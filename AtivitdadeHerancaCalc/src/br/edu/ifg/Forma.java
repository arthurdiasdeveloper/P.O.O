package br.edu.ifg;

public  class Forma {
	private String nome;
	private double perimetro;


	public Forma(String nome, double perimetro) {
		this.nome = nome;
		this.perimetro = perimetro;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	
	
}