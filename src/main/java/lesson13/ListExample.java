package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    @Test
    public void kaef(){

        List<String> stringList = new ArrayList<String>();
        stringList.add("Jack");
        stringList.add("Slava");
        stringList.add("Timur");
        stringList.add("Pave;");
        System.out.println(stringList);
    }
}
