s = input()

input = map(int, s[1:-1].split(","))

res = sorted(input, key = lambda x: (x < 0))

print(res, end="")