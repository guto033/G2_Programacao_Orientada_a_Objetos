package opcoes;
import local_date;
import exception.PrecoBaseInvalidoException;

Public class Envios(){                                  
    Encomenda encomenda;
    local_date data;
    private double precoBase;
    //Principio L

    public Envios (Encomenda encomenda, local_date data, double precoBase){
        if Encomenda == null {
            throw new RuntimeException EnvioSemEncomendaException("Precisa haver uma encomenda");
        }
        else if precoBase <=0{
            throw new RuntimeException PrecoBaseInvalidoException("Preço ou peso negativos");
        }
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
    }

    public registrar(){
       Central.registrar(Envio envio); 
    }

}