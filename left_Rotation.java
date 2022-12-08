/*

A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result.

Example

d=2
arr=[1,2,3,4,5]

After 2 rotations, arr=[3,4,5,1,2].

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate

Returns

int[n]: the rotated array

Input Format

The first line contains two space-separated integers that denote n, the number of integers, and d, the number of left rotations to perform.
The second line contains n space-separated integers that describe arr[].

Constraints

1<=n<=10^5
1<=d<=n
1<=a[i]<=10^6

Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4

Explanation

To perform d=4 left rotations, the array undergoes the following sequence of changes:

[1,2,3,4,5] -> [2,3,4,5,1] -> [3,4,5,1,2] -> [4,5,1,2,3] -> [5,1,2,3,4]

*/

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> newList=new ArrayList<>();

        for(int j=0;j<arr.size();j++)
        {
            newList.add(j,0);
        }
         for(int i=0;i<arr.size();i++)
         {
            if(i<d) newList.set(((arr.size()-d)+i),arr.get(i));
            if(i>=d) newList.set(i-d, arr.get(i));
        }
        return newList;
    }

}

class Solution {
    public static void main(String[] args){
        int d=4;
        List<Integer> arr =new ArrayList<>(Arrays.asList(1,2,3,4,5));
                List<Integer> result=Result.rotateLeft(d, arr);
                result.forEach(x-> System.out.print(x+" "));
    }
}


