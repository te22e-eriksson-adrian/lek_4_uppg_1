import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Divisionsprogram:
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Divisions program:");
        System.out.print("Ange tal 1: ");
        int tal1 = tangentbord.nextInt();
        System.out.print("Ange tal 2: ");
        int tal2 = tangentbord.nextInt();
        double kvot;
        kvot = (double) tal1 / tal2;
        System.out.println("Kvoten är: "+kvot);
        int hel_kvot = (int) kvot;
        System.out.println("Kvoten är: "+hel_kvot);
        tangentbord.nextLine();
        System.out.println("      ");
        
        //Substantivomvandling:
        System.out.print("Ange ett susbstantiv: ");
        String substantiv = tangentbord.nextLine();
        System.out.print("Ange substantivets pluraländelse: ");
        String pluralandelse1 = tangentbord.nextLine();
        System.out.println("En "+substantiv+", flera "+substantiv+pluralandelse1);
        tangentbord.close();
    }
}
