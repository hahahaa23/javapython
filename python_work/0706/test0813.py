def main():

    num = 0

    while 3*num/2 <= 63:
        num = num + 1  # num += 1
        print("num = ",(num-1),end="\n")
        

main()


#선생님 버전
# 1.
num = 1
while True:
    if 3*num/2 != 63:
        break
    num += 1

print("num = ",num)


# 2.
num = 1
while 3*num/2 != 63:
    num += 1

print("num = ",num)