#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE *f;
    f = fopen("themultiplicationtable.txt","w");
    int i,j;
    for(i=1;i<11;i++)
    {
        for(j=1;j<11;j++)
        {
          printf(f,"%d * %d = %d\n",i,j,i*j);
        }
            printf("\n");
        }
    fclose(f);

    return 0;
}
