import java.util.Scanner;
public class CodingAssignment1c {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter in the first number: ");
        double num1 = s1.nextDouble();
        System.out.println("Enter in the second number: ");
        double num2 = s1.nextDouble();
        s1.nextLine();
        System.out.println("Enter first word: ");
        String word1 = s1.nextLine();
        System.out.println("Enter second word: ");
        String word2 = s1.nextLine();
        
        Calculator calc = new Calculator(num1, num2);
        StringManipulator manip = new StringManipulator(word1, word2);

        System.out.println("Sum: " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product: " + calc.multiply());
        System.out.println("Quotient: " + calc.divide());
        System.out.println("Power: " + calc.power());
        System.out.println("Absolute Difference: " + calc.absoluteDifference());
        System.out.println("Square root of sum: " + calc.squareRootOfSum());
        System.out.println("Random number: " + calc.randomBetweenNums());
        System.out.println("Combined: " + manip.combineStrings());
        System.out.println("Combined length: " + manip.getCombinedLength());
        System.out.println("First half: " + manip.firstHalf());
        System.out.println("Index of letter: " + manip.indexOfFirstLetter());
        System.out.println("Swapped: " + manip.swapFirstAndSecondHalf());
    }
}
