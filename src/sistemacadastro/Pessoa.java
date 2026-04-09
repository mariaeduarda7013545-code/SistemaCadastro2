

package sistemacadastro;
 
 

public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;

    // funções abaixo
    public void exibirDados(){
        System.out.println("Adicione o seu" + nome +
                "Coloque sua idade" + idade +
                "Insire seu CPF" + cpf);
    }
    
    
    
    //contrutores 
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {
    }
    
    
    // getd e sets 
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade invalida");
        }
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
 
}

