package com.fibonacci.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
@author jorge.santacruz
*/
public class FibonacciTestApplication {

    public List<Integer> printFibonacciSerie(int input) {
        List<Integer> list = getStarterList();
        int n1 = 0, n2 = 1, n3;

        if (input < 0) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 2; i < input; ++i) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                list.add(n3);
            }
        }
        System.out.println();
        printSerie(list);
        return list;
    }

    public void printFibonacciRecursively(int input) {
        int n1 = 0, n2 = 1, n3 = 0;
        if (input - 2 > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            printFibonacciRecursively(input - 1);
        }
    }

    private List<Integer> getStarterList() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return list;
    }

    private void printSerie(List<Integer> starterList) {
        for (int i = 0; i < starterList.size(); i++) {
            System.out.print(starterList.get(i) + " - ");
        }
    }
}
