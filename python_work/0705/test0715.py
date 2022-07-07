def main():

    num = int(input('정수 입력'))

    if num < 0:
        print('입력한 값은 0보다 작습니다.')
    elif num < 10:
         print('입력한 값은 1이상 10미만입니다.')
    elif num < 20:
        print('입력한 값은 10이상 20미만입니다.')
    else:
        print('입력한 값은 20이상입니다.')

main()