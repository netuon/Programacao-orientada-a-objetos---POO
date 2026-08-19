public enum Nivel {
    JUNIOR(1.0),
    PLENO(1.3),
    SENIOR(1.7);

    private final double multiplicador;

    Nivel(Double multiplicador){
        this.multiplicador = multiplicador;
    }

    public Double getMultiplicador(){
        return multiplicador;
    }
}
