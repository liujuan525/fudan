package HomeworkBook;

public class Homework_8_2 {
    public static void main(String[] args) {
        int[] rand = new int[6];
        for (int i = 0; i < 1000; i++) {
            int r = (int)(Math.random() * 6) + 1;
            switch (r) {
                case 1: rand[0]++;break;
                case 2: rand[1]++;break;
                case 3: rand[2]++;break;
                case 4: rand[3]++;break;
                case 5: rand[4]++;break;
                case 6: rand[5]++;break;
            }
        }
        for (int i = 0; i < rand.length; i++) {
            System.out.println("rand[" + i + "]=" + rand[i]);
        }
    }
}
