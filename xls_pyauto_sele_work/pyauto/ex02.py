import pyautogui
import pyperclip

a = 'mspaint'
pyperclip.copy(a)

pyautogui.hotkey('win','r')
pyautogui.hotkey('ctrl','v')
pyautogui.hotkey('enter')

pyautogui.sleep(1)
img = pyautogui.locateOnScreen('./pyauto_work/home.png',confidence=0.9)
pyautogui.click(img)

pyautogui.sleep(1)
img = pyautogui.locateOnScreen('./pyauto_work/a.png',confidence=0.9)
pyautogui.click(img)

pyautogui.move(0,300)
pyautogui.click()

pyautogui.write('abcde')
pyautogui.sleep(1)

win1 = pyautogui.getActiveWindow()
win1.close()

pyautogui.sleep(2)
pyautogui.write('n')

