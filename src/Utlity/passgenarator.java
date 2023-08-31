package Utlity;

import java.util.Random;

public class passgenarator {
    public static String generateRandomPassword(int length) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789.@-_*!#?$";

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            password.append(randomChar);
        }

        return password.toString();
    }
}