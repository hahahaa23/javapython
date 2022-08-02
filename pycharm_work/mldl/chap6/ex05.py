import numpy as np
from sklearn.cluster import KMeans
from sklearn.linear_model import LogisticRegression
import matplotlib.pyplot as plt
import cv2


fruits = np.load('fruits_300.npy')
print(fruits.shape)
fruits2d = fruits.reshape(-1,10000)
#reshape없이 사용할 경우 사진 사이즈가 480*680이라서 학습기가
#제대로 작동하지 못함.

plt.axis('off')
plt.imshow(fruits[0],cmap='gray_r')
plt.savefig('pltfruits0.png')

cv2.imwrite('cvfruits0.jpg',fruits[205])

km = KMeans(n_clusters=3,random_state=42)
km.fit(fruits2d)
#비지도학습이라 타겟값이 없는거

predvalue = km.predict([fruits2d[0]])
print(predvalue)

a = cv2.imread('cvfruits0.jpg',cv2.IMREAD_GRAYSCALE)
print(a.shape)
#cv2.IMREAD_GRAYSCALE을 사용해 사진을 흑과백으로 표현하는 2진수로 변환
#predict를 사용할 때 2진수 사용 필수

pred = km.predict(a.reshape(-1,10000))
print(pred)

target = np.array(['사과']*100+['파인애플']*100+['바나나']*100)
print(target.shape)
print(target[:5])
print(target[100:105])
print(target[200:205])

#LogisticRegression = 타겟값이 필요한 학습기임
lr = LogisticRegression()
lr.fit(fruits2d,target)

pred = lr.predict(fruits2d[0].reshape(-1,10000))
#2차원 데이터로 만들기 위해 reshape
print(pred)
pred = lr.predict(fruits2d[100].reshape(-1,10000))
print(pred)
pred = lr.predict(fruits2d[200].reshape(-1,10000))
print(pred)

pred = lr.predict(a.reshape(-1,10000))
print(pred)
















































