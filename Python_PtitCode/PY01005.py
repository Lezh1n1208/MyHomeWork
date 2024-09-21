def check(a):
    s = str(a)
    res = 0
    for i in range(0, len(s)):
        if (s[i] == '4' or s[i] == '7'): 
            res += 1
    return res


t = int(input())
while t > 0:
    t -= 1
    x = int(input())
    if (check(x) == 4 or check(x) == 7):
        print("YES")
    else:
        print("NO")