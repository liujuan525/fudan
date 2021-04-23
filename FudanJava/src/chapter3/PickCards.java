package chapter3;

/**
 * 从一副纸牌中任意抽取一张，并打印出抽取的是哪一张牌。
 * 一副牌有4种花色，黑桃、红桃、方块和梅花。每种花色有13张牌，共有52张牌。可以将这52张牌编号，从0到51。规定编号0到12为黑桃，13到25为红桃，26到38为方块，39到51为梅花。
 * 任意抽取一张牌
 * 可以使用整数的除法运算来确定是哪一种花色，用求余数运算确定是哪一张牌。例如，假设抽出的数是n，计算n/13的结果，若商为0，则牌的花色为黑桃，若商为1，则牌的花色为红桃，若商为2，则牌的花色为方块，若商为3 ，则牌的花色为梅花。
 * 计算n%13的结果可得到第几张牌。余数为0表示为A，余数为1表示2，…余数为12表示K。
 */
public class PickCards {
    public static void main(String[] args){
        int card = (int)(Math.random() * 53);
        String suit = "", rank = "";
        switch(card / 13){     // 确定牌的花色
            case 0:
                suit = "黑桃";
                break;
            case 1:
                suit = "红桃";
                break;
            case 2:
                suit = "方块";
                break;
            case 3:
                suit = "梅花";
                break;
        }
        switch(card % 13){     // 确定是第几张牌
            case 0:
                rank = "A";
                break;
            case 10:
                rank = "J";
                break;
            case 11:
                rank = "Q";
                break;
            case 12:
                rank = "K";
                break;
            default:
                rank = "" + (card % 13 + 1);
        }
        System.out.println("你抽取的牌是：" + suit + " " + rank);
    }
}
