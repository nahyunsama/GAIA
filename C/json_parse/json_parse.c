#include <stdio.h>
#include <stdlib.h>
#include "cJSON.h"
#include <string.h>

#define BUFFER_SIZE 1024

int main()
{
    FILE *fp = fopen("example.json", "r");
    if (fp == NULL) {
        printf("READ JSON FILE ERROR");
        return EXIT_FAILURE;
    }
    
    char *json_string = NULL;
    size_t json_size = 0;

    char buffer[BUFFER_SIZE];
    while (fgets(buffer, BUFFER_SIZE, fp)) {
        
        //printf("%s", buffer);
        json_size += (BUFFER_SIZE * sizeof(char));

        if (json_string == NULL) {   
            json_string = malloc(json_size);
            *json_string = 0;
            
            if (json_string == NULL) {
                
                puts("json_string NOT ALLOCATED");
                return EXIT_FAILURE;
            }
        }
        else {
            char *realloc_json_string = realloc(json_string, json_size);
            if (realloc_json_string == NULL) {
                puts("realloc_json_string NOT ALLOCATED");
                free(json_string);
                return EXIT_FAILURE;
            }
            json_string = realloc_json_string;
        }
        strncat(json_string, buffer, BUFFER_SIZE);
    } 
    fclose(fp);
    printf("%s", json_string);
    return 0;
}