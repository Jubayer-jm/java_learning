package BasicJava;
import java.util.Scanner;

public class Product3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int id;
        String title,price,description,category;

        System.out.println("Enter any id: ");
        id = input.nextInt();

        input.nextLine();

        System.out.println("Enter the tile name: ");
        title=input.nextLine();

        System.out.println("Enter the price : ");
        price=input.nextLine();

        System.out.println("Enter the description: ");
        description=input.nextLine();

        System.out.println("Enter the category: ");
        category=input.nextLine();

        System.out.println("id: "+id);
        System.out.println("Title: "+title);
        System.out.println("price: "+price);
        System.out.println("description: "+description);
        System.out.println("category: "+category);

    }
}
