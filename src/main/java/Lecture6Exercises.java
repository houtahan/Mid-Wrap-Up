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
        long sum = 0;
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
        int[] arr1 = new int[arr.length];
        for (int i = 0 ; i <= arr.length-1 ; i++) {
            arr1[i] = arr[arr.length-1-i];
        }
        return arr1;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double [][] temp = new double[m1.length][m2[0].length];
        if (m1[0].length != m2.length){
            throw new RuntimeException("Math not mathing!");
        }
        else{
            temp[0][0] = m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0];
            return temp;
        }
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0 ; i < names.length ; i++){
            List<String> res = new ArrayList<String>(Arrays.asList(names[i]));
            ans.add(res);
        }
        return ans;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        List<Integer> result = new ArrayList<>();
        int p;
        for (int i = 2 ; i <= n ; i++){
            p = 0;
            for (int j = 2 ; j <= i-1 ; j++){
                if (i % j == 0) {
                    p++;
                }
            }
            if (n % i == 0 && p == 0){
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
