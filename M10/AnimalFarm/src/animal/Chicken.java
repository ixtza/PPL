package animal;

import breed.Ovipar;

public class Chicken extends Animal implements Ovipar{
	
	public Chicken(String nama) {
		super(2, nama);
	}

	@Override
	public void bersuara() {
		System.out.println(super.getNama() + " sedang berkokok");
	}

	@Override
	public void mengerami() {
		System.out.println(super.getNama() + " mengerami telur selama 22 hari");
	}
	
}
