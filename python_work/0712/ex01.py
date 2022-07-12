from pyrsistent import b
from regex import B


class A:
    def __init__(self,a,b):
        self.a = a
        self.b = b
    def getAB(self):
        return self.a + self.b

for i in [A(10,20),A(20,30),A(30,40),A(40,50)]:
# 리스트형 자료는 순서가 있음. 0 1 2 3 4 5 순, 메모리가 하나 더 만들어 지는건 아님. 변수를 만들어서 사용
    print(i.getAB())