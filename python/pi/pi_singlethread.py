# machin formula
# signma k=1 k=X {(16(-1)^(k-1))/(2k-1) * (1/5)^(2k-1) - 4(-1)^(k-1))/(2k-1) * (1/239)^(2k-1)} = pi/4

from decimal import Decimal, getcontext
from threading import Thread
import re
REPEAT = 20000
getcontext().prec=REPEAT

result = Decimal(0)

with open("pi.txt") as f:
    PI = f.read()

PI = re.sub(r"\s", "", PI)
#print(PI)

for i in range(1, REPEAT+1):
    fraction_1 = Decimal(16) * (-1) ** (i - 1) / (2 * i - 1)
    fraction_2 = Decimal(1) / Decimal(5) ** (2 * i - 1)
    fraction_3 = Decimal(4) * (-1) ** (i - 1) / (2 * i - 1)
    fraction_4 = Decimal(1) / Decimal(239) ** (2 * i - 1)
    result += (fraction_1 * fraction_2 - fraction_3 * fraction_4)

    if i % 1000 == 0:
        print("check the for number : ", i)

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