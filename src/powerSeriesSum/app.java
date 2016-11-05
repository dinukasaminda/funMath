/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerSeriesSum;

/**
 *
 * @author Dinuka S Bandara
 */
public class app {
    public static void main(String[] args) {
        double sum=0;
        int n=20;
        double x=4.4;
        for(int i=0;i<n;i++){
            double an=an(x, i);
            sum+=an;
            System.out.println("an:"+an);
            System.out.println("sum of "+i+" terms: "+sum);
        }
    }
    public static double an(double x,double n){

        return (Math.pow(x-4, n+1)/(n+1));
        
    }
}
