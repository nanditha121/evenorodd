
    import java.util.Scanner;

    public class m12ain {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int number= scan.nextInt();
            System.out.println(even_odd(number));
        }
        static String even_odd(int number)
        {
            if (number%2==0)
            {
                return "The Number is even";
            }
            else
            {
                return "The Number is odd";
            }
        }
    }
