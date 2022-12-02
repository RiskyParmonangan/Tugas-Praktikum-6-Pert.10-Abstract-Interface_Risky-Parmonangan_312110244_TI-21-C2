public class Lingkaran extends BangunDatar {
    int r;

    public Lingkaran(String warna, int r){
        super (warna) ;
        this.r = r;
    }

    @Override
    public void gambar(){
        System.out.println("Warna Lingkaran : " + warna);
    }
    @Override
     public float luas(){
            System.out.println("Menghitung Luas Lingkaran");
            System.out.println("r = " + r );
            System.out.println("Luas Lingkaran = " + (3.14 * r * r) + "cm^2");
            return 1;
      }   

    }