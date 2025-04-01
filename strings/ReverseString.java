package strings;


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Reverse
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}

