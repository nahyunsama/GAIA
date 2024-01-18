# machin formula
# signma k=1 k=X {(16(-1)^(k-1))/(2k-1) * (1/5)^(2k-1) - 4(-1)^(k-1))/(2k-1) * (1/239)^(2k-1)} = pi/4

from decimal import Decimal, getcontext
from multiprocessing import Process
import re
REPEAT = 20000
getcontext().prec=REPEAT

result = Decimal(0)

with open("pi.txt") as f:
    PI = f.read()

PI = re.sub(r"\s", "", PI)

with open("out.txt") as f:
    result = f.read()

for i in range(min(len(PI), len(result))):
    if PI[i] != result[i]:
        print("LAST CORRECT : ", i)
        break
#when for is end, execute
else: 
    print("EVERY THINGS ARE CORRECT")