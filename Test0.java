import java.util.Scanner;

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
                default -> -1;
            };

            if(cost == -1) break;

            System.out.println("Cost is : " + cost);
        }

        sc.close();

    }

    static int pkgA(Scanner sc) {
        return sc.nextInt() * 350; 
    }

    static int pkgB(Scanner sc) {
        int guest = sc.nextInt();
        
        if (guest > 10) return -1;

        return guest < 6 ? guest * 420 : guest * 490;
    }

    static int pkgC(Scanner sc) {
        return sc.nextInt() * 530; 
    }

    static int pkgD(Scanner sc) {
        int particpantCost = sc.nextInt() * 670;

        System.out.println("Hom many photos : ");
        int costOfPic = sc.nextInt() * 12 * 88 ;

        return particpantCost + costOfPic;
    }
    
    
}
