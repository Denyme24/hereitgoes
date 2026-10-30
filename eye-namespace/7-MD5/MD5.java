import java.security.*;

public class MD5 {
    public static void main(String[] args) throws Exception {
        for (byte b : MessageDigest.getInstance("MD5").digest("abc".getBytes()))
            System.out.printf("%02X", b);
    }
}
