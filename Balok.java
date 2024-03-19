public class Balok extends BangunDatar {

    public int panjang, lebar, tinggi;
  
    public Balok(String nama, int panjang, int lebar, int tinggi) {
      super(nama);
      this.panjang = panjang;
      this.lebar = lebar;
      this.tinggi = tinggi;
    }
  
    public double getLuas() {
      return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
  
    public double getKeliling() {
      return 4 * (panjang + lebar + tinggi);
    }
  
    public void info(boolean detail) {
      super.info();
      if (detail) {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
      }
    }
  }