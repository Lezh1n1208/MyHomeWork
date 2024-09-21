def sum(n):
    res = 0
    while n != 0:
        res += n % 10
        n = n // 10
    return res

def solve(n):
    m = sum(n)
    if m < 10:
        return False
    k = int(str(m)[::-1])
    return m == k

t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    if (solve(n)):
        print("YES")
    else:
        print("NO")
        