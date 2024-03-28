# Makefile 예제

# 컴파일러 설정
#CC=gcc
CFLAGS=-Wall -O2

# 타겟과 의존성 정의
example_json_parse: json_parse.o cJSON.o
	$(CC) $(CFLAGS) -o example_json_parse json_parse.o cJSON.o

json_parse.o: json_parse.c
	$(CC) $(CFLAGS) -c json_parse.c

cJSON.o: cJSON.c cJSON.h
	$(CC) $(CFLAGS) -c cJSON.c cJSON.h

# 정리 작업
clean:
	rm -f *.o example_json_parse
