package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class baekjoon5635_생일 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        List<Student> students = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            String[] s = br.readLine().split(" ");
            // year 추가
            sb.append(s[3]);

            // month 추가
            if (s[2].length() == 1)
                sb.append("0");
            sb.append(s[2]);

            if (s[1].length() == 1)
                sb.append("0");
            sb.append(s[1]);

            students.add(new Student(s[0], sb.toString()));

            sb.setLength(0);
        }

        students.sort(Comparator.comparing(student -> student.birthDate));

        // 가장 적은 사람 이름
        System.out.println(students.get(students.size() - 1).name);
        // 가장 많은 사람 이름
        System.out.println(students.get(0).name);
    }

    static class Student {
        String name;
        String birthDate;

        public Student(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

    }
}
