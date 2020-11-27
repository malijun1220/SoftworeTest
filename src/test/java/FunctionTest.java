import org.junit.Test;

/**
 * @author MALIJUN
 * @content
 * @date 2020/11/26 - 22:08
 */
public class FunctionTest {

    @Test
    public void run1() {
        System.out.println("testrun1");
        Function test = new Function(5000);
        test.run(false);
        test.run(true);
    }
    @Test
    public void run2(){
        System.out.println("testrun2");
        Function test = new Function(300);
        test.run(false);
        test.run(true);
    }
    @Test
    public void run3() {
        System.out.println("testrun3");
        Function test = new Function(1000);
        test.run(true);
        test.run(false);
    }
}
