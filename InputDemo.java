package BasicJava;

import java.util.Scanner;
public class InputDemo {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int number;
        String name;

        System.out.println("Entetr any number:" +
                "");
        number=input.nextInt();
        input.nextLine();

        System.out.println("Entetr any name:" +
                "");
        name=input.nextLine();

        System.out.println("Number: "+number);
        System.out.println("Name: "+name);
    }
}
