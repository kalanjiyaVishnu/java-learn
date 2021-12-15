package basics.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

// printing the diagonal and anti diagonal of the array
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {        
        // transpose();
        // addition();
        // mul();
        // rowSum();
        boolean res = isRowSumSame();
        System.out.println(res);
    }
    public static void rowSum(){
        System.out.println("enter the size");
        int n = sc.nextInt();

        int[] res = new int[n];
        

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<n;j++){
                sum += sc.nextInt();
            }
            res[i] = sum;   
        }
        System.out.println(Arrays.toString(res));
    }
    public static boolean isRowSumSame(){
        System.out.println("enter the size");
        int r,c,i,prevSum = 0,sum = 0;
        r = sc.nextInt();
        c = sc.nextInt();

        int[] res = new int[c];
        
        for(i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum += sc.nextInt();
            }
            if(res[i-1] == sum && i!=0){
                return false;
            }
            res[i] = sum;

        }
        System.out.println(Arrays.toString(res));
        return true;
    }
    public static void mul(){
        System.out.print("enter the first matric row and co");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.print("enter the second matric row and co");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if(c1 == r2){
           System.out.println("multiplication is "); 
           int[][] a  = new int[r1][c1];
        int[][] b  = new int[r2][c2];
        System.out.println("enter the first matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
        System.out.println("enter the second matrix");

            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++)
                    {
                        b[i][j] = sc.nextInt();
                    }
                }
        System.out.println("mutiplication is");
        System.out.println(Arrays.deepToString(a) + " * " + Arrays.deepToString(b) );
        int[][] res  = new int[r1][c2];
        
        for(int i=0;i<r1;i++){
            {
                for(int j=0;j<c2;j++)
                {
                    int sum = 0;
                    for(int k=0;k<c1;k++)
                    {
                     sum += a[i][k]*b[k][j];
                    }
                    res[i][j] = sum;
            }
            }
        }
        System.out.println(Arrays.deepToString(res));

        }else System.out.println("no multiplication can be performed on that basis");
    }
    public static void addition(){
        int n = sc.nextInt();
        int[][] a  = new int[n][n];
        int[][] b  = new int[n][n];
        System.out.println("enter the first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
        System.out.println("enter the second matrix");

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                    {
                        b[i][j] = sc.nextInt();
                    }
                }
        System.out.println("addition is");
        int[][] res  = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                {
                    res[i][j] = a[i][j]+b[i][j];
                }
            }

        System.out.println(Arrays.deepToString(res));
    }
    public static void transpose(){
        int n = sc.nextInt();
        int[][] arr  = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
        System.out.println("transposing the matrixt\n"+Arrays.deepToString(arr));
        int[][] arr1  = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr1[i][j] = arr[j][i];

        System.out.println("transposing the matrixt\n"+Arrays.deepToString(arr1));
        
    }
}
