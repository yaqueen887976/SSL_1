package com.yaqin.Java8_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream{

        public Number value;

        public MyStream(Number value){
            this.value = value;
        }

        /*public static List<Number> MyStream(List<Number> values){


        }*/

        public static void MyMap(List<Integer> test){

            System.out.println(test);

            Arrays.stream(test.toArray())

                    .forEach(e-> System.out.print(""+Integer.parseInt((String) e)*3 + " "));
            //Integer.parseInt(e)*3
        }
}

