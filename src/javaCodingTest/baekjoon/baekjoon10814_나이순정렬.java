package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class baekjoon10814_나이순정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] strs = br.readLine().split(" ");

            people.add(new Person(Integer.parseInt(strs[0]), strs[1]));
        }

        people.sort(Comparator.comparing(person -> person.age));


        for (Person person : people) {
            System.out.printf("%d %s\n", person.age, person.name);
        }


    }

    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}
