//overloading

public abstract class BangunDatar {

    protected String nama;
  
    public BangunDatar(String nama) {
      this.nama = nama;
    }
  
    public abstract double getLuas();
  
    public abstract double getKeliling();
  
    public void info() {
      System.out.println("Nama Bangun Datar: " + nama);
    }
  }