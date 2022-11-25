package com.java.palindrome;

import java.util.Scanner;

public class PalindromeWithLAndD {

    public static String createPalindrome(int l, int d) {
        String str1 = "";
        for (int i = 0; i < d; i++) {
            str1 = str1 + (char) ('a' + i);
        }
        String str2 = new StringBuilder(str1).reverse().toString();

        int r = l - (str1.length() + str2.length());
        if(r<0) {
            String str = str1.concat(str2);
            int strLength = str.length();
            StringBuilder sb = new StringBuilder(str);
            while(r<0) {
                sb.deleteCharAt(strLength/2);
                r++;
                strLength--;
            }
            str = sb.toString();
            return str;
        }
        int cnt = 0;
        for (int i = 0; i < r; i++) {
            str1 = str1 + (char) ('a' + cnt);
            cnt ++;
            if(cnt == r/2) {
                str1 = str1 + (char) ('a' + 0);
                str1 = str1.concat(str2);
                return str1;
            }
        }
        String str = str1.concat(str2);

        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int l = sc.nextInt();

        System.out.println("Enter Distict : ");
        int d = sc.nextInt();
        String result = PalindromeWithLAndD.createPalindrome(l, d);
        String reverse = new StringBuilder(result).reverse().toString();
        if (result.equals(reverse)) {
            System.out.println(result + " is A palindrome");
        } else {
            System.out.println(result + " is not a palindrome");
        }
    }

}