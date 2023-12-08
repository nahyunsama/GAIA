#include <stdio.h>

int main()
{
    float A, B;
    scanf("%d %d", &A, &B);
    printf("%.9f\n", (double) A / B);
    return 0;
}