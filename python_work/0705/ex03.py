def main():
    print('main 시작')
    a = input("숫자를 입력하세요.") #type(a)=0 -> str(글자)
    print(type(a))
    num = int(a) # type(a) -> int로 나옴. 즉 a를 숫자로 변환해서 num에 입력해줌.
    print(type(num))
    if num > 0:
        print(num,"은 0보다 큽니다.")
    else: 
        print(num,"은 0보다 작습니다.")
    print('main 끝')


main()