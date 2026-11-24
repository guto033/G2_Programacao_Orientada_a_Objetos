package opcoes;
//Principio S
Public class Internacional extends Envios{
    super( Encomenda encomenda, local_date data, double precoBase;);

    @Override
    public double CalcularPreco(){
        return getPrecoBase() * 2,5;
    }
}