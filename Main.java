public class Main {

    public static void main(String[] args) {
      // Layang-layang
      LayangLayang layangLayang = new LayangLayang("Layang-layang", 5, 8);
      layangLayang.info();
      System.out.println("Luas: " + layangLayang.getLuas());
      System.out.println("Keliling: " + layangLayang.getKeliling());
  
      // Trapesium
      Trapesium trapesium = new Trapesium("Trapesium Siku-siku", 5, 8, 6);
      trapesium.info();
      System.out.println("Luas: " + trapesium.getLuas());
      System.out.println("Keliling: " + trapesium.getKeliling());
  
      // Balok
      Balok balok = new Balok("Balok", 5, 3, 2);
      balok.info();
      System.out.println("Luas: " + balok.getLuas());
      System.out.println("Keliling: " + balok.getKeliling());
    }
  }