package animal;

public abstract class Animal {
	private int jumlahKaki;
	private String nama;
	
	public Animal(int jumlahKaki, String nama) {
		this.jumlahKaki = jumlahKaki;
		this.nama = nama;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getJumlahKaki() {
		return this.jumlahKaki;
	}
	
	public void setJumlahKaki(int jumlahKaki) {
		this.jumlahKaki = jumlahKaki;
	}
	
	public abstract void bersuara();
}
