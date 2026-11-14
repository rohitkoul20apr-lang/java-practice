public class DuplicateArray {

    public static void main(String[] args)
    {
        int [] arr={9,20,10,32,40,60,80,60,100};
        {
            for(int i=0;i<arr.length;i++)
            {
                for (int j =i + 1; j < arr.length; j++) {

                    if(arr[i]==arr[j])
                     {
                        System.out.println(arr[i]);

                     }

                }
            }

    }

}



}