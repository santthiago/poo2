package br.com.senac.aliens;

/**
 * ESTUDO DAS CLASSES - EXEMPLO DE CRIAÇÃO DE UM OBJETO
 * PROGRAMAÇÃO ORIENTADA A OBJETO - CRIAÇÃO DE UM TRANSPORTER
 * @author thiago.lsasantos
 */
public class Transporter {
    public static void main(String[] args) {
        Principal transporter = new Principal();
        transporter.cor = "vermelha";
        transporter.resistencia = 10000;
        transporter.tamanho = "grande - classe 5";
        System.out.println("NOME DO ALIEN: TRANSPORTER");
        System.out.println("COR: " + transporter.cor);
        System.out.println("RESISTENCIA: " + transporter.resistencia + " DEF");
        System.out.println("TAMANHO: " + transporter.tamanho);
        System.out.println("PRINCIPAIS AÇÕES:");       
        transporter.transportar();
        transporter.defender();
    }
}
