from a import Friend

mylist = [Friend("윤성우","010-111-222"),Friend("이선준","010-333-4444"),Friend("장지우","010-555-5555"),Friend("윤지윤","010-777-8888")]

for f in mylist:
    print(f.get_name())
    if f.get_name() == '장지우':
        f.set_phone("010-999-9999")

for f in mylist:
    print(f)




