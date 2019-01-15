public class Ex1 {
   
    
    public static void execute(){
        Coche c1=new Coche("Fiat","Rojo",true,"0512FL", Coche.Tipo.UTILITARI, 2010 , Coche.Segur.TOT_RISC);
        Coche c2=new Coche();

        c1.imprimirCotxe();
        c2.imprimirCotxe();
    }
}