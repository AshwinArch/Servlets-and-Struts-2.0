package com.ash;

/**
 * @author Diesel
 *
 */

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        //add duplicate number into the list
        numbers.add(36);
        for(int i=1;i<=31;i++){
            numbers.add(i);
        }
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}
