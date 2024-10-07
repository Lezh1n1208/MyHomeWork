t = int(input())

def sum_num(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n = n // 10
    return sum

while t > 0:
    t -= 1
    n = int(input())
    input_string = input()
    input_num = list(map(int, input_string.split()))
    
    input_num.sort(key=lambda x: (sum_num(x), x))
            
    print(*input_num)
        