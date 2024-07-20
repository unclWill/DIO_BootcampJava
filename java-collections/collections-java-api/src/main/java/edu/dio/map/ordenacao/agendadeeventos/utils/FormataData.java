package edu.dio.map.ordenacao.agendadeeventos.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static LocalDate formataStringParaData(String dataDeEntrada) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataDeEntrada, dtf);
    }

    public static String formataDataPáraString(LocalDate dataDeEntrada) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataDeEntrada.format(dtf);
    }
}
