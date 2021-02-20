package assignment02upload;

import java.util.Scanner;

public class Assignment02upload {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("I can compute the circumference of one of the followings: Rect, Square, or Triangle ");

        System.out.print("Enter a shape:");
        String shape = input.nextLine().trim();

        double circum = 0;

        if (shape.equals("Rect")) {

            System.out.println("Please enter a width and height");
            double width = input.nextInt();
            double height = input.nextInt();
            circum = 2 * (width + height);
            System.out.println("Shape = Rect");
            System.out.println("Width = " + width);
            System.out.println("height = " + height);
            System.out.println("The circumference is: " + circum);

        } else if (shape.equals("Square")) {

            System.out.println("Please enter a side");
            int side = input.nextInt();
            circum = 4 * side;
             System.out.println("Shape = Square");
             System.out.println("The side is " + side);
            System.out.println("The circumference is: " + circum);

        }
        
        else if(shape.equals("Triangle")){
            System.out.println("Please enter 3 sides");
            int side1 = input.nextInt();
            int side2 = input.nextInt();
            int side3 = input.nextInt();
            circum = side1 + side2 + side3;
            System.out.println("Shape = Triangle");
            System.out.println("Side 1 = " + side1);
            System.out.println("Side 2 = " + side2);
            System.out.println("Side 3 = " + side3);
            System.out.println("The circumference is: " + circum);
            
        }

    }

}
