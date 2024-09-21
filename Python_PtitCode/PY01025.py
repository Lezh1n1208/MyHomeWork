n = int(input())

str_num = str(n)

str_list = list(str_num)

for i in range(len(str_list) - 3, 0, -3):
    str_list.insert(i, ",")
res = "".join(str_list)
print(res)