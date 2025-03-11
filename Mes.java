public enum Mes {
    //Construção
    JANEIRO(1, "jan", "janeiro"),
    FEVEREIRO(2, "fev", "fevereiro"),
    MARÇO(3, "mar", "março"),
    ABRIL(4, "abr", "abril"),
    MAIO(5, "mai", "maio"),
    JUNHO(6, "jun", "junho"),
    JULHO(7, "jul", "julho"),
    AGOSTO(8, "ago", "agosto"),
    SETEMBRO(9, "set", "setembro"),
    OUTUBRO(10, "out", "outubro"),
    NOVEMBRO(11, "nov", "novembro"),
    DEZEMBRO(12, "dez", "dezembro");

    
    //Atributos
    private int numMes;
    private String siglaMes;
    private String descricaoMes;

    //Métodos get

    public int getNumMes(){
        return this.numMes;
    }

    public String getSiglaMes(){
        return this.siglaMes;
    }

    public String getDescricaoMes(){
        return this.descricaoMes;
    }

    //Método construtor

    Mes(int numMes, String siglaMes, String descricaoMes){
        this.numMes = numMes;
        this.siglaMes = siglaMes;
        this.descricaoMes = descricaoMes;
    }

}
