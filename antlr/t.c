#include <stdio.h>
#include <math.h>

int main (void)
{
    int x=0;
    printf(1004);
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
                x+=5;
                break;
            case 2:
                break;
            default:
                break;
        }
    }
    else{
        for(int i = 0; i < 10; i++){
            printf("in for loop => loop counter = %d", i);
        }
    }
    return 0;
}

void print(int x){
    if(x == 10){
        printf("in print in if");
    }else if(x == 12){
        printf("in print in else if");
    }else
        for(int c = 0; c < 2; c++)
            x = 15;
    printf("in print function => x = %d", x);
}