t = int(input())

def solve(a):
    b = str(a)
    i = len(b) - 1
    res = ""
    k = 0
    while i >= 1:
        if int(b[i]) + k >= 5:
            k = 1
        else:
            k = 0
        res += "0"
        i -= 1
    res = str(int(b[i]) + k) + res;
    return res
        
while t > 0:
    t -= 1
    x = int(input())
    print(solve(x))
