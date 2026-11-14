public class Practice4 {

    public static void main(String[] args)
    {

        String name="My name is Rohit Koul";

        //char[] ch=name.toCharArray();

        String [] ch=name.split(" ");

        for(int i=0; i<ch.length;i++)
        {
            String s =ch[i];

            for(int j=s.length()-1;j>=0;j--)
            {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }



    }

}
