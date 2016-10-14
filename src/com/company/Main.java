package com.company;
import java.lang.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //re_id.answer();

        String s ="<><><_<><<>_<";
        //en_route_salute.answer(s);

        for(int n=10; n< 1000;n++) {
            int a=lovely_lucky_lambs.answer(n);
            int b=lovely_lucky_lambs_math.answer(n);
            if(a!=b){
                //System.out.println(n);
            }
        }
        //fuel_injection_perfection.answer("16072629107794009814226375735900027158421072175583004111656255825555265766874041837397975682235437871913920093763297202377807179285384710653976866362047862205901851662236346478131611907593556712816931273229569712475372911901098151338748315919115594371856794716529813251490644747478936580255808502104065");
        //fuel_injection_perfection_math.answer("16072629107794009814226375735900027158421072175583004111656255825555265766874041837397975682235437871913920093763297202377807179285384710653976866362047862205901851662236346478131611907593556712816931273229569712475372911901098151338748315919115594371856794716529813251490644747478936580255808502104065");

        //System.out.println(0^1^2^3^4^6);
        /*int a=5;//start
        int b=10;//length
        int[][] sss=new int[a][b];
        String[][] ppp=new String[a][b];

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                sss[i][j]=Queue_to_do.answer(i,j);
                ppp[i][j]=String.valueOf(i)+"-"+String.valueOf(j);
            }
        }
        for(int i=0;i<a;i++) {
            System.out.println(Arrays.toString(sss[i]));
        }
        for(int i=0;i<a;i++) {
            System.out.println(Arrays.toString(ppp[i]));
        }*/
        //lovely_lucky_lambs.answer(n);
        //int[] test1= new int[] {1,1,2,2,4,4,8,8};
        //int[] test2= new int[] {1,2,2,4,4,4};
        //int[] test3= new int[] {1,2};
        int[] test4= new int[] {1,2,2,4,8};


        /*int answer= find_the_access_code_faster.answer(test1);
        System.out.println(answer);
        int answer1= find_the_access_code_faster.answer(test2);
        System.out.println(answer1);*/
        int answer2= find_access_code_3dot0.answer(test4);
        System.out.println(answer2);
        int answer3= find_the_access_code_faster.answer(test4);
        System.out.println(answer3);

        //int answer2= find_the_access_code_faster.answer(l);
        //System.out.println(answer2);



    }

}

