# machin formula
# signma k=1 k=X {(16(-1)^(k-1))/(2k-1) * (1/5)^(2k-1) - 4(-1)^(k-1))/(2k-1) * (1/239)^(2k-1)} = pi/4
# 1000 개씩 result 와 i 값을 저장해서 일시 중단 가능하게 만들기 + timestamp
# windows docker command : docker run -v ${PWD}:/mnt --rm -it python:3 python3 /mnt/pi_concurrent.py

from decimal import Decimal, getcontext
from concurrent.futures import ProcessPoolExecutor
from functools import reduce
import re

REPEAT = 50000
getcontext().prec=REPEAT

def cal_pi(i):
    fraction_1 = Decimal(16) * (-1) ** (i - 1) / (2 * i - 1)
    fraction_2 = Decimal(1) / 5 ** (2 * i - 1)
    fraction_3 = Decimal(4) * (-1) ** (i - 1) / (2 * i - 1)
    fraction_4 = Decimal(1) / 239 ** (2 * i - 1)
    if i % 1000 == 0:
        print(i)
    return fraction_1 * fraction_2 - fraction_3 * fraction_4

def main():
    result = Decimal(0)

    ## map은 array 값을 변경하는 함수, range 1, REPEAT+1 의 값을 cal_pi 를 이용해서 변환
    ## ProcessPool 을 사용해서 GIL의 개입을 최대한 줄임 >> 장기적으로 GIL이 사라질 예정

    with ProcessPoolExecutor(max_workers=24) as executor:
        result = reduce(lambda x, y: x + y, executor.map(cal_pi, range(1, REPEAT+1)))
        #print(pi)

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

if __name__ == "__main__":
    main()