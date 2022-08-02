import numpy as np
import matplotlib.pyplot as plt


fruits = np.load('fruits_300.npy')
print(fruits.shape)

_,axis = plt.subplots(1,3)
axis[0].imshow(fruits[0],cmap='gray_r')
axis[1].imshow(fruits[100],cmap='gray_r')
axis[2].imshow(fruits[200],cmap='gray_r')
plt.show()

apple = fruits[:100].reshape(-1,10000)
pineapple = fruits[100:200].reshape(-1,10000)
banana = fruits[200:300].reshape(-1,10000)

# print(apple.shape)
applemean = apple.mean(axis=1)
pineapplemean = pineapple.mean(axis=1)
bananamean = banana.mean(axis=1)

plt.hist(applemean,alpha=0.8)
plt.hist(pineapplemean,alpha=0.8)
plt.hist(bananamean,alpha=0.8)
#alpha = 투명도

plt.show()

# plt.savefig('apple0.png')
# plt.close()

applemean = apple.mean(axis=0)
pineapplemean = pineapple.mean(axis=0)
bananamean = banana.mean(axis=0)

_,axis = plt.subplots(1,3,figsize=(20,5))

# axis[0].bar(range(10000),applemean,alpha=0.8)
# axis[1].bar(range(10000),pineapplemean,alpha=0.8)
# axis[2].bar(range(10000),bananamean,alpha=0.8)
# #alpha = 투명도
# plt.show()

axis[0].imshow(applemean.reshape(100,100),cmap='gray_r')
axis[1].imshow(pineapplemean.reshape(100,100),cmap='gray_r')
axis[2].imshow(bananamean.reshape(100,100),cmap='gray_r')

plt.show()


applemean = applemean.reshape(100,100)
pineapplemean = pineapplemean.reshape(100,100)
bananamean = bananamean.reshape(100,100)

diff = np.abs(fruits-applemean) #바나나, 파인애플 넣어도 가능
print(diff[0].shape)
print(np.round(diff[0],decimals=0))
print(np.sum(diff[0]))

abs_mean = np.mean(diff,axis=(1,2))
print(abs_mean.shape)
print(abs_mean[:20])
print(abs_mean[100:120])
print(abs_mean[200:220])

_,axis = plt.subplots(10,10,figsize=(10,10))
for i in range(10):
    for j in range(10):
        axis[i,j].imshow(fruits[i*10+j],cmap='gray_r')
        axis[i,j].axis('off')

plt.show()

appleindex = np.argsort(abs_mean)[:100]
_,axis = plt.subplots(10,10,figsize=(10,10))
for i in range(10):
    for j in range(10):
        axis[i,j].imshow(fruits[i*10+j],cmap='gray_r')
        axis[i,j].axis('off')

plt.show()





















