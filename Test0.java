import java.util.Scanner;

/*
solution for Q1
*/

public class Test0 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
  
        while (true) {

            System.out.println("Enter Package ID : ");
            char pkgId = sc.next().charAt(0);
            
            int cost = switch (pkgId) {
                case 'a'-> pkgA(sc);
                case 'b'-> pkgB(sc);
                case 'c'-> pkgC(sc);
                case 'd'-> pkgD(sc);
                default -> -1; // x or other character 
            };

            // trigger to exit program
            // when switch returns : -1
            if(cost == -1) break;

            System.out.println("Cost is : " + cost);
        }

        sc.close();

    }

    // Package A Calculations
    static int pkgA(Scanner sc) {
        return sc.nextInt() * 350; 
    }

    // Package B Calculations
    static int pkgB(Scanner sc) {
        int guest = sc.nextInt();
        
        if (guest > 10) return -1;

        return guest < 6 ? guest * 420 : guest * 490;
    }

    // Package C Calculations
    static int pkgC(Scanner sc) {
        return sc.nextInt() * 530; 
    }

    // Package D Calculations
    static int pkgD(Scanner sc) {
        int particpantCost = sc.nextInt() * 670;

        System.out.println("Hom many photos : ");
        int costOfPic = sc.nextInt() * 12 * 88 ;

        return particpantCost + costOfPic;
    }
    
    
}
