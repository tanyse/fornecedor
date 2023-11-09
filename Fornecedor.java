package com.example.fornecedor.cadastro;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.Table;

@Table(name = "cadastro")
@Entity(name = "cadastro")
public class Fornecedor {
    private String nome;
    private String fantasia;
    private int cpf;
    private int telefone;
    private String email;

    public String getNome() {
        return nome;
    }
    public String getFantasia() {
        return fantasia;
    }
    public int getCpf() {
        return cpf;
    }
    public int getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
