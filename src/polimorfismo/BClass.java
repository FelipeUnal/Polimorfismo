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
public class BClass extends AClass {
    
    public BClass(){
        System.out.println("Constructor de B");
    }
    
    @Override
    public void f(int a){
        System.out.println("En B " + a);
    }
}
