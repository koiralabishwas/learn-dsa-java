package com.codewithmosh;

import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int[] nums = new int[5];
    nums[0] = 1;
    nums[1] = 5;
    // printing the array gives the memmory address of the array 
    System.out.println(nums);
    // we can do alot with Arrays.methodName
    System.out.println(Arrays.toString(nums)); // default values are 0 in int[]

    int[] newNums = {1, 2 , 5,9};
    System.out.println(Arrays.toString(newNums));
    // java default arrays cannot increase or decrease length


    // multidymentional arrays
    int[][] twoDArray = new int[2][3];// two rows and three colums    
    twoDArray[0][0] = 1;
    System.out.println(Arrays.toString(twoDArray)); // !!we get memmory address in multidimentional array
    System.out.println(Arrays.deepToString(twoDArray)); // !!use deepToString for multiD array

    int[][] second2dArray = {{1 ,2 ,4} , {1,4,7}};
    System.out.println(Arrays.deepToString(second2dArray));


  }
}
