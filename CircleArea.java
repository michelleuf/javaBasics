import java.util.Scanner;

public class cArea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");

        int r =sc.nextInt();
        final float pi=3.14f;
        float area= pi*r*r;
        System.out.println(3.14f*r*r +" "+ area);
        System.out.println(Math.PI*r*r +" "+ area);
    }
}
