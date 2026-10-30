public class AndXorString {
    public static void main(String[] args) {
        String s = "Hello World", x = "";
        for (char c : s.toCharArray()) {
            System.out.print((char) (c & 127));
            x += (char) (c ^ 127);
        }
        System.out.println();
        for (char c : x.toCharArray())
            System.out.print((char) (c ^ 127));
    }
}
