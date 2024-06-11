import csv
import time
import datetime
import bs4
import urllib.request

csvName = 'C:/Users/gyehd/OneDrive/바탕 화면/seoul_weather.csv'
with open(csvName, 'w', newline='') as csvFp:
    csvWriter = csv.writer(csvFp)
    csvWriter.writerow(['월일', '시분초', '미세먼지','초미세먼지'])

naverUrl="https://weather.naver.com/air/09140104"
while True :
    htmlObject = urllib.request.urlopen(naverUrl)
    webPage = htmlObject.read()
    bsObject = bs4.BeautifulSoup(webPage, 'html.parser')
    tag = bsObject.find('div', {'class': "top_area"})
    mise1 = tag.find('span', {'class': "value _cnPm10Value"}).text
    mise2 = tag.find('span', {'class': 'value _cnPm25Value'}).text

    now = datetime.datetime.now()
    mmdd = now.strftime('%m-%d')
    hhmmss = now.strftime('%H:%M:%S')

    weather_list = [mmdd, hhmmss, mise1, mise2]
    with open(csvName, 'a', newline='') as csvFp:
        csvWriter = csv.writer(csvFp)
        csvWriter.writerow(weather_list)
    time.sleep(3)