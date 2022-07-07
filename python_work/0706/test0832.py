def main():
    i = 2
    while 2 <= i < 100:
        i = i + 1
        if i %2 == 0 or i %3 == 0:
            continue
        print(i, end=' ')


main()
