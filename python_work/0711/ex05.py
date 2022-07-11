a = 0
a += 1
def funcA():
    print(a)


def funcLocalA(n):
    print(n)
#n은 로컬 변수라 호출 불가능 = 지역변수


funcA()
funcLocalA(10)
print(a)



