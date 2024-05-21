#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    clock_t start = clock();
    
    int rand_array[100];
    srand((unsigned int)time(NULL));
    int tmp;
    int min;

    for (int i = 0; i < 100; i++) {
        rand_array[i] = rand();
    }
    
    for (int i = 0; i < 99; i++) {
        min = i;
        for (int j = i+1; j < 100; j++) {
             if (rand_array[min] > rand_array[j])
             {
                  min = j;
             }
             tmp = rand_array[i];
             rand_array[i] = rand_array[min];
             rand_array[min] = tmp;
        }
    }

    
    for (int i = 0; i < 100; i++) {
        printf("%d\n", rand_array[i]);
    }
    
    clock_t end = clock();

    printf("WORK TIME: %lf\n", (double)(end - start) / CLOCKS_PER_SEC); 
    return 0;
}
