public class p13 {
    public static void main(String[] args) {

        String s = "Madam";

        int left = 0;
        int right = s.length() - 1;

        boolean palindrome = true;

        while (left < right) {

            char a = s.charAt(left);
            char b = s.charAt(right);

            if (a >= 'A' && a <= 'Z') {
                a = (char)(a + 32);
            }

            if (b >= 'A' && b <= 'Z') {
                b = (char)(b + 32);
            }

            if (a != b) {
                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);
    }
}