package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class baekjoon1181_단어정렬_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> wordSet = new HashSet<>();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            wordSet.add(br.readLine());
        }

        List<String> words = new ArrayList<>(wordSet);

        // 따로 Comparable을 구현하는 클래스를 만들지 않고 정렬 기준을 여러개 두는 방법
        //
        words.sort(
                Comparator.comparing(String::length)    // 1차 기준: 단어 길이
                        .thenComparing(Comparator.naturalOrder())       // 2차 기준: 사전 순서대로

        );

        for (String word : words) {
            System.out.println(word);
        }

    }

}
