package d3rv2.afrayedknot.com.d3rv2.logic;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by redna on 5/3/2017.
 */

public class Dice{

    private int dieSides, dieCount, dieTotalModifier, dieAdvantageState;

    Dice(int sides, int count, int modifier, int advantageState){

        Dice dice = new Dice(dieSides, dieCount, dieTotalModifier, dieAdvantageState);

    }

    //roll action of individual dice object
    private int roll(int sides){

        Random roll = new Random();
        return roll.nextInt(sides) + 1;

    }

    //calculation of total
    private int rollTotalCalculate(int modifier){

        return roll(dieSides) + modifier;

    }

}
