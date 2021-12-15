package basics;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
//        leap year
//    int year = sc.nextInt();
//    if(year%4 == 0 || year%400 == 0){
//        System.out.println("a leap year");
//    }
//    else System.out.println("Not a leap year");
//    int res = year % 4 == 0 ? year% 400 == 0 ? 1:0 : 0;
//    if(res == 1) System.out.printl/n(year + "is a leap year");
//    else System.out.println(year + "is not a leap year");

//        printSeq((byte) 10);
// 1.print the sum of the integer 2.get string array and convert into the integer and get the max element
//        printSumForInput();

        boolean res = isTri();
        if(res)
            System.out.println("it is a triangle");
        else System.out.println("it is not a trtiangle");

    }
    public static boolean isTri(){
        String arr[] = sc.nextLine().split(" ");
        int sum = 0;
        if(arr.length<3){
            for (String i :
                    arr) {
                int eachNum = Integer.parseInt(i);
                if (eachNum > 0 && sum <= 180) {
                    sum += eachNum;
                } else return false;
            }
        }
        if(sum == 180)
            return true;

        return false;
    }
    public static void printSeq(byte n)
    {
        System.out.println("first 10 natural number are");
        for(int i=1;i<n;i++){

            System.out.print(i+" ");
        }

    }
    public static void printSumForInput(){
//        int count = sc.nextInt(), sum = 0;
//        for(int i=1;i<=count;i++){
//            sum+=i;
//        }
//        System.out.printf("sum of %d natural number %d",count,sum);
        String[] s = sc.nextLine().split(" ");
        System.out.println(Arrays.toString(s) + "type is "+ s.getClass());
        int arr[] = new int[s.length];
        for(int i=0;i<s.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(Arrays.toString(arr) + "type is " + arr.getClass());
        int max = 0;
        for (int i:arr) {
            if(i>=max)
                max = i;
        }
        System.out.println(max +"is the greatest element in the array "+Arrays.toString(arr));
    }
}
