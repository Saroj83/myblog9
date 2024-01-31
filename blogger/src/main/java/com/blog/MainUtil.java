package com.blog;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainUtil {

    public static void main(String[] args) {

        Movie m1 = new Movie("bbb", 6,1999);
        Movie m2 = new Movie("aaa", 8,1986);
        Movie m3 = new Movie("ccc", 9,2000);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        MovieYear my = new MovieYear();
        Collections.sort(list ,my);
        System.out.println("Movies after sorting : ");
        for (Movie m:list) {

            System.out.println(m.getName() + " " +
                    m.getRating() + " " +
                    m.getYear());
        }




    }
}
