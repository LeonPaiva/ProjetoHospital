package models;

public class Funcionario {
    private int id_paciente;
    private String rg;
    private String nome;
    private String nasc;
    private String cidade;

    // Construtor de inserir no banco
    public Funcionario(String rg, String nome, String nasc, String cidade) {
        this.rg = rg;
        this.nome = nome;
        this.nasc = nasc;
        this.cidade = cidade;
    }

    // Construtor de pegar do banco
    public Funcionario(int id_paciente, String rg, String nome, String nasc, String cidade) {
        this.id_paciente = id_paciente;
        this.rg = rg;
        this.nome = nome;
        this.nasc = nasc;
        this.cidade = cidade;
    }
    
    
    
    
    
}
