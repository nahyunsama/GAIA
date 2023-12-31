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
    printf("------------\n");

    cJSON *cursor = NULL;
    cJSON *servlet = NULL;
    cJSON *cacheTemplatesTrack = NULL;
    cJSON *root = cJSON_Parse(json_string);
    int i;
    int array_size;
    if (root == NULL) {
        printf("JSON PARSE FAIL");
        exit(1);
    }
    
    cursor = cJSON_GetObjectItem(root, "web-app");
    if (cursor == NULL) {
        printf("CURSOR is NULL");
        exit(1);
    }
    servlet = cJSON_GetObjectItem(cursor, "servlet"); //NULL CHECK
    if (servlet == NULL) {
        printf("servlet is NULL");
        exit(1);
    }
    // servlet typecheck
    array_size = cJSON_GetArraySize(servlet);
    for (i = 0; i < array_size; i++) {
        cursor = cJSON_GetArrayItem(servlet, i); // NULL CHECK
        //if(cursor == NULL)
        cursor = cJSON_GetObjectItem(cursor, "init-param"); //NULL CHECK
        //if (cursor == NULL)
        if (cursor != NULL) {
            cacheTemplatesTrack = cJSON_GetObjectItem(cursor, "cacheTemplatesTrack");
            if (cacheTemplatesTrack != NULL) {
                char *output = cJSON_Print(cacheTemplatesTrack);
                printf("cacheTemplatesTrack : %s\n", output);
                free(output);
            }
        }
    }
    //cJSON_Delete()
    
    return 0;
}