#include <stdio.h>
#include <stdlib.h>
#define n 5

int summ(int x,int y)
{
    return x+y;
}

void findmax(int array[],int size)

{
    int max=0;
    for(int i=0;i<=size;i++)
    {
        printf("%d value:",i+1);
        scanf("%d",&array[i]);
        if(array[i] > max)
        {
            max = array[i];
        }
    }
    printf("Max value %d", max);
}

int main()
{
    int x,y;
    printf("Enter 2 values: ");
    scanf("%d %d",&x,&y);
    printf("TOTAL: %d\n",summ(x,y));

    int arrayName[n];
    findmax(arrayName,n);

    return 0;
}
