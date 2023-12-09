#include <stdio.h>
#include "cJSON.h"

int main()
{
    FILE *fp = fopen("example.json", "r");
    if (fp == NULL) {
        printf("READ JSON FILE ERROR");
        return 1;
    }

    fclose(fp);
    return 0;
}