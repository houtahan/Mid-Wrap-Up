import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture6Exercises {

    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i += 2) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] arr1 = arr;
        for (int i = 0; i <= arr.length - 1; i++) {
            arr1[i] = arr[arr.length - 1 - i];
        }
        return arr1;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        try {
            System.out.println(1);
            System.out.println(1.5);
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        return m1;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {

        return null;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending orders
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2 ; i <= n ; i++){
            if (n % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public List<String> extractWord(String line) {
        List<String> strings = new ArrayList<>();
        for (String word : line.split("[^a-zA-Z]+")){
            strings.add(word);
        }
        return strings;
    }
}
