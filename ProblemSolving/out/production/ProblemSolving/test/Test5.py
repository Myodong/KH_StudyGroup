import urllib.request
import bs4

kyoboUrl="https://www.kyobobook.co.kr/"
htmlObject=urllib.request.urlopen(kyoboUrl)
bsObject=bs4.BeautifulSoup(htmlObject,'html.parser')
print(bsObject)