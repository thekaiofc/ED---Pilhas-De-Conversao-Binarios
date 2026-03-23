package controller;

import br.edu.fateczl.pilhaint.PilhaInt;

public class ConverteController {

    public ConverteController(){
        super();
    }

    public String decToBin(int decimal) throws Exception {

        PilhaInt pilha = new PilhaInt();

        // Empilhamento (restos)
        while (decimal > 0){
            int resto = decimal % 2;
            pilha.push(resto);
            decimal = decimal / 2;
        }

        // Desempilhamento (montar string)
        String binario = "";

        while (!pilha.isEmpty()){
            binario = binario + pilha.pop();
        }

        return binario;
    }
}
