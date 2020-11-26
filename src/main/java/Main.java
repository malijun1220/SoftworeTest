/**
 @author MALIJUN
 @content   软件测试实验之“ 三门问题/蒙提霍尔问题 ”:假设有三扇门，其中一扇背后放了一辆车，另外两三背后放着两头山羊。
  * 当参赛者选定一扇门后，主持人会打开另外一扇有山羊的门，然后问参赛者是否要更换原先选定的门。此时，如果参赛选手决定改选，则他赢得
  * 车的概率为2/3，不改选则赢得车的概率为1/3。
 @date 2020/11/26 - 22:06
*/public class Main {
    public static void main(String[] args) {
        int totalTest = 10000;
        Function montyHall = new Function(totalTest);
        montyHall.run(true);
        System.out.println();
        montyHall.run(false);
//        以下是桩模块测试
      /*  StubFunction stub=new StubFunction(totalTest);
        stub.run(true);
        System.out.println();
        stub.run(false);*/

    }
}
