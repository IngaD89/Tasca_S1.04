package org.example.n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        readList();
    }

    public static List<Month> readList(){
        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("August"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        for (int i = 0; i < months.size(); i++){
            System.out.println(i+1);
        }
        return months;
    }
}