import java.util.scanner;
class FloydsTriangle
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows\n");
        int rows=scan.nextInt();
        System.out.println("Floyds triangle Generation\n");
        int count=1;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}