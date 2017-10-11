package com.company;

/**
 * What is a computational fast way to divide an integer by 7
 */
public class divide_7 {
    int divu7(int n) {           //example n = 14 = 00001110
        int q, r;
        q = (n >> 1) + (n >> 4); //00000111 + 00000000  ->  q=00000111
        q = q + (q >> 6);        //00000111 + 00000000 -> q=00000111
        q = q + (q>>12) + (q>>24); //00000111 + 00000000 +00000000-> q=00000111
        q = q >> 2;                // q = 00000001 = 1

        r = n - q*7;                //r = 14-7*1=7

        return q + ((r + 1) >> 3);  //result = 1 +(8>>3)
                                    //0001000>>3 = 00000001
                                    //result =2
    }

}
