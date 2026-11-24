public class Principal{
    public Static void main(){
        Remetente R1 = new Remetente("Carlos","55 991246578");
        Remetente R2 = new Remetente("Bruno","55 991247654");
    
        Encomenda E1 = new Encomenda ("Carro de brinquedo", 10, Carlos);
        Encomenda E2 = new Encomenda ("Tapete", 15, Bruno);
    
    
        E1.registrar(new Economico());
        E2.registrar(new Expresso());
    
        E3.registrar(new Internacional());

}
}









