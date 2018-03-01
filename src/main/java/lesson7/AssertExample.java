package lesson7;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({MyTestListener.class})
public class AssertExample {

    @Test
    public void someAssert (){
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertFalse(5>8, "Проверка 5 > 8");
    }


    @Test
    public void someAssert2 (){
        Assert.assertEquals(5, 5);
        Assert.assertEquals("Jack", "Jack");
        Assert.assertTrue(5>8, "Проверка 5 > 8");
    }

}
