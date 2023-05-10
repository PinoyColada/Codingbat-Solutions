public class StringTwo {

    /*
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++){
            newStr =  newStr + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }

}
