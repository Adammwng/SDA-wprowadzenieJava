package klasy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pies {
    private String race;
    private int age;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pies(String race, int age, String gender) {
        this.race = race;
        this.age = age;
        this.gender = gender;
    }
    public void soundOfDog(){
        System.out.println("Wooof!");
    }

    @Override
    public String toString() {
        return "Pies{" +
                "race='" + race + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
class Main{
    public static void main(String[] args) {
        Pies seter = new Pies("seter", 4, "F");
        Pies dog = new Pies("cocker spaniel", 6, "M");

        seter.setAge(6);
        System.out.println(seter);
        System.out.println(seter.getAge());
        List<Pies> listOfDogs = new LinkedList<Pies>();

        listOfDogs.add(seter);
        listOfDogs.add(dog);
        for (Pies list : listOfDogs){
            System.out.println(list);
        }

    }
}
