package model;

import enums.Moneda;
import enums.TipoConversion;

import java.math.BigDecimal;

public class IniciadorConversionMonedas {

    private static final String COP_PARA_DOLAR = "De COP a Dólar";
    private static final String COP_PARA_EURO = "De COP a Euro";
    private static final String COP_PARA_LIBRA_ESTERLINA = "De COP a Libra Esterlina";
    private static final String COP_PARA_PESO_ARGENTINO = "De COP a Peso Argentino";
    private static final String COP_PARA_PESO_CHILENO = "De COP a Peso Chileno";
    private static final String DOLAR_PARA_COP = "De Dólar a COP";
    private static final String EURO_PARA_COP = "De Euro a COP";
    private static final String LIBRA_ESTERLINA_PARA_COP = "De Libra Esterlina a COP";
    private static final String PESO_ARGENTINO_PARA_COP = "De Peso Argentino a COP";
    private static final String PESO_CHILENO_PARA_COP = "De Peso Chileno a COP";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino();
    private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case COP_PARA_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case COP_PARA_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case COP_PARA_LIBRA_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case COP_PARA_PESO_ARGENTINO -> {
                return convertidorDeMonedaPesoArgentino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case COP_PARA_PESO_CHILENO -> {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PARA_COP -> {
                return convertidorDeMonedaDolar.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PARA_COP -> {
                return convertidorDeMonedaEuro.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PARA_COP -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PARA_COP -> {
                return  convertidorDeMonedaPesoArgentino.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PARA_COP -> {
                return convertidorDeMonedaPesoChileno.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
