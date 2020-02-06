package klasy;

import java.util.LinkedList;
import java.util.List;

public class Room {
    private double height;
    private double width;
    private double length;

    public Room(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Room(double width, double length) {
        this.height = 2.4;
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Room{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    double field = 0;
    public double getField(){
        field = width * length;
        return field;
    }
    public double getCapacity(){
        double capacity = height*width*length;
        return capacity;
    }
    public void displayField (){
        System.out.println(Room.this.getField());
    }
    public void displayCapacity(){
        System.out.println(Room.this.getCapacity());
    }
}

class Main2 {
    public static void main(String[] args) {
        Room a = new Room(3, 4);
        Room b = new Room(2.1, 3.4, 5.7);
        Room c = new Room(6, 4);
        Room d = new Room(8, 3.6, 5.7);
        System.out.println(a);
        System.out.println(a.getCapacity());
        System.out.println(a.getField());
        a.displayCapacity();
        a.displayField();
        List<Room> roomList = new LinkedList<>();
        roomList.add(a);
        roomList.add(b);
        roomList.add(c);
        roomList.add(d);
        System.out.println(roomList.size());
        for (Room e : roomList){
            System.out.println(e);

        }


    }
}
