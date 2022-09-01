
class LineEquals {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        int a1=1,b1=0,c1=3;
        int a2=2,b2=6,c2=-4;
        int x,y,z;

        x=a1/a2;
        y=b1/b2;
        z=c1/c2;
        if(x==y && x==z && y==z)
        {
            System.out.println("Lines are equal");
        }
        else
        {
            System.out.println("Lines are not equal");
        }
    }
}