package com.company;

/**
 * Created by huajunzhang on 10/11/16.
 */
public class lovely_lucky_lambs_math {
    public static int answer(int total_lambs) {
        double phi = (1+Math.sqrt(5))/2;  // golden search ratio
        double tau = (1-Math.sqrt(5))/2;  // equal to 1/phi
        double eps = Math.pow(10, -10);

        int max_hunchmen = (int) Math.rint(Math.log((total_lambs + 1) * Math.sqrt(5)+eps)/ Math.log(phi)) - 2;
        int Fib_num = (int)Math.rint((Math.pow(phi, max_hunchmen+2)-Math.pow(tau, max_hunchmen+2))/Math.sqrt(5));
        if(total_lambs+1 < Fib_num)
            max_hunchmen -= 1;

        int min_hunchmen = (int)(Math.log(total_lambs + 1)/Math.log(2));

        //System.out.println(max_hunchmen - min_hunchmen);

        return max_hunchmen - min_hunchmen;

    }
}
