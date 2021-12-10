package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLists {
    public List<String> shortestWords(List<String> words){
        List<String> shortestWords = new ArrayList<>();
        int shortest = words.get(0).length();

        for (String s: words){
            if (s.length() < shortest){
                shortest = s.length();
                shortestWords.clear();
                shortestWords.add(s);
            }
            else if (s.length() == shortest){
                shortestWords.add(s);
            }
        }
        return shortestWords;
    }

    public static void main(String[] args) {
        StringLists stringLists = new StringLists();
        System.out.println(stringLists.shortestWords(Arrays.asList("aaa", "aa", "bb",  "cccc", "dd")));
    }
}
