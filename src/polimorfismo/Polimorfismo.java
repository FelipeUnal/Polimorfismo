package polimorfismo;

public class Polimorfismo{

   
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
