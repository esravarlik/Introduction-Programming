#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
   /*Commend */
    printf("Hello world!\n");
    printf("Hello World!\n");

    int number = 25;
    printf("%d\n",number);

    char name1[10] = "Esra\n";
    printf("%s",name1);

    char name[10];
    printf("Name:");
    scanf("%s",&name);
    printf("Hello %s!\n",name);

    int number1=1,number2 =2,summation;
    summation = number1 + number2;
    printf("Summation: %d\n",summation);

    float PI = 3.14;
    int r = 4;
    float area;
    area = PI*r*r;
    printf("Area: %f\n",area);

    int a1= 42;
    char b1= 66;
    char b2 = 'B';
    float c1 = 4.2;
    double d1 = 0.21;
    printf("%d %c %d %.1f %.2f\n",a1,b1,b2,c1,d1);

    printf("%d byte\n",sizeof(char));
    printf("%d byte\n",sizeof(int));
    printf("%d byte\n",sizeof(short int));
    printf("%d byte\n",sizeof(long int));
    printf("%d byte\n",sizeof(float));
    printf("%d byte\n",sizeof(double));


    int x =5;
    int y=6;
    int abs(x); //absolute
    double fabs(x); //float absolute
    double sqrt(x); //square
    double pow(x,y); //xy
    double log(x); //n logarithm
    double log10(x); // log10

    int note;
    printf("Enter your note:");
    scanf("%d",&note);

    if (note >60)
    {
        printf("Successful");
    }
    else
    {
        printf("Unsuccessful");
    }
    return 0;
}
