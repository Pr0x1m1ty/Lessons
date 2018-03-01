package lesson13;

import org.testng.annotations.Test;

import java.util.*;

public class MovieCompareExample {


    @Test
            public void sortIt(){

        List<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(2.3,"A film"));
        list.add(new Movie(2.4, "B film"));
        list.add(new Movie(2.5, "C film"));
        list.add(new Movie(5.1, "Great film"));

        Collections.sort(list, new MovieTitleComparator().reversed());
        System.out.println(list);


//        Collections.sort(list);
//        System.out.println(list);


        Set<Movie> moviesSet = new TreeSet<>();
        moviesSet.add(new Movie(3.1, "ABC film"));
        moviesSet.add(new Movie(4.1, "FF film"));
        System.out.println(moviesSet);

    }


}
