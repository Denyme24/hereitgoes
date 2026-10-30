import java.util.*;

public class Caesercipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next(), e = "", d = "";
        int k = sc.nextInt();
        for (char c : t.toCharArray())
            e += (char) ((c - 'a' + k) % 26 + 'a');
        for (char c : e.toCharArray())
            d += (char) ((c - 'a' - k + 26) % 26 + 'a');
        System.out.println(e);
        System.out.println(d);
    }
}
