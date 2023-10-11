import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbordet = new Scanner(System.in);
        System.out.println("C)");
        System.out.println("Ange ett heltal och klicka på mellanslag efter: ");
        String heltalet = tangentbordet.nextLine();
        int plats1 = heltalet.indexOf(" ", 0);
        String tal1_text = heltalet.substring(0, plats1);
        int heltal1 = Integer.parseInt(tal1_text);
        int addition = heltal1+7;
        int multiplikation = addition*2;
        int subrtraktion = multiplikation-6;
        int division = subrtraktion/2;
        int addition2 = division+3;
        int subrtraktion2 = addition2-heltal1;

        System.out.println("");
        System.out.println("Du har valt: "+heltal1);
        System.out.println("Vi adderar 7 på heltalet så får vi: ");
        System.out.println(addition);
        System.out.println("Vi multiplicerar heltalet med 2 så får vi: ");
        System.out.println(multiplikation);
        System.out.println("Vi subtraherar heltalet med 6 så får vi: ");
        System.out.println(subrtraktion);
        System.out.println("Vi halverar heltalet så får vi: ");
        System.out.println(division);
        System.out.println("Vi därefter adderar 3 med heltalet så får vi: ");
        System.out.println(addition2);
        System.out.println("Vi tillsist subtraherar heltalet med det ursprungliga. ");
        System.out.println("Vilket heltal vi än väljer blir tillslut i detta program: "+subrtraktion2);

    }
}