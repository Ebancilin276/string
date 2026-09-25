public class p10 {
    public static void main(String[] args) {

        String s = "ABC";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            System.out.println(ch + "=" + (int) ch);
        }
    }
}