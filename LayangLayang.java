public class LayangLayang extends BangunDatar {

    public int d1, d2;
  
    public LayangLayang(String nama, int d1, int d2) {
      super(nama);
      this.d1 = d1;
      this.d2 = d2;
    }
  
    public double getLuas() {
      return (d1 * d2) / 2;
    }
  
    public double getKeliling() {
      // Implementasi rumus keliling layang-layang
      double sisi = Math.sqrt((d1 * d1 + d2 * d2) / 2);
      return 2 * sisi;
    }
  
    public void info(boolean detail) {
      super.info();
      if (detail) {
        System.out.println("Diagonal 1: " + d1);
        System.out.println("Diagonal 2: " + d2);
      }
    }
  }