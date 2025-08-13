/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmosifeelse;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AlgoritmosIfeElse {

    public static void main(String[] args) {
        
       // PRIMEIRA PARTE: COLETAR OS DADOS DOS USUÁRIOS
    //Mostra uma janela pedindo o primeiro número e armazena o que foi digitado
    String primeiroNumeroStr = JOptionPane.showInputDialog("Digite o primeiro número:");
        
//Converte o texto digitado para um número
    double primeiroNumero = Double.parseDouble(primeiroNumeroStr);
    
// Mostra outra janela pedindo o segundo número
String segundoNumeroStr = JOptionPane.showInputDialog("Digite o segundo número:");

// Converte novamente para número
double segundoNumero = Double.parseDouble(segundoNumeroStr);
        
        
        
//SEGUNDA PARTE DO PROJETO: COMPARAR OS NÚMEROS USANDO IF/ELSE
        
    // Cria uma mensagem que vai juntando todos os resultados
     String mensagemFinal = "Comparação entre " + primeiroNumero + " e " + segundoNumero + ":\n\n";
        
      // 1: Verifica se os números são iguais (==)
      if (primeiroNumero == segundoNumero) {
            mensagemFinal += primeiroNumero + " é igual a " + segundoNumero + "\n";
        
      } else {
            mensagemFinal += primeiroNumero + " não é igual a " + segundoNumero + "\n";
        }
        
        // 2: Verifica se o primeiro é maior que o segundo (>)
        if (primeiroNumero > segundoNumero) {
            mensagemFinal += primeiroNumero + " é maior que " + segundoNumero + "\n";
        
        } else {
            mensagemFinal += primeiroNumero + " não é maior que " + segundoNumero + "\n";
        }
        
        // 3: Verifica se o primeiro é menor que o segundo (<)
        if (primeiroNumero < segundoNumero) {
            mensagemFinal += primeiroNumero + " é menor que " + segundoNumero + "\n";
        
        } else {
            mensagemFinal += primeiroNumero + " não é menor que " + segundoNumero + "\n";
        }
        
        // 4: Verifica se os números são DIFERENTES (!=)
      
        if (primeiroNumero != segundoNumero) {
            mensagemFinal += primeiroNumero + " é diferente de " + segundoNumero + "\n";
        
        } else {
            mensagemFinal += primeiroNumero + " não é diferente de " + segundoNumero + "\n";
        }
        
        // 5: Verifica se o primeiro é maior ou igual (>=)
        if (primeiroNumero >= segundoNumero) {
            mensagemFinal += primeiroNumero + " é maior ou igual a " + segundoNumero + "\n";
        
        } else {
            mensagemFinal += primeiroNumero + " não é maior ou igual a " + segundoNumero + "\n";
        }
        
        // 6: Verifica se o primeiro é MENOR OU IGUAL (<=)
        if (primeiroNumero <= segundoNumero) {
            mensagemFinal += primeiroNumero + " é menor ou igual a " + segundoNumero + "\n";
        
        } else {
            mensagemFinal += primeiroNumero + " não é menor ou igual a " + segundoNumero + "\n";
        }
       
         // PARTE FINAL: MOSTRAR O RESULTADO.
        
        // Mostra uma janela com todos os resultados juntos
        JOptionPane.showMessageDialog(null, mensagemFinal, "Resultado das Comparações", JOptionPane.INFORMATION_MESSAGE);
    }
}