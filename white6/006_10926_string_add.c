#include <stdio.h>
#include <string.h>

int main() {
//    char id[54];
//    char mark[4] = "\?\?!";
//    fgets(id, 50, stdin);
//    id[strlen(id)-1] ='\0';
//    strncat(id, mark, 3);
//    printf("%s",id);

    char id[51];
    scanf("%s", id);
    printf("%s\?\?!", id);
    return 0;
}