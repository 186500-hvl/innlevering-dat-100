
import java.util.Scanner;

public class O1 {

    public static double beregnTrinnskatt(double bruttoinntekt) {
        double trinnskatt = 0;

        if (bruttoinntekt <= 208050) {
            return trinnskatt; // Ingen trinnskatt under fribeløpet
        }

        double[][] trinn = {
            {292850, 0.017},   // Trinn 1: 1,7%
            {669999, 0.04},    // Trinn 2: 4%
            {937899, 0.136},   // Trinn 3: 13,6%
            {1350000, 0.166}   // Trinn 4: 16,6%
        };

        for (double[] grenseOgSats : trinn) {
            double grense = grenseOgSats[0];
            double sats = grenseOgSats[1];

            if (bruttoinntekt <= grense) {
                trinnskatt += (bruttoinntekt - 208050) * sats;
                break; // Stopp når vi har nådd riktig trinn
            } else {
                trinnskatt += (grense - 208050) * sats;
            }
        }

        if (bruttoinntekt > 1350000) { // Trinn 5: 17,6%
            trinnskatt += (bruttoinntekt - 1350000) * 0.176;
        }

        return trinnskatt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Oppgi bruttoinntekt: ");
        double bruttoinntekt = scanner.nextDouble();

        double trinnskattBelop = beregnTrinnskatt(bruttoinntekt);
        System.out.printf("Trinnskatten er: %.2f kroner%n", trinnskattBelop);

        scanner.close();
    }
}


