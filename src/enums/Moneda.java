package enums;

import java.math.BigDecimal;

public enum Moneda {

    //Cotações em 27/07/2022
    DOLAR(BigDecimal.valueOf(3698)),
    EURO(BigDecimal.valueOf(4400.78)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(5138.02)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.041)),
    PESO_CHILENO(BigDecimal.valueOf(0.0058));

    private BigDecimal FACTOR_CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.FACTOR_CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return FACTOR_CONVERSION;
    }
}
