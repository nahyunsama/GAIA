#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    int rand_array[100];
    srand((unsigned int)time(NULL));
    int tmp;
    int val;
    int j;
    
    for (int i = 0; i < 100; i++) {
        rand_array[i] = rand();
    }
    clock_t start = clock();
    
    for (int i = 1; i < 100; i++) {
        val = rand_array[i];
        for (j = i; j > 0 && rand_array[j-1] > val; j--) {
            rand_array[j] = rand_array[j-1];
        }
        rand_array[j] = val;
    }
    
    clock_t end = clock();
    for (int i = 0; i < 100; i++) {
        printf("%d\n", rand_array[i]);
    }
    printf("WORK TIME : %lf\n", (double)(end - start) / CLOCKS_PER_SEC);
    return 0;
}
