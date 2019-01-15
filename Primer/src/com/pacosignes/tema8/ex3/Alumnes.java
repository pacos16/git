public class Alumnes{
    public enum Grup{ DAM_1, DAM_2, SMX_1, SMX_2}
    private int nia;
    private String nom;
    private String cognom;
    private String dataNaiximent;
    private Grup grup;
    private int telefon;
    private boolean alta;

    /*
    public Alumnes( int nia, String nom, String cognom, String dataNaiximent, Grup grup, int telefon){
        this.nia=nia;
        this.nom=nom;
        this.cognom=cognom;
        this.dataNaiximent=dataNaiximent;
        this.grup=grup;
        this.telefon=telefon;
    }
    */
    public Alumnes(){
        alta=false;

    }
    //setters
    

    //getters
    public int getNia(){
        return nia;
    }
    public String getNom(){
        return nom;
    }
    public String getCognom(){
        return cognom;
    }
    public String getDataNaiximent(){
        return dataNaiximent;
    }
    public String getGrup(){
        return grup.toString();
    }
    public int getTelefon(){
        return telefon;
    }
    public boolean getAlta(){
        return alta;
    }
    public void imprimeAlumno(){
        if(alta==true){
            System.out.println(nia+" "+nom+" "+cognom+" "+dataNaiximent+" "+grup.toString()+" "+telefon);
        }
    }

}