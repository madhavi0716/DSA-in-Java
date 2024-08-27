import java.util.Scanner; //fibonacci ,factorial, , 
class fibonacci
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        //int n=sc.nextInt();
       // int n1=sc.nextInt();
        int a=0;
        int b=1;
         
       /*  System.out.print(a+" "+b+" ");
         for(int i=3;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c; 
        }
        System.out.println("    Factorial");
        for(int j=1;j<=n1;j++)
        {
            if(n1%j==0)
            {
                System.out.print(j+" ");
            }
        }
        System.out.println("Input multiple numbers");
        int n2=sc.nextInt();
        int sum=0;
        while(n2>=0)
        {
            if(n2>0)
            {

            sum=sum+n2;
            System.out.println(sum);
        }

        else if(n2==0)
        {
            break;
        }
    }*/

   /*  int n3=sc.nextInt();
    int sum1=0;
    int prod=1;
    {
       
   while(n3>10)
        {

            sum1= sum1 + (n3%10);
            prod= prod * (n3%10);
            n3=n3/10;
        }
        sum1=sum1+n3;
        prod=prod*n3;
        System.out.println(sum1+prod);
    }*/
   
    int sum=0;
    int n=0; int max=0; int min=0;
    while(true)
    {
        int n4=sc.nextInt();
        sum=sum+n4;
        if(n>n4)
        {
            max=n4;
            n=n4;
        }
        else if(n<n4)
        {
            min=n4;
            n=n4;
        }
       else if(n4==0){
        break;}
        
    }
    System.out.println(sum);
   System.out.println(max);

    



    


        

    }
}