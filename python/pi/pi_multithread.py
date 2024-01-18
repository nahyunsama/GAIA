# machin formula
# signma k=1 k=X {(16(-1)^(k-1))/(2k-1) * (1/5)^(2k-1) - 4(-1)^(k-1))/(2k-1) * (1/239)^(2k-1)} = pi/4

from decimal import Decimal, getcontext
from threading import Thread, local
import re
from queue import Queue
from functools import reduce

q = Queue()
result = []
REPEAT = 20000
getcontext().prec=REPEAT
CAL_LOOPS = 100

def cal_pi():
    getcontext().prec=REPEAT
    while True:
        i = q.get()
        l = local()
        l.fraction_sum = Decimal(0)
        for i in range(i, i + CAL_LOOPS):
            l.fraction_1 = Decimal(16) * (-1) ** (i - 1) / (2 * i - 1)
            l.fraction_2 = Decimal(1) / Decimal(5) ** (2 * i - 1)
            l.fraction_3 = Decimal(4) * (-1) ** (i - 1) / (2 * i - 1)
            l.fraction_4 = Decimal(1) / Decimal(239) ** (2 * i - 1)
            l.fraction_sum += l.fraction_1 * l.fraction_2 - l.fraction_3 * l.fraction_4
            #return fraction_1 * fraction_2 - fraction_3 * fraction_4
        result.append(l.fraction_sum) 
        if i % 1000 == 0:
             print(i)        
        q.task_done()

for _ in range(48):
    Thread(target=cal_pi, daemon=True).start()

for i in range(1, REPEAT+1, CAL_LOOPS):
    q.put(i)

q.join()

print(len(result))
result = reduce(lambda x, y: x + y, result, Decimal(0))


with open("pi.txt") as f:
    PI = f.read()

PI = re.sub(r"\s", "", PI)
#print(PI)

result = str(result)
with open("out.txt", "w") as f:
    f.write(result)

for i in range(min(len(PI), len(result))):
    if PI[i] != result[i]:
        print("LAST CORRECT : ", i)
        break
#when for is end, execute
else: 
    print("EVERY THINGS ARE CORRECT")