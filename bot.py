from fbchat import Client
from fbchat.models import *
import random
import config
import schedule
import time

client = Client(config.username, config.password)

def GoodNight():
	for friend in config.friendlist:
		wish = random.choice(config.wish).format(config.friendlist[friend],"Yêu")
		client.sendRemoteImage(random.choice(config.images), message=wish, thread_id=friend, thread_type=ThreadType.USER)
		time.sleep(1)

schedule.every().day.at("23:00").do(GoodNight)

while True:
    schedule.run_pending()
    time.sleep(1)