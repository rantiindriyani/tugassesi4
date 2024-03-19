public class Trapesium extends BangunDatar {

    public int alas1, alas2, tinggi;
  
    public Trapesium(String nama, int alas1, int alas2, int tinggi) {
      super(nama);
      this.alas1 = alas1;
      this.alas2 = alas2;
      this.tinggi = tinggi;
    }
  
    public double getLuas() {
      return ((alas1 + alas2) / 2) * tinggi;
    }
  
    public double getKeliling() {
      // Implementasi rumus keliling trapesium
      int sisiMiring = (int) Math.sqrt((alas2 - alas1) * (alas2 - alas1) + tinggi * tinggi);
      return alas1 + alas2 + sisiMiring * 2;
    }
  
    public void info(boolean detail) {
      super.info();
      if (detail) {
        System.out.println("Alas 1: " + alas1);
        System.out.println("Alas 2: " + alas2);
        System.out.println("Tinggi: " + tinggi);
      }
    }
  }