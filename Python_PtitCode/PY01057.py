import math

def isPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

prime_num = {'2', '3', '5', '7'}

def solve(n):
    n_str = str(n)
    for i in range(0, len(n_str)):
        if isPrime(i):
            if n_str[i] not in prime_num:
                return "NO"
        else:
            if n_str[i] in prime_num:
                return "NO"
    return "YES"

t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    print(solve(n))
