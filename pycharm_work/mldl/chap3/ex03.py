from sklearn.neighbors import KNeighborsRegressor
import numpy as np
#KNeighborsRegressor는 가까운 수 평균내서 예측

x1 = np.array([5,8,9,10,11,12,13,14])
x1 = x1.reshape(-1,2)
print(x1)

nr = KNeighborsRegressor(n_neighbors=3)
nr.fit(x1, [30,32,35,40])

prevalue = nr.predict([[7,8]])
print(prevalue)