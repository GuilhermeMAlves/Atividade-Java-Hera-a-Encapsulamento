package model;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	private int velocidadeMaxima;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar() {
		System.out.println("O veiculo " + this.modelo + " acelerou");
	}
	
	public void frear() {
		System.out.println("O veiculo " + this.modelo + " desacelerou");
	}
	
}
