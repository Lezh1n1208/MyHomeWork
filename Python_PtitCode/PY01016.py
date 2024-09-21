t = int(input())

while t > 0:
    t -= 1
    s = str(input())
    for i in range(0, len(s), 2):
        n = int(s[i + 1])
        while n > 0:
            n -= 1
            print(s[i], end="")
    print()