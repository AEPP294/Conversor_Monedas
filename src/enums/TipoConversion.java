package enums;

public enum TipoConversion {
    COP_PARA_DOLAR("De COP a Dólar"),
    COP_PARA_EURO("De COP a Euro"),
    COP_PARA_LIBRA_ESTERLINA("De COP a Libra Esterlina"),
    COP_PARA_PESO_ARGENTINO ("De COP a Peso Argentino"),
    COP_PARA_PESO_CHILENO("De COP a Peso Chileno"),
    DOLAR_PARA_COP("De Dólar a COP"),
    EURO_PARA_COP("De Euro a COP"),
    LIBRA_ESTERLINA_PARA_COP("De Libra Esterlina a COP"),
    PESO_ARGENTINO_PARA_COP("De Peso Argentino a COP"),
    PESO_CHILENO_PARA_COP("De Peso Chileno a COP"),     


    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipoConversion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
