t = int(input())

input_string = input()

input_num = input_string.split()

for i in range(t):
    input_num[i] = float(input_num[i])

input_num.sort()

sum = 0
count = 0
for i in range(t):
    if input_num[i] != input_num[0] and input_num[i] != input_num[t-1]:
        sum += input_num[i]
        count += 1
res = sum/count
print(f"{res:.2f}")
    
