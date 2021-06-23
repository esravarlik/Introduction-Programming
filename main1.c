#include <stdio.h>
#include <stdlib.h>

int main()
{
    int selec;
    printf("Enter a number from 1 to 5:"); scanf("%d",&selec);

    switch(selec)
    {
        case 1: printf("Your number 1\n");break;
        case 2: printf("Your number 2\n");break;
        case 3: printf("Your number 3\n");break;
        case 4: printf("Your number 4\n");break;
        case 5: printf("Your number 5\n");break;
        default : printf("Please enter a number in the range of 1 to 5."); break;
    }


    int i=0;
    while(i < 10){
        printf("%d\n", i);
        i++;
    }

    int n;
    int fact=1;
    printf("Number:");
    scanf("%d",&n);

    while(n != 0){
        printf("%d\n",n);
        fact = fact*n;
        n--;
    }
    printf("Fact: %d\n",fact);

    int j=1;
    while(j<=10){
        printf("1 x %d = %d\t",j,j*1);
        printf("2 x %d = %d\t",j,j*2);
        printf("3 x %d = %d\n",j,j*3);
        j++;
    }

    return 0;
}
