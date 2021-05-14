package chapter4.practise8;

// 4-8
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){}

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 100) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume) {
        if (on && newVolume >= 1 && newVolume <= 7) {
            volumeLevel = newVolume;
        }
    }

    public void channelUp() {
        if (on && channel < 100) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println("tv1频道是 " + tv1.channel);
        System.out.println("tv1音量是 " + tv1.volumeLevel);
    }
}
