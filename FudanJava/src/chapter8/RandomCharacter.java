package chapter8;

public class RandomCharacter {
    public static char getLetter(){
        return (char)(97 + Math.random() * (26));
    }

    public static void main (String[] args) {
        for(int i = 1 ; i <= 100 ; i ++) {
            System.out.print(getLetter()+" ");
            if ( i % 20 == 0) {    // 每输出20个字母换行
                System.out.println();
            }
        }
    }
}
