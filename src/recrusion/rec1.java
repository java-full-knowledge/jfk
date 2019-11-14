package recrusion;

  class rec1 {
     int  x = 1 ;
     int n = 1;

  public void natnumarr(){
      while (x <= 50) {
         if (n<=10) {
             System.out.print(" " + x + " ");
             n++;
         }
         else {
             System.out.println(" " + x + " ");
             n = 0;
         }
      x = x+1;
    natnumarr();
            }
      return ;
}

 }

