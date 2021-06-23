#include <stdio.h>
#include <stdlib.h>
#define MAX 50

//Bubble Sort

void bubblesort(int array[],int size)
{
    int i,j;
    for(i=0;i<size;i++){
        for(j=1;j<size-i;j++){
            if(array[j-1] > array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1]= temp;
            }
        }
    }
}

int main()
{
    int array[MAX],size;
    printf("how many factor:");
    scanf("%d",&size);
    for(int i=0;i<size;i++){
        scanf("%d",&array[i]);
    }
    printf("\n");
    bubblesort(array,size);
    for(int i=0;i <size;i++){
        printf("%d\n",array[i]);
    }
    return 0;
}
