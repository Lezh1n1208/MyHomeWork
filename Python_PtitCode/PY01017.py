t = int(input())

while t > 0:
    t -= 1
    s = str(input())
    char_tmp = s[0]
    count_tmp = 1
    for i in range(1, len(s)):
        if not(s[i] == s[i - 1]):
            print(count_tmp, end="")
            print(char_tmp, end="")
            char_tmp = s[i]
            count_tmp = 1
        else:
            count_tmp += 1
    print(count_tmp, end="")
    print(char_tmp, end="")
    print()
            