P = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_."

while True:
    data = input()
    parts = data.split()    
    K = int(parts[0])
    if K == 0:
        break   
    s = parts[1]
    res = ""
    for c in s:
        index = P.find(c)
        res += P[(index + K) % 28]
    print(res[::-1])
        