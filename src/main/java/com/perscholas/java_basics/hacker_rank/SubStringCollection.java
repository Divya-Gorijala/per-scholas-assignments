package com.perscholas.java_basics.hacker_rank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringCollection {

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
            Collections.sort(strList);
            /*for(String str : strList ){
                System.out.println(str);
            }*/


            // 'smallest' must be the lexicographically smallest substring of length 'k'
            smallest=strList.get(0);
            System.out.println(smallest);
            // 'largest' must be the lexicographically largest substring of length 'k'
            largest=strList.get(s.length()-k);
            System.out.println(largest);

            return smallest + "\n" + largest;
        }
}
