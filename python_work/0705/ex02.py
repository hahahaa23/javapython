'''
숫자를 입력받아서 
양수이면 양수입니다. 출력
음수이면 음수입니다 출력
ex)
숫자를 입력하세요
5
양수입니다.
숫자를 입력하세요
-1
음수입니다.
'''

from aa import AA

a1 = AA(100) # AA객체 생성
print(a1.number)
a1.print() # def print(self):로 감(AA파일)
a1.inputnumber() # def inputnumber(self):로 감(AA파일)
a1.print()


a2 = AA(200)
print(a2.number)
a2.inputnumber()
a2.print()
