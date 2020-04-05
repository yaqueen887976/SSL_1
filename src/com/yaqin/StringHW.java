package com.yaqin;

import jdk.jfr.StackTrace;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
public class StringHW {

    public static void main(String[] args) {
	    // write your code here
//        System.out.println(question1());
//        System.out.println(question2("test","test"));
//        System.out.println(question2("test","Test"));
//        System.out.println(question3());
        System.out.println(question4());
    }
    //String
    //1)Given string “Algorithms”, return  “go” and “Algo” using substring
    public static String question1(){
        String go = "Algorithms".substring(2,4);
        String Algo = "Algorithms".substring(0,4);
        return go+" "+Algo;
    }

    @Test
    public void Test1(){
        assertEquals("go Algo",question1());
    }
    //2) Given two strings, compare if these two two strings are equal by comparing each character
    public static boolean question2(String str1, String str2){
        boolean result = false;
        if(str1.compareTo(str2)==0)
            result = true;
        return result;
    }

    @Test
    public void Test2(){
        assertEquals(true,question2("test","test"));
        assertEquals(false,question2("Test","test"));
    }
    //3) Given string “https://www.amazon.com/demo?test=abc”,
    // return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]

    public static List<String> question3(){
        String input = "https://www.amazon.com/demo?test=abc";
        List <String> output = new ArrayList<>();
        String splittedString[] = input.split("[^a-zA-Z0-9]");
        for(String ele: splittedString){
            if(ele.length() >0){
                output.add(ele);
            }
        }
        //System.out.println(Arrays.toString(splittedString));
        return output;
    }

    @Test
    public void Test3(){
        List<String> output = new ArrayList<String>();
        output.add("https");
        output.add("www");
        output.add("amazon");
        output.add("com");
        output.add("demo");
        output.add("test");
        output.add("abc");
        assertEquals(output,question3());

    }
    //Given a list of string array, combine them into one string sentence, return the string sentence
    public static String question4(){
        List<String[]> input = new ArrayList<>();
        String[] ele0 = {"Volvo", "BMW", "Ford", "Mazda"};
        String[] ele1= {"This","is","a","test","."};
        input.add(ele0);
        input.add(ele1);
        String result = "";
        for(String[] array :input){
            for(String ele2: array){
                result +=ele2;
            }
        }
        //System.out.println(result);
        return result;
    }

    @Test
    public void Test4(){
        assertEquals("VolvoBMWFordMazdaThisisatest.",question4());
    }


}
