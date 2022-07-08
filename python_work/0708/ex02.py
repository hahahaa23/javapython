import won as w1 # as w1 -> 임의로 겹치는 이름이 없도록 이름을 지을 수 있음.

import pandas as pd
import numpy as np

# 0 < x < 1
result = np.random.rand(10)
print(f"랜덤 값 나옵니다.{result}")

num = float(input("반지름 입력3"))
result = w1.areawon(3)
print(f"넓이는 = {result}") #보관법?(f) -> 문자열 안에 변수를 출력할 때 사용
result = w1.cwon(2)
print(f"둘레는 = {result}")