package MontyHallProblem;

import static org.apache.commons.math3.util.FastMath.random;

/**
 * @author MALIJUN
 * @content
 * @date 2020/11/4 - 17:18
 */
public class Function {
    private int totalTest;

    public Function(int totalTest) {
        //若数据太小，则不足以说明概率性,抛数据异常
        if (totalTest <= 1000) {
            throw new IllegalArgumentException("totalTest must be larger than 300!" +
                    "otherwise it's not statistically significant!");
        }

        this.totalTest = totalTest;
    }

    public void run(boolean changeDoor) {

        int winTheCar = 0;

        for (int i = 0; i < totalTest; i++) {
            if (isChangeDoor(changeDoor)) {
                winTheCar++;
            }
        }

        System.out.println(changeDoor ? "Change the door!" : "Not change! ");
        System.out.println("winning rate :" + (double) winTheCar / totalTest);

    }

    private boolean isChangeDoor(boolean changeDoor) {
        // 生成随机数0~3
        int prizeDoor = (int) (random() * 3); //random用到了Apache包，随机数为0.0~1.0
        int playerChoice = (int) (random() * 3);
        /**
         * 这里可以将 == 变成 != ，这样最终结果得到的概率会相反
         */
        if (playerChoice != prizeDoor) {
            return !changeDoor ;
        } else {
            return changeDoor ;
        }
    }
}