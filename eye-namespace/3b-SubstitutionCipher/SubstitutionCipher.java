import java.util.*;

public class SubstitutionCipher {
    public static void main(String[] args) {
        String r = "";
        for (char c : new Scanner(System.in).next().toCharArray())
            r += (char) ('z' - c + 'a');
        System.out.println(r);
    }
}
