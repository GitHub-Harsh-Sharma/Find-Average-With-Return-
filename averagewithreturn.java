import java.util.Scanner;
class averagewithreturn
{
     public void input() 
    {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter no. a: ");
        int a=sr.nextInt();
        System.out.print("Enter no. b: ");
        int b=sr.nextInt();
        System.out.print("Enter no. c: ");
        int c=sr.nextInt();
        int avg=average(a,b,c);
        System.out.print("The average is:"+avg);
    }
    public int average(int a,int b,int c)  
    {  
        int avg=(a+b+c)/3;
        return(avg);
    }    
    public static void main(String[] args)
    {
     averagewithreturn ar=new averagewithreturn();
     ar.input();   
    }
}