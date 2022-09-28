package Q1;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorOnList {

    public static void main(String[] args) {
        ArrayList<Float> floatNums =  new ArrayList<Float>();

        floatNums.add(1.5F);
        floatNums.add(2.9F);
        floatNums.add(10.5F);
        floatNums.add(11.1F);
        floatNums.add(7.8F);

        Iterator<Float> iterator = floatNums.iterator();
        Float Sum = 0.0F;
        while (iterator.hasNext()){
            Sum += iterator.next();
        }

        System.out.println("Sum :  " + Sum);
    }



}
