import java.util.Scanner;

public class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());  // Read number of lines

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                if (word.equals(word.toUpperCase())) {
                    // Word is an acronym, keep it as is
                    result.append(word);
                } else {
                    // Convert to title case
                    result.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        result.append(word.substring(1).toLowerCase());
                    }
                }
                result.append(" ");
            }

            System.out.println(result.toString().trim());
        }

        sc.close();
    }
}
