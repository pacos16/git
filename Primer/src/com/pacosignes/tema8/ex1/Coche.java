

public class Coche{
    //declaracion de enumerados
    public enum Tipo{MINI,UTILITARI,FAMILIAR,ESPORTIU}
    public enum Segur{TOT_RISC,TERCERS}

    //declaracion de variables de clase
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private Tipo tipo;
    private int anyFabricacio;
    private Segur segur;

    

    

    public Coche(){
        modelo="null";
        color="null";
        metalizada=false;
        tipo=Tipo.UTILITARI;
        segur=Segur.TERCERS;

    }
    public Coche(String modelo, String color, boolean metalizada,String matricula, Tipo tipo,int anyFabricacio, Segur segur){
        this.modelo=modelo;
        this.color=color;
        this.metalizada=metalizada;
        this.matricula=matricula;
        this.tipo=tipo;
        this.anyFabricacio=anyFabricacio;
        this.segur=segur;

    }
    //setters
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setMetalizada(boolean metalizada){
        this.metalizada=metalizada;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public void setTipo(Tipo tipo){
        this.tipo=tipo;
    }
    public void setAnyFabricacio(int anyFabricacio){
        this.anyFabricacio=anyFabricacio;
    }
    public void setSegur(Segur segur){
        this.segur=segur;
    }
    //getters
    public String getModelo(){
        return this.modelo;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getMetalizada(){
        return this.metalizada;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getTipo(){
        return tipo.toString();
    }
    public int getAnyFabricacio(){
        return this.anyFabricacio;
    }
    public String getSegur(){
        return segur.toString();
    }
    //imprime
    public void imprimirCotxe(){
        System.out.println(modelo+" "+color);
    }


}