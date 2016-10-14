package com.company;

/**
 * Created by huajunzhang on 10/13/16.
 */
public class find_access_code_3dot0 {
    public static int answer(int[] l) {
//12248
        int noOfCombinations = 0;
        int[] noOfDoubles = new int[l.length];

        for (int i = 1; i < l.length - 1; ++i) {
            for (int j = 0; j < i; ++j) {
                if (l[i] % l[j] == 0) {
                    ++noOfDoubles[i];
                    System.out.println(l[j]+" "+l[i]);
                }
            }
        }
        System.out.println("---------------------");

        for (int i = 2; i < l.length; i++) {
            for (int j = 1; j < i; ++j) {
                if (l[i] % l[j] == 0) {
                    System.out.println(l[i] + " " + l[j]);

                    noOfCombinations += noOfDoubles[j];
                }
            }
        }

        return noOfCombinations;
    }
}

