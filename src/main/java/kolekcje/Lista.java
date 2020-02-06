package kolekcje;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<String> wyrazy = new LinkedList<>();
        for (int i=1; i<11; i++ ){
            wyrazy.add(in.nextLine());
        }
        System.out.println(wyrazy);
    }
}
