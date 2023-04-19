public class Lecture4Exercises {

    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        int A = 1;
        for (int i = n ; i >=1 ; i--){
            A = A * i;
        }
        return A;
    }

    /*
     *   implement a function that returns nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        int first = 1, second = 1, temp;
        if (n == 1)
            return first;
        if (n == 2)
            return second;
        for (int i = 3; i <= n; i++){
            temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    /*
     *   implement a function that returns reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        char[] a = word.toCharArray();
        char[] FA = word.toCharArray();
        for (int i = word.length()-1 ; i >= 0 ; i--){
            FA[word.length()-1-i] = a[i];
        }
        String res = String.valueOf(FA);
        return res;
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        String newLine = line.replace(" ", "");
        String lower = newLine.toLowerCase();
        char[] result = lower.toCharArray();
        char[] result2 = lower.toCharArray();
        for (int i = result.length-1 ; i >= 0 ; i--){
            result2[result.length-1-i] = result[i];
        }
        System.out.println(newLine);
        System.out.println(lower);
        String result11 = String.valueOf(result);
        String result22 = String.valueOf(result2);
        System.out.println(result11);
        System.out.println(result22);
        if (result11.equals(result22)){
            return true;
        }
        else {
            return false;
        }
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char [][] chars = new char[str1.length()][str2.length()];
        for (int i = 0 ; i <= str1.length()-1 ; i++){
            for (int j = 0 ; j <= str2.length()-1 ; j++){
                if (str1.charAt(i) == str2.charAt(j)){
                    chars[i][j] = '*';
                }
                else {
                    chars[i][j] = ' ';
                }
            }
        }
        return chars;
    }
}
