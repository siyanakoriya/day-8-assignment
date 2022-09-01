
import javax.sound.sampled.Line;
        import java.util.Scanner;

class Line3Comparison {
    public static void main(String[] args) {
        System.out.println("Lines comparison");

        int x1,x2,y1,y2;
        int a1,b1,a2,b2;
        int a=0,b=0,c=0;
        double sqrt,line1,line2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter co-ordinates of line1");
        System.out.println("Enter x1:");
        x1=sc.nextInt();
        System.out.println("Enter y1:");
        y1=sc.nextInt();
        System.out.println("Enter x2:");
        x2=sc.nextInt();
        System.out.println("Enter y2:");
        y2=sc.nextInt();
        System.out.println("("+x1+","+x2+") ("+y1+","+y2+")");

        line1=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
        System.out.println(""+line1);
        double len_line1 = Math.sqrt(line1);
        System.out.println(len_line1);

        System.out.println("Enter co-ordinates of line2");
        System.out.println("Enter a1:");
        a1=sc.nextInt();
        System.out.println("Enter b1:");
        b1=sc.nextInt();
        System.out.println("Enter a2:");
        a2=sc.nextInt();
        System.out.println("Enter b2:");
        b2=sc.nextInt();
        System.out.println("("+a1+","+a2+") ("+b1+","+b2+")");

        line2=Math.pow((a2-a1),2)+Math.pow((b2-b1),2);
        System.out.println(""+line2);
        double len_line2 = Math.sqrt(line2);
        System.out.println(len_line2);

        compareTo(len_line1,len_line2);
    }

    private static void compareTo(double len_line1, double len_line2){
        if(len_line1==len_line2){
            System.out.println("Lines are equal");
        }
        else if (len_line1>len_line2) {
            System.out.println("Line1 is greater than line2");
        }
        else {
            System.out.println("Line2 is greater than line1");
        }
    }

}