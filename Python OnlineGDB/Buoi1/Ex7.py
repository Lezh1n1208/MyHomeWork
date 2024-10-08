def solve(s_list):
    list_num = []
    list_count = []
    for i in range(len(s_list)):
        if s_list[i] not in list_num:
            list_num.append(s_list[i])
            list_count.append(1)
        else:
            list_count[list_num.index(s_list[i])] += 1
    res_num = "(" + ", ".join(str(s) for s in list_num) + ")"
    res_count = "(" + ", ".join(str(s) for s in list_count) + ")"
    return res_num + " " + res_count    

s = str(input())

s_list = s.split(", ")
print(solve(s_list), end="")