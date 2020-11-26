import static org.apache.commons.math3.util.FastMath.random;

/**
 * @author MALIJUN
 * @content
 * @date 2020/11/26 - 22:06
 */
public class Function {
    private int totalTest;

    public Function(int totalTest) {
        if (totalTest <= 1000) {
            throw new IllegalArgumentException("totalTest must be larger than 300!" +
                    "otherwise it's not statistically significant!");
        }

        this.totalTest = totalTest;
    }

    public void run(boolean changeDoor) {
        //赢的次数
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
        int prizeDoor = (int) (random() * 3); //产生随机数
        int playerChoice = (int) (random() * 3);
        if (playerChoice != prizeDoor) { //注入错误 ==变!=
            return !changeDoor ;
        } else {
            return changeDoor ;
        }
    }
}
