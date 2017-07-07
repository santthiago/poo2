package br.com.senac.aliens;

/**
 * ESTUDO DAS CLASSES - EXEMPLO DE CRIAÇÃO DE UM OBJETO
 * PROGRAMAÇÃO ORIENTADA A OBJETO - CRIAÇÃO DE UM BLOB
 * @author thiago.lsasantos
 */
public class Blob {
    public static void main(String[] args) {
        Principal blob = new Principal();
        blob.cor = "verde";
        blob.forca = 100;
        blob.intelig = 15;
        blob.tamanho = "Pequeno - classe 1";
        System.out.println("NOME DO ALIEN: BLOB");
        System.out.println("COR: " + blob.cor);
        System.out.println("FORÇA: " + blob.forca + " ATK" );
        System.out.println("TAMANHO: " + blob.tamanho);
        System.out.println("NIVEL DE INTELIGENCIA: " + blob.intelig + " %");
        System.out.println("PRINCIPAIS AÇÕES");
        blob.atirar();
        blob.explodir();
    }
}
