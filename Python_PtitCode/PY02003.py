import heapq
def is_hamming(n):
    if n == 1:
        return True
    for prime in [2, 3, 5]:
        while n % prime == 0:
            n //= prime
    return n == 1

def hamming_position(n):
    if n == 1:
        return 1
    
    hamming_numbers = []
    seen = {1}
    heap = [1]
    
    while heap:
        smallest = heapq.heappop(heap)
        hamming_numbers.append(smallest)
        
        for prime in [2, 3, 5]:
            new_hamming = smallest * prime
            if new_hamming not in seen:
                seen.add(new_hamming)
                heapq.heappush(heap, new_hamming)
                
        if smallest == n:
            return len(hamming_numbers)

t = int(input())
while t:
    n = int(input())
    if is_hamming(n):
        print(hamming_position(n))
    else:
        print("Not in sequence")
    t -= 1