st = "The Espresso Spirit"

cnt = 0
for i in st:
    if i =='E':
        print(i)
        print(cnt)
    cnt+=1
print(st.find('E'))

myst = "한글입니다.\n잘되네요." #줄바꾸기(\n)
print(myst)
myst = "한글입니다.\t잘되네요." #탭만큼 이동(\t)
print(myst)
myst = "한글입니다.\"잘되네요." #"출력(\")
print(myst)
myst = "한글입니다.'잘되네요." #/넣어도 빼도 출력가능('잘되네요., /'잘되네요.)
print(myst)

mylist = [1,2,3,4,5]
del mylist[3:] #33부터 지우기
print(mylist)

del mylist[:] # mylist안의 숫자만 지움
print(mylist)

del mylist
print(mylist) # mylist 자체를 지움



