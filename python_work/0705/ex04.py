def main():
    num = int(input("숫자를 입력하세요."))
    if num > 0:
        print(num,"은 0보다 큽니다.")
    elif num == 0:
        print("num은 0입니다.")
    else:
        print(num,"은 0보다 작습니다.") # !=는 다른지 묻는 거임.

main()