public class XorString {
    public static void main(String[] args) {
        for (char c : "Hello World".toCharArray())
            System.out.print((char) (c ^ 0));
    }
}
