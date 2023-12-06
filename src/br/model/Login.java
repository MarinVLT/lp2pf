package br.model;
import java.util.LinkedList;

public class Login extends Usuario{
    
    private int qntUsuarios = 0;
    private LinkedList<Usuario> usuariosCadastrados;

    public Login(){
        this.user = "";
        this.senha = "";
        this.nome = "";
        this.numeroCel = "";
        this.funcao = "";
        usuariosCadastrados = new LinkedList<>();
    }
    
    public Login(String user, String senha, String nome, String numero){
        this.user = user;
        this.senha = senha;
        this.nome = nome;
        this.numeroCel = numero;
        this.funcao = "";
        usuariosCadastrados = new LinkedList<>();
    }


    public void cadastraUser(Usuario u){
        if(qntUsuarios > 0){
            int count = 0;
            for(Usuario user : usuariosCadastrados){
                if(user.getUser().equals(u.getUser())){
                    System.out.println("Usuario já existe, por favor escolha outro username.");
                    count++;
                    break;
                }
            }
            if(count == 0){
                usuariosCadastrados.add(u);
                qntUsuarios++;
            }
        }else{
            usuariosCadastrados.add(u);
            qntUsuarios++;
        }
        
    }
    
    public boolean logar(String user, String senha){
        if(qntUsuarios > 0){
            for(Usuario u : usuariosCadastrados){
                if(u.getUser().equals(user)){
                    if(u.getSenha().equals(senha)){
                        return true;
                    }else return false;
                }
            }
        }else{
            return false;
        }
        return false;
    }

    public Usuario retornarUsuario(String user, String senha){
        Usuario usuario = new Usuario();
        
        for(Usuario u : usuariosCadastrados){
                if(u.getUser().equals(user)){
                    if(u.getSenha().equals(senha)){
                        usuario = u;
                    }
                }
        }
        return usuario;
    }

    public void imprimirUsuarioCadastrados(){
        if(qntUsuarios > 0){
            for(Usuario u : usuariosCadastrados){
                System.out.println("Username: " + u.getUser());
                System.out.println("Nome: " + u.getNome());
                System.out.println("Numero: " + u.getNumeroCel());
                System.out.println("Função: " + u.getFuncao());
                System.out.println("----------------------------------");
            }
        }else{
            System.out.println("Não há usuarios cadastrados.");
        }
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LinkedList<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void setUsuariosCadastrados(LinkedList<Usuario> usuariosCadastrados) {
        this.usuariosCadastrados = usuariosCadastrados;
    }

    public int getQntUsuarios() {
        return qntUsuarios;
    }

    public void setQntUsuarios(int qntUsuarios) {
        this.qntUsuarios = qntUsuarios;
    }


    

}