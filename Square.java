/*
 Q2. Write a program to calculate area and perimeter of Square.
     Side should be initialized with fixed value.
*/

public class Square {
    public static void main(String[] args) {
        // Fixed side length value
        double side = 5.0;  // You can change this value as needed

        // Calculate area and perimeter
        double area = side * side;
        double perimeter = 4 * side;

        // Print the results
        System.out.println("For a square with side length " + side + " :");
        System.out.printf("Area is = " + area +" and ");
     // System.out.printf("Area is = " + side * side +" and ");
        System.out.println("Perimeter is = "+ perimeter);
     // System.out.println("Perimeter is = "+ 4 * side);
    }
}