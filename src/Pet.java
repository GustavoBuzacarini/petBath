public class Pet {
    private String nome;

    private boolean clean;

    public boolean isClean(){
        return clean;
    }

    public Pet( String nome) {
        this.nome = nome;
        this.clean = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome) { this.nome = nome; }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
