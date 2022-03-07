package java_hm_week5;

public class program5triangle {
    public static void main(String[] args)
        {
          int i,j,k,num=6;
          for (i=0;i<num;i++) {
              for (j = i; j < num; j++)
                  System.out.print(" ");
              for (k = 0; k < (i + 1); k++)
                  System.out.print(" *");
              System.out.println("\n");
          }

        }




    }
