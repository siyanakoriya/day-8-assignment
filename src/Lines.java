
import java.util.Scanner;

public class Lines {
    static int x1, x2, y1, y2;
    static int a1, a2, b1, b2;
    static double len_line1;
    static double len_line2;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates of line1");
        System.out.println("Enter x1:");
        x1 = sc.nextInt();
        System.out.println("Enter y1:");
        y1 = sc.nextInt();
        System.out.println("Enter x2:");
        x2 = sc.nextInt();
        System.out.println("Enter y2:");
        y2 = sc.nextInt();
        System.out.println("(" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");

        System.out.println("Enter co-ordinates of line2");
        System.out.println("Enter a1:");
        a1 = sc.nextInt();
        System.out.println("Enter b1:");
        b1 = sc.nextInt();
        System.out.println("Enter a2:");
        a2 = sc.nextInt();
        System.out.println("Enter b2:");
        b2 = sc.nextInt();
        System.out.println("(" + a1 + "," + b1 + ") (" + a2 + "," + b2 + ")");

        //line1 calculation
        line1Calculation(x1, y1, x2, y2);

        //line2 calculation
        line2Calculation(a1, b1, a2, b2);

        //compare
        compareTo(len_line1, len_line2);

    }

    static double line1Calculation(int x1, int x2, int y1, int y2) {
        int line1;
        line1 = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("" + line1);
        len_line1 = Math.sqrt(line1);
        //System.out.println(len_line1);
        return len_line1;
    }

    public static double line2Calculation(int a1, int a2, int b1, int b2) {
        int line2;
        line2 = (int) (Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("" + line2);
        len_line2 = Math.sqrt(line2);
        //System.out.println(len_line2);
        return len_line2;
    }

    public static void compareTo(double len_line1, double len_line2) {
        if (len_line1 == len_line2) {
            System.out.println("Lines are equal");
        } else if (len_line1 > len_line2) {
            System.out.println("Line1 is greater than line2");
        } else {
            System.out.println("Line2 is greater than line1");
        }
    }
}