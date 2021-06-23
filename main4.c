#include <stdio.h>
#include <stdlib.h>
int summ(int number1, int number2){
    return(number1+number2);
}

int main()
{
    int number1;
    int number2;
    printf("Number1:");
    scanf("%d",&number1);
    printf("Number2:");
    scanf("%d",&number2);
    printf("%d\n",summ(number1,number2));

    char name[] = "Ali";
    char *p = name;

    printf("%c\n",p[0]);
    printf("%c\n",p[1]);
    printf("%c\n",p[2]);

    int matrix[4][4];
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++){
            printf("Enter your a number: ");scanf("%d",&matrix[i][j]);
        }
    }
    printf("\n");
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<4;j++)
        {
            printf("%d ",matrix[i][j]);
        }
        printf("\n");
        }

    return 0;
}
