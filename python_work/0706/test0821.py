def doA():
    lcm = 1
    while True:
       if lcm %6 == 0 and lcm %45 == 0:
            break
    lcm += 1
    print("최소공배수",lcm)
 
doA()