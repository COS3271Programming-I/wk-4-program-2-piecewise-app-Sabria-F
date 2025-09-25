import java.util.Scanner;
public class PiecewiseApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        //Have the user choose a value for x.
        System.out.print("Enter a number to set x equal to --> ");
        Double x = userinput.nextDouble();
        userinput.nextLine();

        //Create some space for formatting purposes.
        System.out.println("\n");

        //Compute f(x) for x<0.
        if (x<0) {
          System.out.println("When x = "+x+" then f(x) = "+(3*x+7)+".");  
        }

        //Compute f(x) for 0<=x<=10.
        if (0<=x && x<=10) {
            System.out.println("When x = "+x+" then f(x) = "+(x*x+8)+".");
        }

        //Compute f(x) for x>10.
        if (x>10) {
            System.out.println("When x = "+x+" then f(x) = "+(x*x*x-(x*x)*6)+".");
        }
}}
