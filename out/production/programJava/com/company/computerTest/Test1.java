package computerTest;

import java.util.Scanner;

public class Test1
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Trapezium t = new Trapezium();
        Scanner input = new Scanner(System.in);

        System.out.println("请输入图形形状：（圆/梯形）?");
        String type = input.next();
        if(type.equals("圆"))
        {
            System.out.println("请输入圆的半径：");
            double radius = input.nextDouble();
            c.setRadius(radius);
            System.out.println("The area of the circle is equal to "+c.getArea()+".");
        }
        if(type.equals("梯形"))
        {
            System.out.println("请输入梯形的上底边：");
            double upperBase = input.nextDouble();
            t.setUpperBase(upperBase);
            System.out.println("请输入梯形的下底边：");
            double bottomBase = input.nextDouble();
            t.setBottomBase(bottomBase);
            System.out.println("请输入梯形的高：");
            double height = input.nextDouble();
            t.setHeight(height);
            System.out.println("The area of the trapezium is equal to "+t.getArea()+".");
        }
    }
}
