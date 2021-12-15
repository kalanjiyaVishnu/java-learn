package basics;
import java.util.Scanner;


public class Basic {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // get day
        // System.out.print("the day is "+isWhatDay(1));
        // System.out.println(isWhatDayAnother(1));

        // isPositive(0);
        // findRoot(2.3,4,5.6);

        // printing the diagonal elements in the array 
        printDiagonal(3,3);
    }
    public static void printDiagonal(int r, int c){
            int[][] arr = new int[r][c];
            // String input[] = sc.nextLine().split(" ");
            int i= 0,j=0;
            
            for(i=0;i<r;i++){
                for(j=0;j<c;j++)
                    arr[i][j] = sc.nextInt();
                }
            
            for( i=0;i<r;i++){
                for( j=0;j<c;j++){

                    if(i+j == r-1)
                    // for printing the anti diagonal use i+j = n-1
                        System.out.print(arr[i][j]+"\t");
                }
            System.out.println();
        }
    }
    public static void findRoot(double a,double b,double c){
        // -b (+-) root(b*b - 4ac)/2a
        double determinant,root1,root2;  
        determinant= b*b - (4*a*c);

        if(determinant>0){
            root1 = (-b + Math.sqrt(determinant))/2*a;
            root2 = (-b - Math.sqrt(determinant))/2*a;
                System.out.println("root1 is "+root1+" root 2 is "+root2);
        } else if(determinant<0){
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }else {
            root1 = (-b)/2*a;
            System.out.println("root1 is "+root1);
        }
    }
    public static void isPositive(int n){
        if(n>0){
            System.out.println("positive i guess");
        }
        else if(n!=0) System.out.println("negative");
        else System.out.println("The ZERO");
    // System.out.println(n==0 ? n>0 ? "posit":"positve" :"negative");
    }
    public static String isWhatDayAnother(int dayNum){
        String arr[] = {"sun","mon","tue","wed","thur","fri","sat"};
        return arr[dayNum];
    }
    public static String isWhatDay(int dayNum){
        switch(dayNum){
            case 0:
                return "sun";
            case 1:
                return "mon";
            case 2:
                return "tue";            
            case 3:
                return "wed";   
            case 4:
                return "thur";
            case 5:
                return "fri";
            case 6:
                return "sat";
        }
        return "its a new day";
    }
}
