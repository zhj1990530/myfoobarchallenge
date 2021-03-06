package com.company;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by huajunzhang on 10/13/16.
 * Find the Access Codes
 =====================

 In order to destroy Commander Lambda's LAMBCHOP doomsday device, you'll need access to it. But the only door leading to the LAMBCHOP chamber is secured with a unique lock system whose number of passcodes changes daily. Commander Lambda gets a report every day that includes the locks' access codes, but only she knows how to figure out which of several lists contains the access codes. You need to find a way to determine which list contains the access codes once you're ready to go in.

 Fortunately, now that you're Commander Lambda's personal assistant, she's confided to you that she made all the access codes "lucky triples" in order to help her better find them in the lists. A "lucky triple" is a tuple (x, y, z) where x divides y and y divides z, such as (1, 2, 4). With that information, you can figure out which list contains the number of access codes that matches the number of locks on the door when you're ready to go in (for example, if there's 5 passcodes, you'd need to find a list with 5 "lucky triple" access codes).

 Write a function answer(l) that takes a list of positive integers l and counts the number of "lucky triples" of (lst[i], lst[j], lst[k]) where i < j < k.  The length of l is between 2 and 2000 inclusive.  The elements of l are between 1 and 999999 inclusive.  The answer fits within a signed 32-bit integer. Some of the lists are purposely generated without any access codes to throw off spies, so if no triples are found, return 0.

 For example, [1, 2, 3, 4, 5, 6] has the triples: [1, 2, 4], [1, 2, 6], [1, 3, 6], making the answer 3 total.

 Languages
 =========

 To provide a Python solution, edit solution.py
 To provide a Java solution, edit solution.java

 Test cases
 ==========

 Inputs:
 (int list) l = [1, 1, 1]
 Output:
 (int) 1

 Inputs:
 (int list) l = [1, 2, 3, 4, 5, 6]
 Output:
 (int) 3
 */
public class find_the_access_code_faster {
    public static int answer(int[] l) {
        HashMap<Integer,HashSet<Integer>> large =new HashMap<Integer,HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> small =new HashMap<Integer,HashSet<Integer>>();
        HashMap<Integer,Integer> AAA =new HashMap<Integer,Integer>();

        Arrays.sort(l);
        for(int i=0;i<l.length;i++){
            if(!AAA.containsKey(l[i])) {
                AAA.put(l[i],1);
            }else{
                AAA.put(l[i],AAA.get(l[i])+1);
            }
            if(!large.containsKey(l[i])) {
                large.put(l[i], new HashSet<Integer>());
                small.put(l[i], new HashSet<Integer>());
            }
                for(int j=i+1;j<l.length;j++){
                    if(l[j]%l[i]==0){
                        large.get(l[i]).add(l[j]);
                    }
                }
                for(int k=i-1;k>=0;k--){
                    if(l[i]%l[k]==0){
                        small.get(l[i]).add(l[k]);
                    }
                }
        }
        int result=0;
        for(Integer key: large.keySet()){
            System.out.println("***********************************************************************");

            System.out.println("key ="+key);
            int a = large.get(key).size();
            int b = small.get(key).size();
            System.out.println(a +"*"+ b +"="+ a*b);
            result=result+a*b;
            for(Integer behind: large.get(key)){
                for(Integer front: small.get(key)) {
                    System.out.println(front +" "+ key +" "+ behind);
                }
            }
        }
        int error=0;
        for(Integer key: AAA.keySet()){
            System.out.println("key ="+key);
            if(AAA.get(key)==2)
                error++;
        }
        //System.out.println(result);
        System.out.println("-----------------------------------------------------------------------");

        return result-error;

        }
}

