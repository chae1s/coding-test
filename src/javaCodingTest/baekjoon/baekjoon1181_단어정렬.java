package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class baekjoon1181_단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> wordSet = new HashSet<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            wordSet.add(br.readLine());
        }

        List<Word> words = wordSet.stream().map(s -> new Word(s)).collect(Collectors.toList());

        Collections.sort(words);

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i).text);
        }

    }

    static class Word implements Comparable<Word>{
        String text;

        public Word(String text) {
            this.text = text;
        }

        @Override
        public int compareTo(Word o) {
            if (this.text.length() != o.text.length()) {
                return this.text.length() - o.text.length();
            }

            return this.text.compareTo(o.text);
        }
    }

}
