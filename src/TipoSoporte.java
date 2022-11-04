public abstract class TipoSoporte implements Componente {
    private String name;
    private Componente wrapee;

    public TipoSoporte(Componente c){
        wrapee=c;
    }
    public void play(){
        wrapee.play();
        System.out.println("ON "+getName());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}
