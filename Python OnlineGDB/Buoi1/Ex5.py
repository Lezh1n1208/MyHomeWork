def solve(n):
    if n < 0:
        k = -n
    else:
        k = n
    str_n = str(k)
    res = str_n[-1:-2:-1] + str_n[1:len(str_n) - 1:1] + str_n[0]
    if n < 0:
        return "-" + res
    return res
    
    
n = int(input())

print(solve(n), end="")
