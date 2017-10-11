package com.company;

/** question 1b
 * Develop the same load balancer, however the algorithm should ensure uniform load distribution.  You can use memory
 * */
public class uniform_load_balance {

    public static int getServer_1_(int ip) {
        //question 2
        //assume 5 servers are not identical
        //And assume they have prefromance P1 P2 P3 P4 P5
        int p[]={1,2,3,4,5};//performance
        int s = 4;   //ip is between 1 to s
        int serverNum = 1;
        int hashNum = ip % s;
        while(true) {
            hashNum -= p[serverNum++];
            if(hashNum <= 0) {
                return serverNum;
            }
            if(serverNum >= 5) {
                return 5;
            }
        }


    }
}
