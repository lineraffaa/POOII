package POOII.CollectionsFrameworkII;

import java.util.ArrayList;
import java.util.ListIterator;

public class Nome {

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Ana");
        name.add("Sara");
        name.add("Lucas");

        System.out.println("Ordem original " + name);

        ListIterator<String> list = name.listIterator(name.size());
        while (list.hasPrevious()) {

            System.out.println(list.previous() + " ");
        }

    }

}