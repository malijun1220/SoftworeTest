import org.junit.Test;

/**
 * @author MALIJUN
 * @content
 * @date 2020/11/26 - 22:08
 */
public class FunctionTest {
    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("INIT!");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("After");
    }

    @Test
    public void run1() {
        Function test = new Function(  5000);
        test.run(false);
        System.out.println();
        test.run(true);
    }
    @Test
    public void run2(){
        Function test = new Function(500);
        test.run(false);
        System.out.println();
        test.run(true);
    }
    @Test
    public void run3() {
        Function test = new Function(5000);
        test.run(true);
        System.out.println();
        test.run(false);
    }
}
