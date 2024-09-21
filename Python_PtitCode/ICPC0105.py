import re

t = int(input())

while (t):
    t = t - 1
    s = input()
    numbers = re.findall(r'\d+', s) 
    numbers = [int(num) for num in numbers] 
    min = numbers[0] 
    for i in range(1, numbers.__len__()):
        if numbers[i] > min:
            min = numbers[i]
    print(min)        
    