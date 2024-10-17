public class Web {
    String url;
    String titulo;

    public Web(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", URL: " + url;
    }
}
