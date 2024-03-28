#include <stdio.h>
#include <stdlib.h>
#include "cJSON.h"
#include <string.h>

#define BUFFER_SIZE 1024
void json_parse(char *json_string)
{
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
        printf("cursor is NULL");
        exit(2);
    }
    servlet = cJSON_GetObjectItem(cursor, "servlet");
    if (servlet == NULL) {
        printf("servlet is NULL");
        exit(3);
    }
    array_size = cJSON_GetArraySize(servlet);
    for (i = 0; i < array_size; i++) {
        cursor = cJSON_GetArrayItem(servlet, i);
        if(cursor == NULL) {
            printf("cursor is NULL");
            exit(4);
        }
        cursor = cJSON_GetObjectItem(cursor, "init-param");
        if (cursor == NULL) {
            printf("cursor is NULL");
            exit(5);
        }
        if (cursor != NULL) {
            cacheTemplatesTrack = cJSON_GetObjectItem(cursor, "cacheTemplatesTrack");
            if (cacheTemplatesTrack != NULL) {
                char *output = cJSON_Print(cacheTemplatesTrack);
                printf("cacheTemplatesTrack : %s\n", output);
                free(output);
                exit(0);
            }
        }
    }
    cJSON_Delete(root);
    cJSON_Delete(cursor);
    cJSON_Delete(servlet);
}
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

    json_parse(json_string);    
    return 0;
}