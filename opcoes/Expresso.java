package opcoes;
//Principio S
Public class Expresso extends Envios{
    super( Encomenda encomenda, local_date data, double precoBase);

    @Override
    public double calcularPreco(){
        if (encomenda getPeso() > 10){
            return ((encomenda getPeso() - 10) * 15) + precoBase;
    }
}
