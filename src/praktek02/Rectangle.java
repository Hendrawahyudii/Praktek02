package praktek02;

public class Rectangle {
    Integer Harga_bebek;
    Integer Jumlah_beli;

    public Rectangle() {
        Harga_bebek=40000;
        Jumlah_beli=2;
    }
    
    void cetakInfo(){
        System.out.println("============================");
        System.out.println("Herga Bebek :"+Harga_bebek);
        System.out.println("Jumlah Beli :"+Jumlah_beli);
        System.out.println("============================");
    }
    Integer hitungTotal(){
        Integer Total;
        Total = Harga_bebek*Jumlah_beli;
        return Total;
    }
    void cetakTotal(){
        System.out.println("Totalnya adalah: "+hitungTotal());
    }
    
}
