import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.linear_model import SGDClassifier



data = pd.read_excel('fish_data.xlsx')
print(data.info())

fish_input = data[['Weight','Length','Diagonal','Height','Width']].to_numpy()
fish_target = data['Species'].to_numpy()

print(fish_input.shape)
print(fish_target.shape)

print(fish_input[:5])
print(fish_target[:5])

train_input,test_input,train_target,test_target=\
    train_test_split(fish_input,fish_target,random_state=42)

print(train_input[:5])
print(train_target[:5])

ss = StandardScaler()
ss.fit(train_input)

train_scaled = ss.transform(train_input)
test_scaled = ss.transform(test_input)

print(train_scaled[:5])
print(train_target[:5])

sgd = SGDClassifier(loss='log',max_iter=100,random_state=42)
sgd.fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

sgd.partial_fit(train_scaled,train_target)
#partial_fit = 점진적 학습방법. 같은 데이터로 여러번 학습

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

sgd.partial_fit(train_scaled,train_target)

훈련점수 = sgd.score(train_scaled,train_target)
테스트점수 = sgd.score(test_scaled,test_target)

print(훈련점수)
print(테스트점수)

예측값 = sgd.predict(test_scaled[:5])
print(예측값)
print(test_target[:5])

indexsx = (train_target == 'Whitefish')
print(indexsx)
#indexsx = (train_target == 'Whitefish')
#print(indexsx)
예측값 = sgd.predict(train_scaled[indexsx])
print(예측값)
print(train_target[indexsx])

sc = SGDClassifier(loss='log',random_state=42)

train_score = []
test_score = []

classes = np.unique(train_target)
print(classes)

for _ in range(300):
    sc.partial_fit(train_scaled,train_target,classes=classes)

    train_score.append(sc.score(train_scaled,train_target))
    test_score.append(sc.score(test_scaled,test_target))

print(train_score[:5])
print(test_score[:5])

import matplotlib.pyplot as plt

plt.plot(train_score)
plt.plot(test_score)
plt.show()

print(train_score[-1])



























