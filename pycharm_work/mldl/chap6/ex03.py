#타겟값이 있으면 지도학습, 없으면 군집학습
from sklearn.cluster import KMeans
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

fruits = np.load('fruits_300.npy')
fruits_2d = fruits.reshape(-1,10000)

km = KMeans(n_clusters=3)
km.fit(fruits_2d)

print(km.labels_)
print(np.unique(km.labels_,return_counts=True))

def draw_fruits(arr,배율=1):
    n = len(arr)
    rows = int(np.ceil(n/10))
    cols = n if rows <2 else 10
    print('draw ',rows)
    print('draw ',cols)
    fig, axis = plt.subplots(rows,cols,figsize=(cols*배율,rows*배율))
    for i in range(rows):
        for j in range(cols):
            if i*10 + j < n:
                axis[i,j].imshow(arr[i*10+j])
            axis[i,j].axis('off')
    plt.show()

draw_fruits(fruits[km.labels_==2])

# rows = np.ceil(111/10)
# print(rows)
# cols = 11 if 11 <2 else 10
# print(cols)


