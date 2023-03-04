public class WarmUpOne {
    public static void main(String[] args) {
        sleepIn(true, false);

    }

    /* The parameter weekday is true if it is a weekday, and the
     parameter vacation is true if we are on vacation. We sleep in if it is not a weekday
     or we're on vacation. Return true if we sleep in.

     sleepIn(false, false) → true
     sleepIn(true, false) → false
     sleepIn(false, true) → true
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /*  We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
     */

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (!aSmile && !bSmile) || (aSmile && bSmile);
    }

    /* Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
     */
    public int sumDouble(int a, int b) {
        if (a == b){
            return (a + b) * 2;
        }
        return a + b;
    }





}