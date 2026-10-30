import java.security.*;

public class SHA1 {
    public static void main(String[] args) throws Exception {
        for (byte b : MessageDigest.getInstance("SHA-1").digest("abc".getBytes()))
            System.out.printf("%02X", b);
    }
}
