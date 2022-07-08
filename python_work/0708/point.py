from re import X
from tkinter import Y


class Point:
    def __nint__(self,x,y):
        self.xpos = x
        self.ypos = y
        
    def showInfo(self):
        print(f"xpos = {self.xpos} ypos = {self.ypos}")




