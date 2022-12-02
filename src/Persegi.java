public class Persegi extends BangunDatar {
    float panjang;
    float lebar;

    public Persegi(String warna, float panjang, float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar(){
        System.out.println("Warna Persegi : " + warna);
    }
    @Override
     public float luas(){
            System.out.println("Menghitung Luas Persegi");
            System.out.println("panjang = " + panjang );
            System.out.println("lebar = " + lebar );
            System.out.println("Luas Persegi = " + (panjang * lebar) + "cm");
            return 1;
      }   
    
}