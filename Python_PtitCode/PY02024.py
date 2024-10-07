t = int(input())

def sum_num(n):
    res = 1
    while n > 0:
        res *= (n % 10)
        n = n // 10
    return res

while t > 0:
    t -= 1
    n = int(input())
    input_string = input()
    input_num = list(map(int, input_string.split()))
    
    input_num.sort(key=lambda x: (sum_num(x), x))
            
    print(*input_num)
        