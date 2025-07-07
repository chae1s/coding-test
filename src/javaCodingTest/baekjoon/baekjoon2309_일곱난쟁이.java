package javaCodingTest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon2309_일곱난쟁이 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[9];
        int total = 0;
        // 받은 아홉 난쟁이의 키를 배열에 저장
        for (int i = 0; i < 9; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            total += numbers[i];
        }

        Arrays.sort(numbers);

        boolean check = false;
        // 거짓말 한 두 난쟁이의 키를 빼면 100이 되어야 한다.
        for (int i = 0; i < 9; i++) {
            if (check) break;

            for (int j = i + 1; j < 9; j++) {
                int now = total - numbers[i] - numbers[j];
                if (now == 100) {
                    print_answer(numbers, i, j);
                    check = true;

                    break;
                }
            }
        }

    }

    private static void print_answer(int[] numbers, int a, int b) {
        for (int i = 0; i < 9; i++) {
            if (i == a || i == b) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}
