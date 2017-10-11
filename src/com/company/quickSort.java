
/**
 * Created by User on 12/1/2016.
 */
package com.company;

public class quickSort {
    public int[] quickSort(int[] array) {
        // Write your solution here
        if (array==null||array.length==1)
            return array;
        int left=0;
        int right=array.length-1;
        helper(array,left,right);

        return array;
    }

    public void helper(int[] array, int a, int b) {
        // Write your solution here
        int key = array[a];
        int left =a;
        int right=b;
       // while(left<right){
            for(int i=right; i>0;i--){
                if(array[i]<key) {
                    array[left] = array[i];
                    array[i]=key;
                    break;
                }
                right++;
            }
            for(int j=left; j<right;j++){
                if(array[j]>key) {
                    array[right] = array[j];
                    array[j]=key;
                    break;
                }

        }
       //}
        //helper(array,a,left);
        //helper(array,left+1,b);

    }
}
