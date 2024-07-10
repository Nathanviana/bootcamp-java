package polimorfismo;

public class Video {

    public Video(String titulo) {
        this.titulo = titulo;
    }

    private String titulo;

    public void play(){
        System.out.println("Play: aleatorio");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
