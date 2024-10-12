def get_k_skips_n_grams(k, n, input_list):
    words = input_list.split()
    result = []
    
    def backtrack(start, current):
        if len(current) == n:
            result.append(" ".join(current))
            return
        
        for i in range(start + 1, min(start + k + 2, len(words))):           
            backtrack(i, current + [words[i]])
            
    for i in range(len(words)):
        backtrack(i, [words[i]])
    return result

k = int(input())
n = int(input())
s = input()
ngrams = get_k_skips_n_grams(k, n, s)
res = ", ".join(ngrams)
print(res, end="")