#a = list(range(1,101,1))
#b = list(range(99,0,-1))
#print(a+b)

a = [i for i in range(1,101)]
a = tuple(a)
b = [i for i in range(99,0,-1)]
b = tuple(b)
c = a+b
print(c)




import numpy as np

a = np.arange(1,10)
print(a)


a = [i for i in range(1,10)]
print(a)