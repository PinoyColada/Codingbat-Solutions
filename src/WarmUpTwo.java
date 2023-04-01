public class WarmUpTwo {
    /*
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
     */

    public String stringTimes(String str, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++){
            newWord += str;
        }
        return newWord;
    }

    /*
    Given a string and a non-negative int n, we'll say that the front of the string is
    the first 3 chars, or whatever is there if the string is less than length 3.
    Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"

     */

    public String frontTimes(String str, int n) {
        String newWord = "";
        if (str.length() < 3){
            for (int i = 0; i < n; i++){
                newWord += str;
            }
        } else {
            for (int i = 0; i < n; i++){
                newWord += str.substring(0,3);
            }
        }
        return newWord;
    }

    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed,
     so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3

     */

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                if (i + 1 >= str.length()){
                    continue;
                } else if (str.charAt(i + 1) == 'x') {
                    count++;
                }
            }
        }
        return count;
    }

    /*
    Given a string, return true if the first instance of "x" in the string is immediately
    followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
     */

    public boolean doubleX(String str) {
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'x'){
                if (i + 1 >= str.length()){
                    continue;
                } else if (str.charAt(i + 1) == 'x') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /*
    Given a string, return a new string made of every other char starting with the first,
    so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
     */

    public String stringBits(String str) {
        String newWord = "";
        for (int i = 0; i < str.length(); i += 2){
            newWord += str.charAt(i);
        }
        return newWord;
    }

    /*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        String newWord = "";
        for (int i = 0; i <= str.length(); i++){
            newWord += str.substring(0, i);
        }
        return newWord;
    }

    /*
    Given a string, return the count of the number of times that a substring length
    2 appears in the string and also as the last 2 chars of the string, so "hixxxhi"
    yields 1 (we won't count the end substring).

    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
     */

    public int last2(String str) {
        if (str.length() <= 2){
            return 0;
        }
        String lastTwo = str.substring(str.length() - 2);
        int counter = 0;
        for (int i = 0; i < str.length() - 2; i++){
            if (str.charAt(i) == lastTwo.charAt(0)){
                if (str.charAt(i + 1) == lastTwo.charAt(1)){
                    counter++;
                }
            }
        }
        return counter;
    }

    /*
    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9){
                counter++;
            }
        }
        return counter;
    }

    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false

     */

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 9 && i < 4){
                return true;
            }
        }
        return false;
    }

    /*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                if(i + 1 < nums.length && nums[i + 1] == 2 ){
                    if (i + 2 < nums.length && nums[i + 2] == 3 ){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* Given a string, return a string made of the chars at indexes
     0,1, 4,5, 8,9 ... so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */

    public String altPairs(String str) {
        String result = "";

        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }

    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
     ... so "kittens" yields "kien".


    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
     */
    public String stringYak(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else {
                result = result + str.charAt(i);
            }
        }

        return result;
    }







}
