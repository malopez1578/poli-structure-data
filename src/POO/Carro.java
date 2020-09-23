package POO;

public class Carro {
    // ----------------------
    //-Atributos de la clase-
    //-----------------------
    private String marca;
    private  String placa;

    //-----------------------
    //-Constructor-
    //-----------------------
    public Carro (String cmarca, String cplaca){
        marca = cmarca;
        placa = cplaca;
    }

    //----------------------
    //-Analizadores-
    //-----------------------
    public String capturarMarca(){
        return marca;
    }
    public String capturarPlaca(){
        return placa;
    }

    //---------------------
    // -Modificador-
    //---------------------
    public void modificarPlaca(String cnuevaPlaca){
        placa = cnuevaPlaca;
    }

}
