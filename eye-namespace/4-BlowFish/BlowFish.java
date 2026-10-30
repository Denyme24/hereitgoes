import java.io.*;
import java.util.Base64;
import javax.crypto.*;

public class BlowFish {
    public static void main(String[] args) throws Exception {
        KeyGenerator g = KeyGenerator.getInstance("Blowfish");
        g.init(128);
        Cipher c = Cipher.getInstance("Blowfish/CFB/NoPadding");
        c.init(Cipher.ENCRYPT_MODE, g.generateKey());
        System.out.println(Base64.getEncoder().encodeToString(c.getIV()));
        CipherOutputStream o = new CipherOutputStream(new FileOutputStream("outputFile.txt"), c);
        o.write(new FileInputStream("inputFile.txt").readAllBytes());
        o.close();
    }
}
