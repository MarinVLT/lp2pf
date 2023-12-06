package br.model;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        String username;
        String senha;
        Scanner scan = new Scanner(System.in);
        Login l = new Login();

        Gerente g1 = new Gerente("anari", "123", "anari", "8888888");
        Gerente g2 = new Gerente("alice", "123", "alice", "8888888");
        Cliente c1 = new Cliente("ana", "123", "ana", "8888888");
        Cliente c2 = new Cliente("ana", "123", "ana", "8888888");
        Cliente c3 = new Cliente("joão", "123", "joao", "8888888");

        System.out.println("Cadastrando usuarios");
        System.out.println("----------------------------------");
        
        l.cadastraUser(g1);        
        l.cadastraUser(g2);
        l.cadastraUser(c1);        
        l.cadastraUser(c3);

        System.out.println("\n");

        System.out.println("Listando usuarios cadastrados");
        System.out.println("----------------------------------");
        l.imprimirUsuarioCadastrados();

        System.out.println("\n");

        System.out.println("Tentativa de cadastro de usuario com mesmo username");
        System.out.println("----------------------------------");
        l.cadastraUser(c2);        

        System.out.println("\n");

        System.out.println("Listando usuarios cadastrados");
        System.out.println("----------------------------------");
        l.imprimirUsuarioCadastrados();


        Usuario teste = new Usuario();
        System.out.println("SIMULAÇÃO DE LOGIN");
        System.out.println("----------------------------------");
        System.out.println("Username:");
        username = scan.nextLine();

        System.out.println("Senha:");
        senha = scan.nextLine();

        if(l.logar(username, senha) == true){
            System.out.println("LOGIN REALIZADO COM SUCESSO");
            System.out.println("----------------------------------");
            System.out.println("INFORMAÇÕES DO USUARIO LOGADO:");
            System.out.println("----------------------------------");

            teste = l.retornarUsuario(username, senha);

            System.out.println("Nome: " + teste.getNome());
            System.out.println("Numero: " + teste.getNumeroCel());
            System.out.println("Função: " + teste.getFuncao());
            System.out.println("----------------------------------");


        }else{
            System.out.println("FALHA A REALIZAR O LOGIN, USUARIO OU SENHA INCORRETOS");
        }


    }

    


}
