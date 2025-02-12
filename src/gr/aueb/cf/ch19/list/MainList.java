package gr.aueb.cf.ch19.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Athens");
        cities.add("London");
        cities.add("NY");

        String city = cities.get(0);
//        System.out.println(city);

        int nyPosition = cities.indexOf("NY");
        if (nyPosition != -1) {
            cities.set(nyPosition, "New York");
            System.out.println("Done!");
        } else {
            System.out.println("NY not exists.");
        }

        if (cities.contains("Athens")) {
            cities.remove("Athens");
            System.out.println("Done!");
        } else {
            System.out.println("Athens not exists.");
        }

        cities.removeIf(c -> c.startsWith("A"));

        //Iterate
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String c : cities) {
            System.out.println(c);
        }

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        cities.forEach(System.out::println);


        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            String ccc = iter.next(); //ccc = city
            if (ccc.equals("NY")) {
                iter.remove();
                // cities.remove(city); //Exception
            }
        }
    }
}
