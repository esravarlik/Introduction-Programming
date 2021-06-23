#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>
#include <time.h>

int lengthfrost(char name[])
{
    //strlen
    int lengthh=0;
    int i;

    for(i=0; name[i] != '\0';i++){
        lengthh++;
    }
    return lengthh;
}

void message()
{
    printf("Hello World\n");
}

void dice()
{
    srand(time(NULL));
    int value=1+rand()%6;
    printf("%d\n",value);
}

int main()
{
    char name[] = "Esra";
    printf("%d\n",lengthfrost(name));

    message();
    dice();

    int y = 5;
    int *p = &y;
    printf("%u\n",p);
    printf("%d",*p);

    return 0;
}
