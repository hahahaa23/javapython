import cv2
import numpy as np
import matplotlib.pyplot as plt

woyo = cv2.imread('wy.png',cv2.IMREAD_GRAYSCALE)
# print(wy.shape)
# pltwy = cv2.cvtColor(wy, cv2.COLOR_BGR2RGB)
# np.save('a.npy',pltwy)
#
pltwy = np.load('a.npy')

plt.scatter([10,20,30],[10,20,30],s=10)
plt.text(100,200,'hihihi')
# plt.axis('off')
plt.imshow(pltwy)
plt.show()