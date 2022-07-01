def doA(a=10):
    print(a)

for i in [1,2,3,4]:
    print(i,end='_')

print() 
'''=(end='\n')'''
for i in [1,2,3,4]:
    print(i,end='\n')

doA()
doA(20)
