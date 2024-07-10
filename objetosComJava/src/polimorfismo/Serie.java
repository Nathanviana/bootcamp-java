package polimorfismo;

public class Serie extends Filme{
    private int temporadas;
    private int episodiosPorTemporada;
    private int episodioAtual;
    private int temporadaAtual;

    public Serie(String titulo, int temporadas, int episodiosPorTemporada) {
        super(titulo);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.episodioAtual = 1;
        this.temporadaAtual = 1;
    }


    public void play(int temporada, int episodio) {
        if (validarEpisodio(temporada, episodio)) {
            this.temporadaAtual = temporada;
            this.episodioAtual = episodio;
            System.out.println("play: " + toString());
        } else {
            System.out.println("Episódio inválido!");
        }
    }

    private boolean validarEpisodio(int temporada, int episodio) {
        if (temporada == 0 || episodio == 0)
            return false;

        if (temporada > temporadas || episodio > episodiosPorTemporada)
            return false;

        return true;
    }

    @Override
    public String toString() {
        String info = String.format("Serie %s %dx%02d (audio %s, legenda %s)", getTitulo(), temporadaAtual, episodioAtual ,getAudio(), getLegenda());
        return info;
    }

    // métodos getters e setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getEpisodioAtual() {
        return episodioAtual;
    }

    public void setEpisodioAtual(int episodioAtual) {
        this.episodioAtual = episodioAtual;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }
}
