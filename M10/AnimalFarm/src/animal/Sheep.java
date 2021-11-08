package animal;

import breed.Vivipar;

public class Sheep extends Animal implements Vivipar {

	public Sheep(String nama) {
		super(4, nama);
	}

	@Override
	public void bersuara() {
		System.out.println(super.getNama() + " sedang mengembek");
	}

	@Override
	public void mengandung() {
		System.out.println(super.getNama() + " mengandung anaknya selama 152 hari");
	}
	

}
