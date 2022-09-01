public class Line1Calculate {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int x1=1,x2=5,y1=4,y2=9;
        int a=0,b=0,c=0;
        double sqrt;
        System.out.println("("+x1+","+x2+") ("+y1+","+y2+")");

        a=((x2-x1)*(x2-x1));
        System.out.println("a :"+a);

        b=((y2-y1)*(y2-y1));
        System.out.println("b :"+b);

        c=a+b;
        System.out.println("c :"+c);

        sqrt=Math.sqrt(c);
        System.out.println("Lenth of line  :"+sqrt);

    }

}
