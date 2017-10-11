package com.company;

/**Question 1a
 * Created by huajunzhang on 11/10/16.
 * Develop an implementation of a load balancer for incoming IP traffic.  Assume the
 * input is 32-bit integer.  The load balancer must distribute load among 5
 * servers.  Write a simple algorithm that implements load balancing between 5
 * servers WITHOUT explicitly using stack or heap memory.  (The answer should only
 * be a few lines of code).
 */

public class load_balance {
    //assume 5 servers are identical
    //question1
    public static int getServer_1_(int ip) {
        return ip%5 + 1;
    }
    //question 2
    //assume 5 servers are not identical
    //And assume they have prefromance P1 P2 P3 P4 P5
    

}
