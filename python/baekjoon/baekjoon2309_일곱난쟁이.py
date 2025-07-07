import sys

def print_answer(numbers, a, b):
    for i in range(9):
        if i == a or i == b:
            continue
        print(numbers[i])


arr = [int(sys.stdin.readline()) for _ in range(9)]


# 오름차순 출력
arr.sort()

# 거짓말 한 두 난쟁이의 키 합
total = sum(arr) - 100
found_ans = False

for i in range(0, 9):
    if found_ans:
        break
    for j in range(i + 1, 9):
        if total == arr[i] + arr[j]:
            print_answer(arr, i, j)
            found_ans = True
            break
