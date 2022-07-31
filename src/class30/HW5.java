package class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW5 {
        /*Create a collection of integers in which you can keep duplicates.
           Write a logic to find sum of all integers
           */
        public static void main(String[] args) {
                List<Integer> numbers= Arrays.asList(10,20,30,40);
                int sum=0;
                for (Integer num:numbers){
                        sum+=num;
                }
                System.out.println(sum);
        }
        }
