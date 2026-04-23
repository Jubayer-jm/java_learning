package BasicJava;
import java.util.Scanner;

public class Triangle {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double base,height,area;

        System.out.println("Emnter the base: ");
        base=input.nextDouble();

        System.out.println("Enter the heioght:");
        height=input.nextDouble();

        area=1/2*(base*height);

        System.out.println("The are of the Traingle: "+ area +"sq m");

    }
}
