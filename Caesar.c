#include<stdio.h>   
int main()  
{  
    int i, f;  
    char pop[100], c;      
    printf("Enter a message to encrypt \n");  
    gets(pop);  
    printf("Enter the key\n");  
    scanf("%d", &f);  
    for(i = 0; pop[i]!='\0'; i++)  
    {  
        c = pop[i];  
        if(c >= 'a' && c <= 'z')  
        {  
            c = c + f;  
            if(c > 'z')  
            {  
                c = c - 'z' + 'a' - 1;  
            }  
            pop[i] = c;  
        }  
        else if(c >= 'A' && c < 'Z')  
        {  
            c = c + f;  
            if(c > 'Z')  
            {  
                c = c = 'Z' + 'A' - 1;  
            }  
            pop[i] = c;  
        }  
    }  
    printf("Encrypted message: %s\n", pop);  
    return 0;  
}  

/*
Enter a message to encrypt 
I love programming!
Enter the key
10
Encrypted message: S vy�o zbyqbkwwsxq!
*/
