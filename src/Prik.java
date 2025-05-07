import java.util.Scanner;

public class Prik {
    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        float first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextByte();
        System.out.print("Enter second num: ");
        second = num.nextByte();
        result = first / second;
        System.out.println("Result is - " + result);
        result = first + second;
        System.out.println("Result is - " + result);
    }
}
