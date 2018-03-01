package lesson4.loops.Conditions;

public class StringEqualsExample {

    String str1 = new String("Привет");
    String str2 = new String("Привет");
    String sameStr = str1;

    boolean b1 = str1 == str2; //b1 - false
    boolean b2 = str1.equals(str2); //true
    boolean b3 = str1 == sameStr; //true

}
