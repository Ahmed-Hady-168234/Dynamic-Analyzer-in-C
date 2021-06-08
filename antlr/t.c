#include <stdio.h>
#include <math.h>

void print(int x);
struct s{
    int c;
    char y;

};
int main (void)
{
    int x = 0;
    section:

    print(1);
    do{
        printf("%d",1000004);
        break;
    }while(x == 0);
    if(x == 0)
    {
        x++;
        switch(x){
            case 0:
                x+=2;
                x+=2;
                x+=2;
                break;
            case 1:
                x+=3;
                x+=4;
                return 0;
                x+=5;
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    else{
        x = 0;
        goto section;
        for(int i = 0; i < 10; i++){
            printf("in for loop => loop counter = %d", i);
        }
    }
     return 0;
}


void print(int x)
{
    if(x > 15 && x<20)
     printf("in print in if");
    else if(x == 12){
        printf("in print in else if");
    }else
        for(int c = 0; c < 2; c++)
                    x = 443;

            x = 15;
    printf("in print function => x = %d", x);
}