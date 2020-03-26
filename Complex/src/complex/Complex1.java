/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

/**
 *
 * @author Musab
 */
public class Complex1 {
    double real;
    double imajinal;
    public void setReal(double real)
    {
        this.real = real;
    }
    public double getReal()
    {
        return real;
    }
    public Complex1()
    {
           
    }
    
    public Complex1(double real, double imajinal)
    {
        this.real = real;
        this.imajinal = imajinal;
    }
    public double getNorm()
        {
            double norm;
            return Math.hypot(real, imajinal);
     
        }
    public void add(Complex1 obj)
    {
        real += obj.real;
        imajinal += obj.imajinal;
        
    }
    public static Complex1 sum(Complex1 a, Complex1 b)
    {
        Complex1 obj = new Complex1();
        obj.real = a.real + b.imajinal;
        obj.imajinal = a.real + b.imajinal;
         return obj;      
    }
}