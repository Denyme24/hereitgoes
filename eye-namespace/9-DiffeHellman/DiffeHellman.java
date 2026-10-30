import java.math.BigInteger;

public class DiffeHellman {
    public static void main(String[] args) {
        BigInteger p = BigInteger.valueOf(23), g = BigInteger.valueOf(5);
        BigInteger a = BigInteger.valueOf(6), b = BigInteger.valueOf(15);
        System.out.println(g.modPow(b, p).modPow(a, p));
        System.out.println(g.modPow(a, p).modPow(b, p));
    }
}
