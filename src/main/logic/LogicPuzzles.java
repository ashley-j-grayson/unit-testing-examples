package logic;

/**
 * Created by ashleygrayson on 28/07/2016.
 */
public class LogicPuzzles {

    public boolean logicValue(int a, int b, int c) {


        int total = a + b + c;

        if (total <= 10) {

            return true;
        } else {

            return false;
        }


    }

    public boolean numbersAreEqual(int a, int b) {

        if (a == b) {

            return true;
        } else {

            return false;
        }
    }

    public int getStringLength(String lengthOfString) {

        return String.valueOf(lengthOfString).length();
    }

    public String longestStringLength(String string1, String string2) {

        if (string1.length() > string2.length()) {

            return string1;

        } else if (string1.length() == string2.length()) {

            return string1 + string2;
        } else {

            return string2;
        }
    }
}

