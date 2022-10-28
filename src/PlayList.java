import java.util.LinkedList;

public class PlayList implements Componente{
    private String name;
    private LinkedList<Componente> children= new LinkedList<>();

    public PlayList(String name) {
        this.name = name;
    }

    public void play() {
        for (Componente c:children){
            System.out.println("-----"+name+"-----");
            c.play();
        }
    }

    public void add(Componente c){
        children.add(c);
    }

    public String getName() {
        return name;
    }
    public LinkedList<Componente> getChildren(){
        return children;
    }
}
