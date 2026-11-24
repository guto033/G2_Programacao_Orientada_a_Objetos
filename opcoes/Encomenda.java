package opcoes;

Public class Encomenda{
    private String descricao;
    private double peso;
    private Remetente remetente;

    public Encomenda (String descricao, double peso, Remetente remetente){
        if peso <= 0{
            throw new RuntimeException PesoNegativoException("Peso não pode ser negativo");
        }
        this.descricao = descricao;
        this.peso = peso;
        this.remetente = remetente
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPeso(){
        return peso;
    }

    public Remetente getRemetente(){
        return remetente;
    }


}