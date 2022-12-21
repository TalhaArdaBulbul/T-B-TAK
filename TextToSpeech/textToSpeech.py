from gtts import gTTS
import os

f = open("TÜBİTAK-PROJE.txt", "r", encoding="utf-8")
language = "tr"

myobj = gTTS(text = f.read(), lang = language, slow = False)

myobj.save("proje.mp3")
f.close()
os.system("proje.mp3")
