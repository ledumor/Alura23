package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        System.out.println("bem vindo Pessoal");
        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1900, 2, 12));
        System.out.println(jose);
    }
}
