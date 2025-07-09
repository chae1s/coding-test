import sys

num = int(sys.stdin.readline())

s = set()

for _ in range(num):
    s.add(sys.stdin.readline().strip())

words = []


for word in s:
    words.append([len(word), word])

words.sort()

for word in words:
    print(word[1])


