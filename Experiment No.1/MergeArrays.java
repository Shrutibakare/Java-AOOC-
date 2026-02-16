import java.util.Scanner;
 class main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n1,n2;
         System.out.println("Enter size of arr1");
         n1 = sc.nextInt();
         System.out.println("Enter size of arr2");
         n2 = sc.nextInt();
         
         int a[] = new int[n1];
         int b[] = new int[n2];
         int c[] = new int[n1+n2];
         
         System.out.println("Enter elements in 1st array:");
         for(int i =0; i< n1;i++){
             a[i] =sc.nextInt();
         }
         
          System.out.println("Enter elements in 2nd array:");
         for(int i =0; i< n2;i++){
             b[i] =sc.nextInt();
         }
         for(int i =0;i<n1;i++){
             c[i] = a[i];
         }
         for(int i =0;i<n2;i++){
             c[n1+i] = b[i];
         }
          System.out.println("Merged Array:");
        for(int i = 0; i < n1 + n2; i++)
            System.out.print(c[i] + " ");

        sc.close();
     }
     
 }
