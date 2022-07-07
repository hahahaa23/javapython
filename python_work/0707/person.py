class Person:
    name = ""
    def __init__(self,name): # self는 생략 불가, 
        self.name = name

    def __str__(self):
        return "Person "+self.name
