public class Central{
    private ArrayList <Envios> envios = new ArrayList<Envio>();

    public void registrar(Envio envio) {
        if (envio != null) {
            envios.add(envio);
        }
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }
   
}