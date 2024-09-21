t = int(input())

def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n*factorial(n - 1)

def solve(n):
    str_num = str(n)
    res = 0
    for c in str_num:
        res += factorial(int(c))
    return res == n

while t > 0:
    t -= 1
    n = int(input())
    if (solve(n)):
        print("Yes")
    else:
        print("No")
    