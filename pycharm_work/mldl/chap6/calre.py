from sklearn import datasets
import pandas as pd
import numpy as np
from sklearn.linear_model import LinearRegression
from sklearn.linear_model import Ridge #항을 줄이는 것
from sklearn.linear_model import Lasso #항을 줄이는 것
from sklearn import model_selection #모델셀렉션 안에 있는 학습기 사용가능
from sklearn.preprocessing import PolynomialFeatures #항을 늘려주는 것


dataset = datasets.fetch_california_housing()

x = dataset.data
y = dataset.target

print(x.shape)
print(y.shape)

dataframe = \
    pd.DataFrame(dataset.data,columns=dataset.feature_names)
print(dataframe.head())
print(dataframe.tail())

train_input,test_input,train_target,test_target \
    = model_selection.train_test_split(x,y,random_state=42)

lr = LinearRegression()
lr.fit(train_input,train_target)

훈련점수 = lr.score(train_input,train_target)
테스트점수 = lr.score(test_input,test_target)

print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')

# print(train_input[:2])
# print(np.round(train_input[:2])) #소수점 날리기
# print(train_target[:2])
'''
[[   4.2143       37.            5.28823529    0.97352941  860.
     2.52941176   33.81       -118.12      ]
 [   5.3468       42.            6.36432161    1.0879397   957.
     2.40452261   37.16       -121.98      ]]
[[   4.   37.    5.    1.  860.    3.   34. -118.]
 [   5.   42.    6.    1.  957.    2.   37. -122.]]
[2.285 2.799]
'''

pred = lr.predict(train_input[:2])
print(pred)
pred = lr.predict(np.round(train_input[:2]))
print(pred)

poly = PolynomialFeatures(degree=4)
#degree=2 -> 항을 늘리면 과대적합이 일어나 훈련점수는 훈련이 잘됨. 테스트는 ㄴㄴ
poly.fit(train_input)

train_poly = poly.transform(train_input)
test_poly = poly.transform(test_input)

print(train_poly.shape)
print(test_poly.shape)


lr.fit(train_poly,train_target)

훈련점수 = lr.score(train_poly,train_target)
테스트점수 = lr.score(test_poly,test_target)

print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')

'''
[2.285 2.799]
'''
pred = lr.predict(train_poly[:2])
print(pred)
pred = lr.predict(np.round(train_poly[:2]))
print(pred)

훈련점수 = lr.score(train_poly,train_target)
테스트점수 = lr.score(test_poly,test_target)

print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')
print('--------------------------------------')


ridge = Ridge()
ridge.fit(train_poly,train_target)

pred = ridge.predict(train_poly[:2])
print(pred)
pred = ridge.predict(np.round(train_poly[:2]))
print(pred)

훈련점수 = ridge.score(train_poly,train_target)
테스트점수 = ridge.score(test_poly,test_target)

print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')
print('--------------------------------------')


lasso = Lasso()
lasso.fit(train_poly,train_target)

pred = lasso.predict(train_poly[:2])
print(pred)
pred = lasso.predict(np.round(train_poly[:2]))
print(pred)

훈련점수 = lasso.score(train_poly,train_target)
테스트점수 = lasso.score(test_poly,test_target)

print(f'훈련점수 = {훈련점수}')
print(f'테스트점수 = {테스트점수}')






















































