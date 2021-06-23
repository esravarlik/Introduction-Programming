#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int random_int(int min, int max)
{
return min + rand() % (max+1 - min);
}

int main() {
	int array[100];
	int i,sum=0;
	int choice;
	int N;
	 printf("How to create the array.\n");
     printf("Random numbers.	          :1\n");
     printf("To be entered manually.   :2\n");
     printf("Please make your choice: ");
     scanf("%d",&choice);
     printf("Enter the number of elements:");
     scanf("%d",&N);

	if (choice == 2){
	for(i=0;i<N;i++)
     {
        scanf("%d",&array[i]);
        sum += array[i];
     }

	float mean=(float)sum/N;
	printf("Mean:%.2f\n",mean);
	int t=0;
	for(i=0;i<N;i++) {
		t+=pow(array[i]-mean,2);
	}
	float standard_dev=sqrt((float)t/(N-1));
	printf("Standard Deviation: %f\n",standard_dev);
	}

	else if (choice == 1)
	{
	    int max_number,minimum_number = 0;
	    printf("Min and Max: ");
	    scanf("%d",& minimum_number);
	    scanf("%d",& max_number);

	    int  array[100];
        for (int i=0;i<N;i++)
        {
            array[i]= random_int(minimum_number,max_number);
            sum += array[i];
        }
        	for(int i=0;i<N;i++)
        {
            printf("%d  ",array[i]);
        }

        float mean=(float)sum/N;
        printf("Mean: %.2f\n",mean);

        int t=0;
        for(i=0;i<N;i++) {
            t+=pow(array[i]-mean,2);
        }
        float standard_dev=sqrt((float)t/(N-1));
        printf("Standard Deviation: %f\n",standard_dev);

	}

    else {
        printf("You must choose one of the two options.!");
      }

return 0;
}
