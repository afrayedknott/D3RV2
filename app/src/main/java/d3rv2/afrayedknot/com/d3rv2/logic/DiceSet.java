package d3rv2.afrayedknot.com.d3rv2.logic;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


/**
 * Created by redna on 6/22/2017.
 */

public class DiceSet {

    private Dice Dice;
    private int dieCount;
    private HashMap<Dice, Integer> diceSets = new HashMap<Dice, Integer>();

    DiceSet(Dice Dice, int dieCount){

        DiceSet diceSet = new DiceSet(Dice, dieCount);

    }

    private int roll(int sides){

        Random roll = new Random();
        return roll.nextInt(sides) + 1;

    }

    public ArrayList<Integer> rollAll(){

        ArrayList<Integer> recordOfResults = new ArrayList<>(dieCount);

        for(int dieRollIter = 0; dieRollIter < dieCount; dieRollIter++){

            int result = roll(20);
            recordOfResults.add(result);
            Log.i("hng",Integer.toString(result));

        }

        return recordOfResults;

    }

}
