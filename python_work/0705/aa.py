class AA:
    number = 0 #class변수
    def __init__(self,number): #지역변수, self는 자신을 가르키는 것이라 AA임.
        self.number = number #class변수 사용시 self.을 붙이기
    def print(self):
        print('number = ',self.number)
        if(self.number>0):
            print('양수입니다.')
        else:
            print('음수입니다.')
    def inputnumber(self):
        self.number = eval(input("숫자를 입력하세요."))
        #eval은 문자를 숫자로 변환해줌.



