import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int digits = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (!((ch >= 'a' && ch <= 'z') ||
                         (ch >= 'A' && ch <= 'Z'))) {
                special++;
            }
        }

        System.out.println("Digits = " + digits);
        System.out.println("Special = " + special);
    }
}

