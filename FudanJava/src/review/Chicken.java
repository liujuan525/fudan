package review;

//1.编写程序，计算：古代数学家张丘建在他编写的《张丘建算经》里，曾经提出并解决了“百钱买百鸡”这个有名的数学问题，通俗地讲就是下例：今有公鸡每只五个钱，母鸡每只三个钱，小鸡每个钱三只．用100个钱买100只鸡，问公鸡、母鸡、小鸡各买了多少只？

public class Chicken {
    public static void main(String[] args) {
        int cock; // 公鸡
        int hen; // 母鸡
        int chick; // 小鸡
        for (cock = 0; cock <= 100/5; cock++) {
            for (hen = 0; hen <= 100/3; hen++) {
                chick = 100 - cock - hen;
                if (chick % 3 == 0 && (5 * cock + 3 * hen + chick / 3 == 100)) {
                    System.out.println("公鸡= " + cock + " 母鸡：" + hen + " 小鸡：" + chick);
                }
            }
        }

    }
}
