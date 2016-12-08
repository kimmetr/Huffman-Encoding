package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyTable {
    //initiate map
    private HashMap<Character, Integer> map;

    FrequencyTable() {
        map = new HashMap<>();
    }


    //test
    public static void main(String[] args) {
        FrequencyTable table = new FrequencyTable();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide text to encode:");
        String line = myScanner.nextLine();
        table.createMap(line);
        System.out.println(table.toString());

    }


    //creates map with constraints
    public void createMap(String string) {
        map.clear();
        char characters[] = string.toCharArray();
        for (Character character : characters) {
            if (map.containsKey(character)) {
                map.put(character, (map.get(character) + 1));
            } else {
                map.putIfAbsent(character, 1);
            }
        }
    }


    //outputs frequency table
    @Override
    public String toString() {
        String string = "Frequency Table:\n";

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            string += "\'" + entry.getKey() + "\' : " + entry.getValue() + "\n";
        }
        return string;
    }
}