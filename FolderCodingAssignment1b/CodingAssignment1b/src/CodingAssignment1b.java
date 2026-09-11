import java.util.Scanner;
public class CodingAssignment1b {
    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Welcolme to Mad Libs!");
        System.out.println("Enter an adjective");
        String adjective = s1.nextLine();
        System.out.println("Enter a verb (with -ed ending)");
        String verbed = s1.nextLine();
        System.out.println("Enter an adverb");
        String adverb = s1.nextLine();
        System.out.println("Enter a teacher name");
        String teacher = s1.nextLine();
        System.out.println("Enter a song title");
        String song = s1.nextLine();
        System.out.println("Enter a student name");
        String student = s1.nextLine();
        System.out.println("Enter a verb");
        String verb2 = s1.nextLine();
        System.out.println("It was a " + adjective + " day in AP CSA, when " + teacher + "burst into the doorway. They started singing " + song + " while " + student + " " + verbed + " with them. The whole class clapped as " + student + " did their signature dance move: the " + adverb + " " + verb2 + ".");
    }
}