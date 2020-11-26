
/**
 * @author MALIJUN
 * @content
 * @date 2020/11/26 - 22:51
 */
public class StubFunction {
    private int totalTest;

    public StubFunction(int totalTest) {
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
        return true;
    }
}
