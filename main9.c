#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number=10;
    int *ptr;
    ptr = &number;
    int number2 = *ptr;
    printf("%d\n",number);
    printf("%d\n",&number);
    printf("%p\n",number2);

    char *city = "Osmaniye";
    int i =0;
    while(city[i] !='\0')
    {
        printf("%c - %p\n",*(city+i),(city+i));
        i++;
    }

    return 0;
}
