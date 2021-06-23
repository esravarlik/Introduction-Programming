#include <stdio.h>
#include <stdlib.h>

int Numbers(int a,int b, int c)
{
    int total = a+ b+ c;
    return total;
}

int main()
{
    int total = Numbers(10,20,30);
    int lastTotal = Numbers(total,total,total);
    printf("lastTotal : %d\n",lastTotal);


    int i = 1;
    while(i<=10){
        if(i%2==0){
            printf("Even numbers:");
            printf("%d\n",i);
        }
    i++;
    }

    int number;
    do
    {
        printf("Enter a number: "); scanf("%d",&number);
        printf("%d * 2 = %d(Press the number 5 to exit)\n",number,number*2);

    }while(number !=5);

    int j;
    for (j=0;j <10;j++){
        printf("%d\n",j);
    }

    int array[] = {10,20,30,40};
    int k;
    for(i=0;i<4;i++)
    {
        printf("Number: %d\n",array[i]);
    }

    return 0;
}
