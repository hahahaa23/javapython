def birth_only(p1):
    plist = p1.split("-")
    return plist[0]

p1 = "000314-47xxxxx"
p1 = birth_only(p1)
print(p1)