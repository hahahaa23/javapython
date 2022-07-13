from sklearn.neighbors import KNeighborsClassifier

import numpy as np

a = [1,2,3,4,5]
npa = np.array(a)

a = a*5
npa = npa*5
print('a',a)
print('npa',npa)

print(npa.shape)
#1차원 배열인데 5개 들어가 있다.

#np.random.seed(42) # 시드값이 주어지면 쪽같은 랜덤한 값이 나옴
a = np.random.randint(1,100,5)
print(a)
print(type(a))

