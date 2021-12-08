package com.lambda.Assignment4;


interface ProductOfAllNumber{
    int showResult(long x,long y);
}
public class test {
    public static void main(String...args){
        ProductOfAllNumber obj = (x, y) -> {
            int res = 1;
            while (x < y)
                res *= y--;
            return res;
        };
        System.out.println(obj.showResult(4,8));
    }
}
