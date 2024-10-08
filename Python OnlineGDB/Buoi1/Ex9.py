s = str(input())

vowels = ['a', 'e', 'i', 'o', 'u']

count = 0
for char in s:
    if char in vowels:
        count += 1
print(count, end="")