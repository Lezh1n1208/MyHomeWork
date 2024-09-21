import math

t = int(input())

def isPrime(n):
    if n < 2:
        return False
    for i in range (2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True    

while t > 0:
    t -= 1
    n = int(input())
    res_list = list()
    for i in range (10, n):
        k = int(str(i)[::-1])
        if isPrime(i) and isPrime(k):
            if i == k:
                continue
            if i < n and k < n and not(i in res_list and k in res_list):
                res_list.append(i)
                res_list.append(k)
    for num in res_list:
        print(num, end=" ")
    print()    
    