#include <stdio.h>
#include <stdlib.h>

void main()
{
    int mult = 1;
    int *p;
    int numArray[5];

    printf("Enter 5 elements: ");
    for (int i=0;i<5;i++){
        scanf("%d",&numArray[i]);
    }
    p = numArray;
    for(int i=0;i<5;i++){
        mult = mult * (*p);
        p++;
    }
    printf("The multiply of array elements: %d",mult);
}
