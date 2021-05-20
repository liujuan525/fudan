package chapter9;

public class EnumDemo {
    public static void main(String[] args) {
        Direction west = Direction.WEST;
        Direction east = Direction.EAST;
        Direction[] directions = Direction.values();
        for(Direction d: directions) {
            System.out.println(d.name() + "_" + d.ordinal());
        }

    }
}
