
public class Tugas_mingguke2 {

    public static void main(String[] args) {
    int dayalistrik = 300;
    if (dayalistrik <=100) {
            System.out.println ("Tagihan pembayaran listrik = Rp" + dayalistrik*1500);
    }
    else if (dayalistrik >=110-500){
        System.out.println ("Tagihan pembayaran listrik = Rp" + dayalistrik*2000);
    }
    else {
        System.out.println ("Daya listrik melebihi maksimum");
        
    }
    }   
}
