#include <stdio.h>
int main() {
char a[100],b[100];int i,j=0,c=0;
    scanf("%s",a);
    for(i=0;a[i]!='\0';i++)
    {
        if((a[i]>=97&&a[i]<=122 ) || (a[i]>=65&&a[i]<=90))
        c++;
        else if(a[i]=' '){}
        else 
        {
            printf("%d ",c);
            c=0;
            for(;a[i]>='0'&&a[j]<='9';){i++;}
        }
            break;
        }
   
    return 0;
}
