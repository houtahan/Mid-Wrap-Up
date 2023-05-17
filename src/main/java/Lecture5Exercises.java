import java.security.SecureRandom;
import java.util.Random;

public class Lecture5Exercises {

    /*
     *   implement a function to create a random password with
     *   given length using lower case letters
     *   lecture 5 page 14
     */
    public String weakPassword(int length) {
        int left = 97;
        int right = 122;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int result = left + (int) (random.nextFloat() * (right - left + 1));
            stringBuilder.append((char) result);
        }
        String resultInString = stringBuilder.toString();
        return resultInString;
    }

    /*
     *   implement a function to create a random password with
     *   given length and at least 1 digit and 1 special character
     *   lecture 5 page 14
     */
    public String strongPassword(int len) throws Exception {
        if (len < 3){
            throw new Exception("");
        }
        int left = 65;
        int right = 122;
        int left1 = 48;
        int right1 = 57;
        int left2 = 33;
        int right2 = 47;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(len);
        for (int i = 0; i < len - 2; i++) {
            int result = left + (int) (random.nextFloat() * (right - left + 1));
            stringBuilder.append((char) result);
        }
        for (int i = 0; i <= 0; i++) {
            int result1 = left1 + (int) (random.nextFloat() * (right1 - left1 + 1));
            stringBuilder.append((char) result1);
        }
        for (int i = 0; i <= 0; i++) {
            int result2 = left2 + (int) (random.nextFloat() * (right2 - left2 + 1));
            stringBuilder.append((char) result2);
        }
        String resultInString = stringBuilder.toString();
        return resultInString;
    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {
        int first = 0;
        int sec = 1;
        while (sec < n+1) {
            int third = first + sec;
            if (n - sec == Integer.bitCount(third)) {
                return true;
            }
            else {
                first = sec;
                sec = third;
            }
        }
        return false;
    }

}
