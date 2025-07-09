import sys

num = int(sys.stdin.readline())

answer = []

for _ in range(num):
    age, name = sys.stdin.readline().split()
    answer.append([int(age), name])

answer.sort(key=lambda x: (x[0]))

for person in answer:
    print(person[0], person[1])