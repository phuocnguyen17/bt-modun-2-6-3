import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side1 of triangle: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 of triangle: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side3 of triangle: ");
        double side3 = sc.nextDouble();

        System.out.print("Enter color of triangle: ");
        String color = sc.next();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());

    }
}