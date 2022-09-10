package oop.collections.list.linkedlist;

import java.util.ArrayList;

public class principal {

    public static void main(String []args)
    {
        ArrayList<LinkedList> nodos = new ArrayList<LinkedList>();
        arrayListIterator(nodos);
    }


    public static void arrayListIterator(ArrayList<LinkedList> nodos)
    {

        for (int i=0; i < nodos.size();i++)
        {
            Node nodo = nodos.get(i);
            String data = nodo.getData();
        }

    }
}
