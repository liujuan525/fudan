package chapter5;

public class DeckOfCards {
    public static void main(String[]args) {
        int[] deck = new int[52];
        String[] suits = {"黑桃","红桃","方块","梅花"};
        String[] ranks = {"A","2","3","4","5","6","7","8", "9","10","J","Q","K"};
        //初始化每一张牌
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        // 打乱牌的次序
        for (int i = 0; i < deck.length; i++) {
            // 随机产生一个元素下标0~51
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i]; // 将当前元素与产生的元素交换
            deck[i] = deck[index];
            deck[index] = temp;
        }
        // 显示输出前4张牌
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];     // 确定花色
            String rank = ranks[deck[i] % 13];     // 确定次序
            System.out.println(suit + "   " + rank);
        }
    }
}
