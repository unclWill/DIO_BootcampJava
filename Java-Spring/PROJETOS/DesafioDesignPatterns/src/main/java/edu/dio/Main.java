package edu.dio;

import edu.dio.builders.CarroBuilder;
import edu.dio.builders.CarroManualBuilder;
import edu.dio.carros.Carro;
import edu.dio.carros.Manual;
import edu.dio.diretor.Diretor;

public class Main {
        public static void main(String[] args) {
            // Cria uma instância do Diretor, que controla o processo de construção.
            Diretor diretor = new Diretor();

            // Cria um construtor de carros (CarroBuilder).
            CarroBuilder builder = new CarroBuilder();

            // O Diretor utiliza o CarroBuilder para construir um carro esportivo.
            diretor.constuirCarroEsportivo(builder);

            // Obtém o resultado da construção do carro.
            Carro carro = builder.getResultado();
            // Imprime o tipo de carro construído.
            System.out.println("Carro construído:\n" + carro.getTipoCarro());

            // Cria um construtor de manuais de carros (CarroManualBuilder).
            CarroManualBuilder manualBuilder = new CarroManualBuilder();

            // O Diretor utiliza o CarroManualBuilder para construir um manual de carro esportivo.
            diretor.constuirCarroEsportivo(manualBuilder);
            // Obtém o resultado da construção do manual do carro.
            Manual carroManual = manualBuilder.getResultado();
            // Imprime o conteúdo do manual do carro construído.
            System.out.println("\nCarro manual construído:\n" + carroManual.imprimir());
        }

}