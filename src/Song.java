public class Song implements Componente{
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public void play(){
        System.out.println("Escuchando..."+name+" BY "+artist);
    }
}
