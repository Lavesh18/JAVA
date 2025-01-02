package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements

        list.add(0);
        list.add(2);

        System.out.println(list);

        //get elements

        System.out.println(list.get(0));

        //to add elem in btw
        list.add(0, 1);
        System.out.println(list);


        //set eleme

        list.set(0, 100);
        System.out.println(list);


        //delete elem
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();

        //sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
