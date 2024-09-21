def solve(n):
    str_num = str(n)
    num_len = len(str(n))
    if num_len < 3:
        return "NO"
    i = 1
    while i < num_len and str_num[i] > str_num[i - 1]:
        i += 1
    
    if i == 1 or i == num_len:
        return "NO"    
    
    while i < num_len and str_num[i] < str_num[i - 1]:
        i += 1
    if i == num_len:
        return "YES"
    else:
        return "NO"
    
t = int(input())

while t > 0:
    t -= 1
    n = int(input())
    print(solve(n))
    