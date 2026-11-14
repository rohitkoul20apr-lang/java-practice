public class MaximumNumber {

    public static void main(String[] args)
    {
         int [] arr={10,20,15,30,40,80,60};
         int max=arr[0];
         int min=arr[0];
         for(int num:arr)
         {
             if(num>max)
             {
                 max=num;

             }
             if(num<min)
             {
                 min=num;
             }
         }
         System.out.println(max);
         System.out.println(min);




    }

}
