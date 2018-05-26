import java.util.Scanner;

import java.util.Scanner;
public class arraymax {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       // int[] a={5,3,6,8,2,7};
        int N;
        N=sc.nextInt();

       int[] a=new int[N];
       for (int i=0; i< a.length;i++)
        a[i]=sc.nextInt();

        int[] b=new int [N-1];
        for (int i=0;i<b.length;i++){
            b[i]=a[i]*a[i+1];
            System.out.println(b[i]);
        }
        // println("max="+max(b),"min="+min(b));

        int maxvalue=-1000;

        for ( int i=0; i<b.length;i++)
            if (b[i]> maxvalue)
                maxvalue=b[i];

        System.out.println("max="+ maxvalue);

    }
}
