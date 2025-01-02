package linkedList;

import java.util.LinkedList;

public class useInJava {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("leo");
        list.addFirst("best is");
        list.addLast("messi");

        System.out.println(list);
        System.out.println(list.size());


        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

    }
}
