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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AClass a =  new AClass();
        a.f(6);
        
        AClass b = new BClass();
        b.f(7);
        
        AClass c = new CClass();
        c.f(10);
        
        AClass d = new DClass();
        d.f(11);
        
    }
    
}
