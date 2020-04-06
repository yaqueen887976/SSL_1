package com.yaqin.Java8_2;

import java.util.Arrays;
import java.util.List;

public class TestMyStream {
    public static void main(String[] args){
        List<Integer> test = Arrays.asList(1, 3, 5, 7, 9);
        MyStream.MyMap(test);
    }
}
