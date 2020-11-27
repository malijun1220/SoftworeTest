# SoftworeTest
​		软件测试期末实验，2020年。

​		程序为三门问题，通过大量数据最后结果应该是选手换门，则赢得奖品的概率是2/3，不换门是1/3。

​		main是ant构建的项目，但是这里jenkin一直构建失败，不能找到正确的ant路径，应该改用maven来构建项目。

​		master是maven构建的项目。

​		缺陷管理工具登记bug是在github上仓库里面的Issues模块中，目前只有一个Issues，即注入错误的地方。

​		本程序中注入的错误其结果是动态变化的，不便于在测试中通过下断言的方式查看，所以只能在jenkins通过肉眼观察。

​		jar包是通过IDEA导出，在out\artifacts\MontyHallProlem中。