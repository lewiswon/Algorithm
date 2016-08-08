package com.lewiswon;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by lewis on 16/8/8.
 */
public class QuickSort {
    public static  void main(String[] args){
        int[] a={3,2,5,6,86,8,1};
        System.out.println("before :"+Arrays.toString(a));
        new QuickSort().quickSort(a,0,a.length-1);
        System.out.println("after :"+Arrays.toString(a));
    }
    public void quickSort(int[] input,int left,int right){
       int q;
        print("left and right:"+left+" "+right);
        if(left<right){
            q=partition(input,left,right);
            print("q is:"+q);
            quickSort(input,left,q-1);
            print("q is:"+q);
            quickSort(input,q+1,right);
//            print(Arrays.toString(input));
        }
    }

    private int partition(int[] input,int left,int right){
        int x,i,j,temp;
        x=input[right];
        i=left-1;
//        print("x is:"+x+" left is:"+left+" right is:"+right);
        for (j=left;j<=right-1;j++){
            if(input[j]<=x){
                i+=1;
                temp=input[i];
                input[i]=input[j];
                input[j]=temp;
            }
            print(Arrays.toString(input));
        }
        temp=input[i+1];
        input[i+1]=input[right];
        input[right]=temp;
        return i+1;
    }

    public static void print(Object message){

        System.out.println(message);
    }
}
