package pemogrammandasar;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FungsiStatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("=========");
        System.out.println("| Kubus |");
        System.out.println("=========");
        System.out.print("Masukkan panjang sisi : ");
        double sisi = input.nextDouble();
        
        double volume = volume(sisi);
        double lp = luas_p(sisi);
        System.out.println("Volume : " + df.format(volume));
        System.out.println("Luas Permukaan : " + df.format(lp));
    }
    static double volume(double s){
        double volume = s*s*s;
        return volume;
    }
    static double luas_p(double s){
        double lp = 6*s*s;
        return lp;
    }
}
