import java.util.Scanner;
public class CodingAssignment1a {
    public static void main(String[]args) {
        Scanner s1 = new Scanner(System.in);
        //Problem 1
        System.out.print("Enter your name: ");
        String name = s1.nextLine();
        System.out.println("Hi " + name + ", welcome to AP CSA!");
        //Problem 2
        System.out.print("Please give me name one: ");
        String name1 = s1.nextLine();
        System.out.print("Please give me name two: ");
        String name2 = s1.nextLine();
        System.out.print("Please give me name three: ");
        String name3 = s1.nextLine();
        System.out.println(name3 + ", " + name2 + ", " + name1);
        //Problem 3
        System.out.print("How much do you weigh in pounds? ");
        double weight = s1.nextDouble();
        s1.nextLine(); //Realized that I don't really need it but just wanted to show that I know
        double merc = weight * 0.4;
        double venus = weight * 0.9;
        double mars = weight * 0.38;
        double jup = weight * 2.3;
        double sat = weight * 1.1;
        double ura = weight * 0.92;
        double nep = weight * 1.2;
        System.out.println("On Mercury, Venus, Mars, Jupiter, Saturn, Uranus, and Neptune, you would weigh the following: " + merc + ", " + venus + ", " + mars + ", " + jup + ", " + sat + ", " + ura + ", " + nep);
        //Problem 4
        System.out.print("Give me any amount of seconds: ");
        int seconds = s1.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int totalSeconds = seconds % 60;
        System.out.println(hours + " hours, " + minutes + " minutes, " + totalSeconds + " seconds.");
    }
}