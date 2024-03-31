#!bin/bash
#
#정수 2개를 입력 받고 첫 번째로 받은 정수가 홀수라면 서로 더하고
#만약 짝수라면 뺀 값을 출력하는 코드를 어떤 언어든 상관없이
#자신이 사용하는 언어로 최대한 비효율적으로 짜주시면 됩니다.
#

echo "Enter the two integer : "
read first_integer secound_integer
echo "first_integer : $first_integer, secound_integer : $secound_integer"
touch integer.txt
data="./integer.txt"
echo $first_integer >>${data}
echo $secound_integer >>${data}

first_line=$(cat ./integer.txt | head -n 1)
secound_line=$(cat ./integer.txt | tail -n 1)

first_line_integer=$((first_line))
secound_line_integer=$((secound_line))

echo "first var : $first_line_integer"
echo "secound var : $secound_line_integer"

if [ $first_line_integer -eq 0 ]; then
	echo "0 don't div"
fi

div_buf=$first_line_integer
while [ $div_buf -ge 2 ]; do
	div_buf=$(($div_buf - 2))
done
if [ $div_buf -eq 0 ]; then
	printf_buf=$(($first_line_integer + $secound_line_integer))
else
	printf_buf=$(($first_line_integer - $secound_line_integer))

fi

echo "result : $printf_buf"

rm ./integer.txt
