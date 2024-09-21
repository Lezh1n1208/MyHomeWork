import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    m = int(str(n)[::-1])
    if gcd(n, m) == 1:
        print("YES")
    else:
        print("NO")
   