package lesson13;

import java.util.*;

public class MovieTitleComparator implements Comparator<Movie>{


    public int compare(Movie o1, Movie o2) {
        return o1.title.compareTo(o2.title);
    }
}
