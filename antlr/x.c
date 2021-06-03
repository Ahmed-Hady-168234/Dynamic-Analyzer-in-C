int flag[46];
#include <stdio.h>
#include <math.h>

int main (void)
{flag[5] = 1;
    int x=0;flag[6] = 1;
    printf(1004),flag[7] = 1;
    if(x == 0)
    {flag[9] = 1;
        x++,flag[10] = 1;
        switch(x){flag[11] = 1;
            case 0:
                x+=2,flag[13] = 1;
                x+=2,flag[14] = 1;
                x+=2,flag[15] = 1;
flag[16] = 1;                break;
            case 1:
                x+=3,flag[18] = 1;
                x+=4,flag[19] = 1;
                x+=5,flag[20] = 1;
flag[21] = 1;                break;
            case 2:
flag[23] = 1;                break;
            default:
flag[25] = 1;                break;
        }
    }
    else{flag[28] = 1;
        for(int i = 0; i < 10; i++){
            printf("in for loop => loop counter = %d", i);
        }
    }
flag[33] = 1;    return 0;
}

void print(int x){flag[36] = 1;
    if(x == 10){flag[37] = 1;
        printf("in print in if"),flag[38] = 1;
    }else if(x == 12){flag[39] = 1;
        printf("in print in else if"),flag[40] = 1;
    }else
        for(int c = 0; c < 2; c++)
            x = 15,flag[43] = 1;
    printf("in print function => x = %d", x),flag[44] = 1;
}
