#include <stdio.h>
#include <stdlib.h>

typedef struct {
  int age;
  char *name;
} Student;

int main() {
  Student *pointer = malloc(sizeof(Student));

  pointer->age = 25;
  (*pointer).name = "hamnahyun";

  printf("name: %s \n", pointer->name);
  printf("age : %d \n", (*pointer).age);

  free(pointer);
  return 0;
}
