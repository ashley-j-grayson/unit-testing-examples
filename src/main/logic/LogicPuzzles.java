package logic;

/**
 * Created by ashleygrayson on 28/07/2016.
 */
public class LogicPuzzles {

    public boolean logicValue(int a, int b, int c) {


        int total = a + b + c;

        if (total <= 10) {

            return true;
        }

        else {

            return false;
        }


    }
}

