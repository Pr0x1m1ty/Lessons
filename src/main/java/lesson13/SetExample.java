package lesson13;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> countrySet = new TreeSet<String>();
        countrySet.add("Russia");
        countrySet.add("France");
        countrySet.add("Hondusar");
        countrySet.add("Cot di vuar");
        countrySet.add("France");

        System.out.println(countrySet);

    }




}
