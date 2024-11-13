public class A-104 {
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        int ways = 0;

        for (int value = 2; value <= 10; value++) {
            if (value <= n - 10) {
                ways += 4; // Four cards of each value
            } else if (value == n - 10) {
                ways += 15; // All face cards (jacks, queens, kings, and tens)
            }
        }

        System.out.println(ways);
    }
}
    
}
