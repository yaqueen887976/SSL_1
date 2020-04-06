package com.yaqin.Collection;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


public class Collection {
    public static void main(String[] args){
        printDuplicateCharacters("hello");
    }

    public static List<String> trueFriend(List<String> friend1, List<String> friend2){
        return friend1.stream()
                .filter(friend2::contains)
                .collect(Collectors
                        .toList());
    }

    public static void printDuplicateCharacters(String word) {
        char[] characters = word.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }


    }





    @Test
    public void TestTrueFriend(){
        List<String> friendName1 = new ArrayList<>();
        friendName1.add("Amy");
        friendName1.add("Tom");
        friendName1.add("Jessie");
        List<String> friendName2 = new ArrayList<>();
        friendName2.add("Betty");
        friendName2.add("Tom");
        friendName2.add("Tracy");
        assertEquals(Arrays.asList("Tom"),trueFriend(friendName1,friendName2));
    }




}
