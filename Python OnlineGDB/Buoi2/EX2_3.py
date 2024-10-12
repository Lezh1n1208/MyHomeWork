def find_combinations(n, k, tmp_list):
    res = []
    def backtrack(start, current):
        if len(current) == n:
            if (sum(current) == k):
                res.append(current[:])
            return
    
        for i in range(start, len(tmp_list)):
            current.append(tmp_list[i])
            backtrack(i + 1, current)
            current.pop()
    backtrack(0, [])
    return res

n = int(input())
k = int(input())
s = input()
input_list = list(map(int, s[1:-1].split(',')))
output_list = find_combinations(n, k, input_list)

for i in range(len(output_list)):
    if i == len(output_list) - 1:
        print(output_list[i], end="")
    else:
        print(output_list[i])    
            
        