/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalfunctions;

/**
 *
 * @author Dinuka S Bandara
 */
public class NumericalFunctionsFixedPointIteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ;
        double a1=3.8;
        
        
        for(int n=1;n<20;n++){
            //double xnn = 1+1/xn;
            //System.out.println(""+a1);
            double xnn = function(a1);
            
            a1=xnn;
            System.out.println("n:"+n+", x:"+xnn);
           // xn=xnn;
        }
    }
    static double function(double x){
        double rt=0;
        //rt = x-(((x*x*x)+(x*x)-1)/((3*x*x)+2*x));
        //rt = (1*x/2)+1/x; 
        rt = (7+Math.log10(x))/2;
        //rt= Math.pow(1-x*x*x,0.5);
        return  rt;
    }
}
