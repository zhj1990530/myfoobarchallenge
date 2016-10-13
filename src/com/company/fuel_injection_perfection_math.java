package com.company;

import java.math.BigInteger;

/**
 * Created by huajunzhang on 10/12/16.
 */
public class fuel_injection_perfection_math {
    public static int answer(String n) {
        BigInteger num= new BigInteger(n);
        BigInteger two = new BigInteger("2");
        BigInteger one = new BigInteger("1");


        int count = 0;
        while(num.compareTo(one)==1){
            System.out.println(count);
            if (num.mod(two).compareTo(new BigInteger("0"))==0)
                    num.divide(two);
            else {
                if((num.add(one).mod(new BigInteger("4")).compareTo(new BigInteger("0"))==0)&&(num.subtract(one).compareTo(two)!=0))
                    num = num.add(one);

                else
                    num = num.subtract(one);;
            }
            count++;
        }
        System.out.println(count);

        return count;
    }
}
