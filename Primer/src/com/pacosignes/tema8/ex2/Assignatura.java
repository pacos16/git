public class Assignatura{
    private String nom;
    private int codi;
    private int curs;

    public Assignatura(String nom, int codi, int curs){
        this.nom=nom;
        this.codi=codi;
        this.curs=curs;
    }
    public void imprimir(){
        System.out.println(nom+" "+codi+" curs: "+curs);
    }
}