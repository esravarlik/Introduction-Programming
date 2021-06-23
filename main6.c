#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    char name[]="Esra";
    int length_ = strlen(name);
    printf("Number of characters in the name %s: %d\n",name,length_);

    printf("%d",strlen(name));
    printf("%d",strlen("Esra\n"));

    char name1[10];
    printf("Enter the word you want to know the length of:");
    scanf("%s",name1);
    printf("%d\n",strlen(name1));

    char city[]="Istanbul";
    for (int i=0;i<strlen(city);i++)
    {
        printf("%c\n",city[i]);
    }

    char name2[] ="Ankara";
    for(int s=strlen(name2);s>=0;s--)
    {
        printf("%c\n",name2[s]);
    }

    char message[10];
    printf("Hello %s",strcpy(message,"Esra\n"));

    char message1[] = "Hello ",message2[]="World\n";
    printf("%s",strcat(message1,message2));

    char string1[] ="Esra";
    char string2[] ="Esra";
    if(strcmp(string1,string2)==0)
    {
        printf("Congrats\n %s",string1);
    }
    else
    {
        printf("Different\n");
    }


    char user[]="root",password[]="toor",user_name[10],pass[10];
    printf("Enter your user name: "); scanf("%s",&user_name);
    printf("Enter your password"); scanf("%s",&pass);

    if(strcmp(user,user_name)==0 && strcmp(password,pass)==0)
    {
        printf("Hello %s login successful\n",user_name);
    }
    else
    {
        printf("user name or password is incorrect\n");
    }

    return 0;
}
