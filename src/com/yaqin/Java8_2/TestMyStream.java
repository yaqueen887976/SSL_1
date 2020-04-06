package com.yaqin.Java8_2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMyStream {
    public static void main(String[] args){
        List<Integer> test = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(MyStream.MyMap(test));

        //#3
        String s1="walabcwalexywalxzsfwalmx";
        String replaceString=s1.replace("wal","sams");//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);

        //#4
        String test4 = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        String[] test5 = test4.split(" ");
        System.out.println(Arrays.toString(test5));
        Map<String, Long> map = Arrays.asList(test5).stream().map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//.stream().forEach(s -> s.toLowerCase());
        //Arrays.asList(test5)
        System.out.println(map);
        //.map(n -> n * 3).collect(Collectors.toList());

    }
}
