/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class DClass extends CClass{
    
    public DClass(){
        System.out.println("Contructor de D");
    }
    
    @Override
    public void f(int d){
        System.out.println("En D "+ d);
        super.f(d);
    }
}
