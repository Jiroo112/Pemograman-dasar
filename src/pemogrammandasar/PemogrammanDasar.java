package pemogrammandasar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PemogrammanDasar {

    //Fungsi non static
    public static void main(String[] args) {
        //Pemanggilan Scanner
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("=========");
        System.out.println("| Kubus |");
        System.out.println("=========");
        System.out.print("Masukkan panjang sisi : ");
        double s = input.nextDouble();
        
        double volume = s*s*s;
        double lp = 6*s*s;
        
        System.out.println("Volume : " + df.format(volume));
        System.out.println("Luas Permukaan : " + df.format(lp));
    }
    
}
