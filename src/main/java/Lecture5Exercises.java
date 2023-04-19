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
        for (int i = 0 ; i < length ; i++){
            int result = left + (int) (random.nextFloat() * (right-left+1));
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
        return true;
    }
}
