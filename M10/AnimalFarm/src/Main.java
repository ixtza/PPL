import java.util.ArrayList;

import animal.Animal;
import animal.Chicken;
import animal.Sheep;
import breed.Ovipar;
import breed.Vivipar;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<>();
		
		ArrayList<Ovipar> ovipar = new ArrayList<>();
		ovipar.add(new Chicken("Chicky"));
		ovipar.add(new Chicken("Chicko"));
		
		ArrayList<Vivipar> vivipar = new ArrayList<>();
		vivipar.add(new Sheep("Sheepy"));
		vivipar.add(new Sheep("Sheepo"));
		vivipar.add(new Sheep("Sheepu"));
		
		for(Ovipar i: ovipar) {
			i.mengerami();
			animal.add((Animal)i);
		}
		
		for(Vivipar i: vivipar) {
			i.mengandung();
			animal.add((Animal)i);
		}
		
		for (Animal i: animal) {
			i.bersuara();
		}
	}

}
