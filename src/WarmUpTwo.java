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


}
