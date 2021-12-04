package com.company;

public class Main {

    public static void main(String[] args) {
        int n=1234;
        int rev=0,temp;
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        System.out.println(rev);
    }
}
