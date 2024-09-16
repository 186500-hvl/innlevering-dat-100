import java.util.Scanner;

public class O2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int poengsum;
            do {
                System.out.print("Skriv inn poengsummen til student " + i + ": ");
                poengsum = input.nextInt();

                if (poengsum < 0 || poengsum > 100) {
                    System.out.println("Ugyldig poengsum! Poengsummen må være mellom 0 og 100. Prøv igjen.");
                }
            } while (poengsum < 0 || poengsum > 100);

            if (poengsum >= 90) {
                System.out.println("Karakter: A");
            } else if (poengsum >= 80) {
                System.out.println("Karakter: B");
            } else if (poengsum >= 70) {
                System.out.println("Karakter: C");
            } else if (poengsum >= 60) {
                System.out.println("Karakter: D");
            } else if (poengsum >= 50) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }

        input.close();
    }
}

	

