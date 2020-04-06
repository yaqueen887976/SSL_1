package com.yaqin.Java8_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream{

        public Number value;

        public MyStream(Number value){
            this.value = value;
        }



        public static List<Integer> MyMap(List<Integer> test){

            List<Integer> collect1 = test.stream().map(n -> n * 3).collect(Collectors.toList());

            return collect1;
        }
}

