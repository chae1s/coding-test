import sys

N, k = map(int, sys.stdin.readline().split())

score1 = sys.stdin.readline().split()
score2 = []

for x in score1:
    score2.append(int(x))

score2.sort(reverse=True)

print(score2[k - 1])






