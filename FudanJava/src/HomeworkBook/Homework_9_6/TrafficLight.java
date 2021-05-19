package HomeworkBook.Homework_9_6;

public enum TrafficLight {
    // 常量
    GREEN, RED, YELLOW;

    public static void main(String[] args) {
        TrafficLight[] tl = TrafficLight.values();
        for (TrafficLight light:tl) {
            System.out.print(light);
            System.out.println("  "+ light.ordinal());
        }
        TrafficLight red = TrafficLight.RED;
        switch (red) {
            case RED:
                System.out.println("RED: stop.");
                break;
            case GREEN:
                System.out.println("GREEN: go.");
                break;
            case YELLOW:
                System.out.println("YELLOW: wait.");
                break;
        }
    }

}
