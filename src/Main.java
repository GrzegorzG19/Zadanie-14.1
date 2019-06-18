import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> listing = new ArrayList<>();
        System.out.println("Podaj liczby do dodania, ale nie na minusie");
        do {
            a = scan.nextDouble();
            if (a > 0) {
                listing.add(a);
            }
        } while (a > 0);
        System.out.println("Podana liczba jest ujemna kończę wczytywać");
        System.out.println(listing.toString());

        for (int i = listing.size() - 1; i >= 0; --i) {
            System.out.print(listing.get(i) + " ");
        }
        System.out.println();
        sum(listing);
        System.out.println();
        lowBig(listing);

    }

    public static void lowBig(ArrayList<Double> listing) {

        Double big = listing.get(0);
        for (int i = 0; i < listing.size(); i++) {
            if (listing.get(i) > big) {
                big = listing.get(i);
            }
        }
        Double lowest = listing.get(0);
        for (int i = 0; i < listing.size(); i++) {
            if (lowest > listing.get(i)) ;
            {
                lowest = listing.get(i);
            }
        }
        System.out.printf("najwieksza to %f a najmniejsza to %f", big, lowest);
    }

    public static void sum(ArrayList<Double> listing) {
        double b = 0;
        for (int i = 0; i < listing.size(); i++) {
            if (i < listing.size() - 1) {
                b += listing.get(i);
                System.out.print(listing.get(i) + " + ");
            } else {
                b += listing.get(i);
                System.out.print(listing.get(i));
            }
        }
        System.out.print(" = " + b);
    }
}
