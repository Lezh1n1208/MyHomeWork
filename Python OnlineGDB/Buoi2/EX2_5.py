def findShortest(dict):
    min = len(dict[list(dict.keys())[0]])
    for x, y in dict.items():
        if len(y) < min:
            min = len(y)
    res = []
    for x, y in dict.items():
        if len(y) == min:
            res.append(x)
    return res

s = input()
input = eval(s)
print(findShortest(input), end="")
