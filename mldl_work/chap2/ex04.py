import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.neighbors import KNeighborsClassifier
from sklearn.linear_model import LogisticRegression
form sklearn.tree import DecisionTreeClassifier

data = pd.read_excel('data.xlsx')

print(data)

length = data['lenght']
print(length)
length = length.to_numpy()
print(length)

lenght = data['lenght'].to_numpy()
weight = data['weight'].to_numpy()
target = data['target'].to_numpy()

print(lenght[:5])
print(weight[:5])
print(target[:5])

plt.scatter(lenght[:35],weight[:35])
plt.scatter(lenght[35:],weight[35:])
#plt.show()

data = [[l,w] for l,w in zip(lenght,weight)]


kn = KNeighborsClassifier()
kn.fit(data,target)

prevalue = kn.predict([[50,500],[10,12]])
print(prevalue)


















