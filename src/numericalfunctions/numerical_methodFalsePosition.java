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
public class numerical_methodFalsePosition {

    public static void main(String[] args) {
        // System.out.println(""+function(0));\
        double p=0;
        //System.out.println(""+function(0));
        //System.out.println(""+function(1));
        //System.out.println(function(p));
        for(int i=0;i<650;i++){
            p=function(i);
            System.out.println("i:"+i+"xp"+p);
        }
        
        System.exit(0);
        //System.out.println(""+chooping(1.090111, 3));
        double v1=1;
        double v2=2;
        System.out.println("v1:"+fppp(v1));
        System.out.println("v2:"+fppp(v2));
        for(int i=1;i<10;i++){
            v1=fpfunction(v1,v2);
            System.out.println("i,v1:"+i+","+v1+",      f="+fppp(v1));
            
        }
        
        System.exit(0);
      
        for(int i=1;i<8;i++){
            p=function2(p);
            System.out.println("i:"+i+","+p);
        }
        System.exit(0);
        double intv1 = -1.1;
        double intv2 = -0.5;
        for (int i = 0; i < 12; i++) {
            double f1 = function(intv1);
            double f2 = function(intv2);

            System.out.println("intv1:" + intv1 + ", f(x):" + f1);
            System.out.println("intv2:" + intv2 + ", f(x):" + f2);

            double xp = intv1 - f1 * (intv2 - intv1) / (f2 - f1);
            System.out.println("xp:" + xp);
            intv1=xp;
        }
    }

    public static double function(double x) {

        
        //return ((x * x * x) - (2 * x) - (5));
        //return ((x * x * x)+(x*x) - (3 * x) - (3));
        
        //return (1-((x*x*x)/(x+1)));
        //return ((x/2)+(1/x));
        //return function2(x);
       // return (1/(Math.pow(1.0d/(x+1.0d), 0.5)));
        return (Math.pow(-1, x)*((x*x*x)/Math.pow(3, x)));
    }
    public static double function2(double i){
        //return 5/((2*i*i)+4*i+3);
        //return (1/(Math.pow((i*i)+i+1, 0.5)));
       // return (1+Math.pow(2, i))/(2+Math.pow(3, i));
        //return (i*i*i)/((i*i)+Math.pow(i, 7)+1);
     // return (Math.sin(i))/(i*i);
       // return (Math.pow((i+1)*(i-1), 1/3));
        return i-((Math.exp(i)-(4*i))/(Math.exp(i)-4));
    }
    public static double fpfunction(double v1, double v2){
        
        double p = v1- ((fppp(v1)*(v2-v1))/(fppp(v2)-fppp(v1)));
        
        return p;
    }
    public static double fppp(double x){ return ((x*x*x)+(x*x)-3*x-3);}
    public static double chooping(double x,int d){
        String s1=""+x;
        if(s1.length()>d+1+1){
            return Double.valueOf(s1.substring(0,d+1+1));
        }
        return x;
    }
}
