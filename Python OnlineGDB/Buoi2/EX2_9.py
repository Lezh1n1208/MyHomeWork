def checkPalindrome(s):
    s = s.lower()
    return s == s[::-1]

s = input()

input = s[1:-1].split(", ")
res = []
for i in range(len(input)):
    if checkPalindrome(input[i]):
        res.append(input[i][1:-1])
        
print(res, end="")