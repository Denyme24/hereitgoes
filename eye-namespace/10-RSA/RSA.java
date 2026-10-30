import java.math.BigInteger;
import java.util.*;

public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger p = sc.nextBigInteger(), q = sc.nextBigInteger(), m = sc.nextBigInteger();
        BigInteger n = p.multiply(q);
        BigInteger f = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = BigInteger.valueOf(3);
        while (!f.gcd(e).equals(BigInteger.ONE))
            e = e.add(BigInteger.ONE);
        BigInteger d = e.modInverse(f);
        BigInteger c = m.modPow(e, n);
        System.out.println(e + " " + d + " " + n);
        System.out.println(c);
        System.out.println(c.modPow(d, n));
    }
}
