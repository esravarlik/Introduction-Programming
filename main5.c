#include <stdio.h>
#include <stdlib.h>

int main()
{

    char name[3][10] = {"Tugce","Volkan","Serkan"};
    printf("%s\n",name[0]);

    char city[5][20];
    for(int i=0;i<5;i++)
    {
            printf("%d city:",i+1);scanf("%s",city[i]);
    }
    printf("\nCity\n");

    for(int i=0;i<5;i++)
    {
        printf("%d city: %s\n",i+1,city[i]);
    }

    int array[]={45,78,14,5,9,99},k,m,temp;

    for(k=0;k<6;k++)
    {
        for(m=0;m<6;m++)
        {
            if(array[m]>array[m+1])
            {
                temp = array[m];
                array[m]= array[m+1];
                array[m+1]=temp;
            }
        }
    }
    for(k=0;k<6;k++)
    {
        printf("%d\n",array[k]);
    }

    return 0;
}
