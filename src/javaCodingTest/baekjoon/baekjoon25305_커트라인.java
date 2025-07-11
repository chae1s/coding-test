package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class baekjoon25305_커트라인 {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] students = br.readLine().split(" ");

        int N = Integer.parseInt(students[0]);
        int k = Integer.parseInt(students[1]);

        List<Integer> list=new ArrayList<>();
        String[] score = br.readLine().split(" ");
        for (int i=0;i<N;i++){
            list.add(Integer.parseInt(score[i]));
        }

        list.sort(Comparator.reverseOrder());

        System.out.println(list.get(k - 1));


    }
}
