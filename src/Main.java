public class Main {
    public static void main(String[] args){
        BangunDatar Lingkaran = new Lingkaran("Merah",14);
        BangunDatar Segitiga = new Segitiga("Hijau",3,5);
        BangunDatar Persegi = new Persegi("Kuning", 8,4);


        Lingkaran.gambar();
        Lingkaran.luas();
        System.out.println();
        
        Segitiga.gambar();
        Segitiga.luas();
        System.out.println();
        
        Persegi.gambar();
        Persegi.luas();







    }
    
}