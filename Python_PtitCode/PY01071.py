def checkEnd(s):
    return s.lower().endswith('.py')

def checkBegin(s):
    name_part = s[:-3]
    return all(c.isalpha() or c == '_' for c in name_part)

s = input()
if checkBegin(s) and checkEnd(s):
    print("yes")
else:
    print("no")