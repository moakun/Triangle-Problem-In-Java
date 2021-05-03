import java.util.Scanner;

public class TriangleProblem {
    public static void main(String [] args){
        int a,b,c;
        String isTriangle;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Three Integers that will be the sides of the triangle make" +
                " them shorter that 200!");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        while((a > 200 || b > 200 || c > 200) || (a < 1 || b < 1 || c < 1)){
            System.out.println("Please Enter A Valid Number That Is Under 200");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

        }

        if( a<b+c && b<a+c && c<a+b ){
            isTriangle = "Yes";
        }else{
            isTriangle = "No";
            System.out.println("NOT A TRIANGLE");
        }

        if (isTriangle.equals("Yes")){
            if ((a==b) && (b==c)){
                System.out.println("EQUILATERAL");
            } else if ((a!=b) && (a!=c) && (b!=c)){
                System.out.println("SCALENE");
            }else if ((a == b) || (a == c) || (b == c)){
                System.out.println("ISOSCELES");
            }
        }
    }
}
