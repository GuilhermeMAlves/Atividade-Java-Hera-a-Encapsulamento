package main;

import model.aeronaves;

public class main {
	
	public static void main(String[] args) {
	
		aeronaves aeronave = new aeronaves();

		aeronave.decolar();
		aeronave.voar();
		aeronave.pousar();
	}
}
