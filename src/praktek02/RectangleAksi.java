package praktek02;

public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.Harga_bebek = 35000;
        r1.Jumlah_beli = 5;
        
        r1.cetakInfo();
        System.out.println("Total Rectangle ="+r1.hitungTotal());
        r1.cetakTotal();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
        Rectangle r3 = new Rectangle(70000,2);
        r3.cetakInfo();
    }
    
}
