package com.company;
import sun.security.util.BigInt;

import java.math.BigInteger;
import java.util.*;
/**
 Fuel Injection Perfection
 =========================

 Commander Lambda has asked for your help to refine the automatic quantum antimatter fuel injection system for her LAMBCHOP doomsday device. It's a great chance for you to get a closer look at the LAMBCHOP - and maybe sneak in a bit of sabotage while you're at it - so you took the job gladly.

 Quantum antimatter fuel comes in small pellets, which is convenient since the many moving parts of the LAMBCHOP each need to be fed fuel one pellet at a time. However, minions dump pellets in bulk into the fuel intake. You need to figure out the most efficient way to sort and shift the pellets down to a single pellet at a time.

 The fuel control mechanisms have three operations:

 1) Add one fuel pellet
 2) Remove one fuel pellet
 3) Divide the entire group of fuel pellets by 2 (due to the destructive energy released when a quantum antimatter pellet is cut in half, the safety controls will only allow this to happen if there is an even number of pellets)

 Write a function called answer(n) which takes a positive integer as a string and returns the minimum number of operations needed to transform the number of pellets to 1. The fuel intake control panel can only display a number up to 309 digits long, so there won't ever be more pellets than you can express in that many digits.

 For example:
 answer(4) returns 2: 4 -> 2 -> 1
 answer(15) returns 5: 15 -> 16 -> 8 -> 4 -> 2 -> 1


 Languages
 =========

 To provide a Python solution, edit solution.py
 To provide a Java solution, edit solution.java

 Test cases
 ==========

 Inputs:
 (string) n = "4"
 Output:
 (int) 2

 Inputs:
 (string) n = "15"
 Output:
 (int) 5
 */
public class fuel_injection_perfection {
    public static int answer(String n) {
        BigInteger num= new BigInteger(n);
        BigInteger two = new BigInteger("2");

        System.out.println("num is: "+num);
        BigInteger apow,bpow;
        int a=0;
        int b=1;
        while(true) {
             apow= two.pow(a);
             bpow= two.pow(b);

            int left=num.compareTo(apow);
            int right=num.compareTo(bpow);

            if(left>=0&&right<=0)
                break;
            //if(num>=Math.pow(2,a)&&num<=Math.pow(2,b))
                //break;
            a++;
            b++;
        }

        BigInteger num_a = num.subtract(apow);
        BigInteger num_b = num.subtract(bpow).abs();

        System.out.println("a= "+a);
        System.out.println("num-a^2= "+num_a);
        System.out.println("b= "+b);
        System.out.println("b^2-num= "+num_b);


        int aOrb=num_a.compareTo(num_b);
        int close2n= aOrb <=0 ? a:b;
        System.out.println("close2n= "+(int)Math.rint(close2n));

        //int close2n=((num-Math.pow(2,a))<=(Math.pow(2,b)-num))? a:b;
        double result=0;
        if(close2n==a){
             result=close2n+num_a.doubleValue();
            System.out.println("aaaaa");

        }else{
             result=close2n+num_b.doubleValue();
            System.out.println("bbbbb");

        }

        //double result= (close2n+Math.abs(num-Math.pow(2,close2n)));

        System.out.println((int)Math.rint(result));
        System.out.println("-----------------------------------------");

        return (int)Math.rint(result);

    }
}
