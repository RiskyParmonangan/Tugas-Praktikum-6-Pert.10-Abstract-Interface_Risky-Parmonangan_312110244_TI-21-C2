public class Segitiga extends BangunDatar {
  int alas;
  int tinggi;
  
  public Segitiga(String warna, int alas, int tinggi){
    super(warna);
    this.alas = alas;
    this.tinggi = tinggi;
}

  @Override
  public void gambar(){
    System.out.println("Warna Segitiga : " + warna);
}
  @Override
 public float luas(){
        System.out.println("Menghitung Luas Segitiga");
        System.out.println("Alas = " + alas );
        System.out.println("Tinggi = " + tinggi );
        System.out.println("Luas Segitiga = " + (0.5 * alas * tinggi) + "cm^2");
        return 1;
  }   

    
}