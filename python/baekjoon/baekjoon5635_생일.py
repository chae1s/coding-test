import sys

num = int(sys.stdin.readline())
students = []
for _ in range(num):
    name, day, month, year = sys.stdin.readline().split()
    birthDate = [year]

    if len(month) == 1: birthDate.append("0")
    birthDate.append(month)

    if len(day) == 1: birthDate.append("0")
    birthDate.append(day)

    students.append([name, ''.join(birthDate)])


students.sort(key= lambda x:x[1])

print(students[len(students) - 1][0])
print(students[0][0])