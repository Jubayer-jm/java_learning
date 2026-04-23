package BasicJava;
import java.util.Scanner;

public class TempConvert {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        double C,F;

        System.out.println("Enter the vale of c: ");
        C=input.nextDouble();

        F=9/5*C +32;

        System.out.println("F: "+ F);

    }
}
