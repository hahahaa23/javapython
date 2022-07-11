sum = 0

class Accumulator:    
    def __init__(self):
        self.sum = 0
   # @staticmethod
    def add(self,i):
        global sum #전역변수를 당겨오는거라 다른곳에서 변경을 하면 문제있음. -> 그래서 self.적어줌
        self.sum = self.sum + i
   # @staticmethod
    def showResult(self):
        print(f"sum = {self.sum}")
