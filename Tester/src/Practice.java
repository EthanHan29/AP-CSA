import java.util.Scanner;
public class Practice {
    public static void sum(int x, int y){
        System.out.println(x+y);
    }
    public static void main(String[]args) {
        sum(5,2);
        System.out.println(Math.abs(-4));
        System.out.println((int)(Math.random()*7)+3);
        Rectangle r = new Rectangle();
        System.out.println(r.calcArea());
        Rectangle r2 = new Rectangle(2,3);
        System.out.println(r2.calcArea());
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        System.out.println(c1.calcArea());
        Rectangle r1 = new Rectangle(3,4);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
    }
}
