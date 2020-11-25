package test;

import org.junit.Test;

import MontyHallProblem.Function;

/**
 * @author MALIJUN
 * @content  三门问题测试，这Junit里面，可以直接对功能进行测试，而不需要Main函数
 * @date 2020/11/4 - 19:28
 */
public class FunctionTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("测试前的初始化工作!");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("测试完后的垃圾回收");
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