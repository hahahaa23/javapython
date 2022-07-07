def main():
    n = -1
    while n < 9:
        n = n + 1
        print("n = ",n,end = '\n')

main()

# 선생님 버전
def doA():
    num = 0
    while num < 10:
        print("num = ",num)
        num += 1

def doB():
    num = 9 
    while num > -1:
        print("num = ",num)
        num -= 1
    

doA()
doB()