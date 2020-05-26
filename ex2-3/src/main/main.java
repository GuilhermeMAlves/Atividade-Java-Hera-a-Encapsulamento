package main;

import model.Carro;
import model.Moto;

public class main {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setMarca("Chevrolet");
		carro.setModelo("Corsa");
		carro.setCor("vermelho");
		carro.setVelocidadeMaxima(130);
		carro.setCombustivel("álcool");
		carro.setPortas(4);
		
		carro.acelerar();
		carro.frear();
		
		Moto moto = new Moto();
		
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setCor("Azul");
		moto.setVelocidadeMaxima(190);
		moto.setCombustivel("gasolina");
		
		moto.acelerar();
		moto.empinar();
		moto.frear();
		
	}

}
