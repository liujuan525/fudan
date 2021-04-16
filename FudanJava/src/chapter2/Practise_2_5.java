package chapter2;

public class Practise_2_5 {
    public static void main(String[] args) {
        long totalMSeconds = System.currentTimeMillis();
        // 总秒数
        long totalSeconds = totalMSeconds / 1000;
        long currentSeconds = totalSeconds % 60;
        // 总分钟数
        long totalMinutes = totalSeconds /60;
        long currentMinutes = totalMinutes % 60;
        // 总小时数
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        System.out.println("当前时间：" + currentHours + ":" + currentMinutes + ":" + currentSeconds + " (GMT)");
    }
}
