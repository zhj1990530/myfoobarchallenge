package com.company;

/**
 * Created by huajunzhang on 10/11/16.
 */
public class re_id {
    public static void answer(){
        int n=11;
        String longPrime=findPrime(n);
        System.out.println(longPrime);
        System.out.println(longPrime.substring(n,n+5));

    }
    public static String findPrime(int n){
        String res="2";
        int count=0;
        int num=2;
        while(res.length()<= n+5){
            num++;
            boolean prime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                res+=String.valueOf(num);
            }
        }
        System.out.println(res);
        return res;
    }
}
