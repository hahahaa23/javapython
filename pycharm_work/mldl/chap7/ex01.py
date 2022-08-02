import numpy as np
from tensorflow import keras
from sklearn.linear_model import SGDClassifier
import matplotlib.pyplot as plt


(train_input,train_target),(test_input,test_target) = keras.datasets.fashion_mnist.load_data()

print(train_input.shape)
print(train_target.shape)
train_input = train_input.reshape(-1,784) #2차원데이터로 바꿈
test_input = test_input.reshape(-1,784)
train_scaled = train_input/255.0
test_scaled = test_input/255.0

#SGDClassifier -> 인공신경망과 가장유사한 구조를 지닌 학습기
sgd = SGDClassifier(loss='log',random_state=42,max_iter=5)
sgd.fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)
print(훈련점수)
print(테스트점수)

#0~255까지
# plt.imshow(train_input[0].reshape(28,28),cmap='gray_r')
# plt.show()

#0~0.99까지
# plt.imshow(train_scaled[0].reshape(28,28),cmap='gray_r')
# plt.show()

#0티셔츠 1바지 2스웨터 3드레스 4코트 5샌달 6셔츠 7스니커즈 8가방 9앵글부츠

pred = sgd.predict(train_scaled[0].reshape(-1,784))
print(pred)

pred = sgd.predict(train_scaled[1].reshape(-1,784))
print(pred)

# plt.imshow(train_scaled[1].reshape(28,28),cmap='gray_r')
# plt.show()

# print(np.round_(train_scaled[1].reshape(28,28),decimals=2))

mydata = np.random.rand(784) #1차원 배열
print(mydata.shape) #2차원데이터로 바꿈
print(mydata)

mydata = mydata.reshape(28,28)
mydata[:14,0] = 0  #[y,x], 자르기.
mydata[:13,1] = 0
mydata[:12,2] = 0
mydata[:11,3] = 0
mydata[:10,4] = 0
mydata[:9,5] = 0


plt.imshow(mydata,cmap='gray_r')
plt.show()

pred = sgd.predict(mydata.reshape(-1,784))
print(pred)











































