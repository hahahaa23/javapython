def doB():
    num = 42
    while True:
        if 42 %num == 0 and 120 %num == 0:
            print(num,end=" ")
            break
        num -=1


doB()