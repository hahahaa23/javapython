from openpyxl import Workbook #Workbook = 클래스 이름.
import numpy as np


wb = Workbook() #새로운 파일 만들어라
ws = wb.active #워크시트 가져와서 가르김

#index = 1
for r in range(1,11):
    for c in range(1,11):
        ws.cell(row=r,column=c).value = np.random.randint(0,100)
        #index += 1



wb.save('b.xlsx')
wb.close()