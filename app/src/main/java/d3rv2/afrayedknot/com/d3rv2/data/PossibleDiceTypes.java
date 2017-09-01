package d3rv2.afrayedknot.com.d3rv2.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by redna on 7/31/2017.
 */

public class PossibleDiceTypes {

    public PossibleDiceTypes(){
        int i;
    }

    public static ArrayList<Integer> getDiceSidesIntegers(){

        ArrayList<Integer> sides = new ArrayList<Integer>();
        sides.add(1000);
        sides.add(100);
        sides.add(20);
        sides.add(12);
        sides.add(10);
        sides.add(8);
        sides.add(6);
        sides.add(4);
        sides.add(2);

        return sides;

    }

    public static ArrayList<String> getDiceSidesString(){

        ArrayList<String> diceSidesString = new ArrayList<String>();
        ArrayList diceSidesIntegers = getDiceSidesIntegers();

        for(int i = 0; i < diceSidesIntegers.size(); i++) {

            diceSidesString.add("d"+diceSidesIntegers.get(i));

        }

        return diceSidesString;

    }



}
