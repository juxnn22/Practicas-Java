public enum Ins {
    GUITARRA(" Guitarra "),
    BAJO(" Bajo "),
    ARPA(" Arpa "),
    BATERIA(" Bateria "),
    PIANO(" Piano ");

    private final String instrumento;

    Ins(String ins) {
        this.instrumento = ins;
    }

    public String getInstrumento() {
        return this.instrumento;
    }
}
