t = int(input())

while t > 0:
    t -= 1
    n = input()
    tong = 0
    tich = 1
    found_non_zero = False
    for i in range(len(n)):
        if i % 2 == 0:
            tong += int(n[i])
        else:
            if (n[i] != '0'):
                found_non_zero = True
                tich *= int(n[i])
            
    print(tong, end=" ")
    if found_non_zero:
        print(tich)
    else:
        print(0)