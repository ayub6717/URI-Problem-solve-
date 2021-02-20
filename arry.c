#include<stdio.h>
int main()
{
    int i,j,check;

    for(i=1; i<=100; i++)
    {
        check=0;
        if(i==1) {
            printf("Not prime\n");
            continue;
        }
        if(i==2) {
            printf("prime\n");
            continue;
        }
        for(j=2; j<=i-1; j++)
        {
            if(i%j==0)
            {
                check = 1;
                break;
            }
        }
        if(check==1)
        {
            printf("not prime %d\n",i);

        }

        else
        {
            printf("prime %d\n",i);
        }

    }
    return 0;
}


