package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0, zero; (zero = scanner.nextInt()) !=0 ; i++) {
            integerArrayList.add(zero);
        }

        double intAverage = integerArrayList.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        if (intAverage < 0){
            System.out.println((int) Math.ceil(intAverage));
        } else {
            System.out.println((int) Math.floor(intAverage));
        }

    }

}