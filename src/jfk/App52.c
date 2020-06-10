#include <stdio.h>
void main() {
        int t = 0;
        int k = 454;
        int miavor = k % 10;
        int tasnavor = (k / 10) % 10;
        int har = k / 100;

        if ( miavor == tasnavor || miavor == har || tasnavor == har) {
            t = 1;
        }

	if(t == 1)
         printf("true\n");
	else
	 printf("false\n");
    
}
