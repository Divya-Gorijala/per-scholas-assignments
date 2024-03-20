package com.perscholas.java_basics.hacker_rank;

import java.util.ArrayList;
import java.util.List;

public class SubStringBubblesort {
    public static void main(String[] args) {
        getSmallestAndLargest("welcometojava",3);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        List<String> strList = new ArrayList<>();
        for(int i=0;i+k<=s.length();i++){
            strList.add(s.substring(i, i+k));
        }
        bubbleSort(strList);


        // 'smallest' must be the lexicographically smallest substring of length 'k'
        smallest=strList.get(0);
        System.out.println(smallest);
        // 'largest' must be the lexicographically largest substring of length 'k'
        largest=strList.get(s.length()-k);
        System.out.println(largest);

        return smallest + "\n" + largest;
    }
    public static void bubbleSort(List<String> list){
        int n=list.size();
        boolean swapped;
        do{
            swapped=false;
        for(int i=0;i<n-1;i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                //Swap the elements
                String temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
                swapped = true;
            }
        }
        n--;
        }while(swapped);
    }
}
