import java.util.*;

public class transposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next().toUpperCase(), p = sc.next().toUpperCase(), e = "";
        int n = k.length();
        while (p.length() % n != 0)
            p += 'X';
        Integer[] o = new Integer[n];
        for (int i = 0; i < n; i++)
            o[i] = i;
        Arrays.sort(o, (x, y) -> k.charAt(x) - k.charAt(y));
        for (int j : o)
            for (int i = j; i < p.length(); i += n)
                e += p.charAt(i);
        System.out.println(e);
    }
}
