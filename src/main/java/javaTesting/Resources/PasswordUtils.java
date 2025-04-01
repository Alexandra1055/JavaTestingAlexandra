package javaTesting.Resources;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABETO = "0123456789ABCDEFG"; //esto deberia estar mas completo

    public static String genSalt(){
        return genSalt(8);
    }

    public static String genSalt(int l){
        StringBuilder valor = new StringBuilder(l);

        for (int i = 0; i < l; i++) {
            valor.append(ALPHABETO.charAt(RANDOM.nextInt(ALPHABETO.length())));
        }

        return new String(valor);
    }

    public static String genSecurePassword(String password, String salt){
        String result = null;

        return hashedPassword(password,salt);
    }

    public static String hashedPassword(String password, String salt) {


        MessageDigest md;
        String result = "";

        try {
            md = MessageDigest.getInstance("SHA-256");
            md.update((salt + password).getBytes());
            //result = (md.digest()).toString();
            result = new String( md.digest());
        }catch (NoSuchAlgorithmException nsae){
            System.out.println("Algoritmo de hash erroneo");
            System.exit(1);
        }

        return result;
    }

    public static boolean verifyUserPassword (String passwordEntered, String userSalt, String securePassword){
        return securePassword.equals(hashedPassword(passwordEntered,userSalt));
    }

}
