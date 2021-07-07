import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class text {

    @Test
    @Before
    public void text01() {
        System.out.println("1");
    }
    @Test
    @After
    public void text02() {
        System.out.println("9");
    }
    @Test
    public void text03() {
        System.out.println("HelloWorld");
    }

}
