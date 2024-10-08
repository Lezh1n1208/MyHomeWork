def solve(password):
    password = password.replace(" ", "")
    if len(password) < 10:
       return False
    if not password.isalnum():
        return False
    count = 0
    for char in password:
       if char.isdigit():
           count += 1
    if count < 2:
        return False
    return True
   
s = str(input())
print(solve(s), end="")