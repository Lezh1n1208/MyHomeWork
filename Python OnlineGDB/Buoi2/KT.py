# input: {1: [3, 5, 7], 3: [6, 9, 12], 2: (4,6), 5: [0, 5, 10, 15, 15, 5], 4: [8, 12, 16, 20, 16, 8]}

def longest(dict):
    max_length = 0
    for key in dict:
        if len(dict[key]) > max_length:
            max_length = len(dict[key])
    res_dict = {}
    for x, y in dict.items():
        if len(y) == max_length:
            res_dict.update({x : y})
    return res_dict

def countElement(dict):
    res1 = {}
    for key in dict:
        res2 = {}
        for i in dict[key]:
            res2.update({i : dict[key].count(i)})
        res1.update({key : res2})
    return res1

def maxElement(dict):
    max = 0
    for key in dict:
        for i, j in dict[key].items():
            if j > max:
                max = j
    res1 = {}
    for key in dict:
        res2 = {}
        for i, j in dict[key].items():
            if j == max:
                res2.update({i : j})
        res1.update({key : res2})
    return res1
                    

s = input()
s_input = eval(s)

dict_a = longest(s_input)
dict_b = countElement(dict_a)
dict_c = maxElement(dict_b)

print(dict_a)
print(dict_b)
print(dict_c, end="")