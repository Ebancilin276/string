public class p11 {
    public static void main(String[] args) {

        String s = "hello";
        String result = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }

        System.out.println(result);
    }
}