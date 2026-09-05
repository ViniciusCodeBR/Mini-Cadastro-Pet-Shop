package model;

public class TutorModel {
    private String nome;
    private String cpf;
    private EnderecoModel endereco;

    public TutorModel(){
    }

    public TutorModel(String nome, String cpf, EnderecoModel endereco){
        this.nome = nome;
        System.out.println("Quantidade de Caracteres: "+ cpf.length());
        if(cpf.length() >14 || cpf.length() <14){
            System.out.println("CPF inválido");
        }else{
            this.cpf = cpf;
        }
        this.endereco = endereco;
    }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            if(cpf.length() >14 || cpf.length() <14){
                System.out.println("CPF inválido");
            }else{
                this.cpf = cpf;
            }
        }

        public EnderecoModel getEndereco() {
            return endereco;
        }

        public void setEndereco(EnderecoModel endereco) {
            this.endereco = endereco;
        }

    public void imprimeTutor(){
        System.out.println("----Tutor----");
        System.out.println("Nome: "+ this.getNome());
        System.out.println(("Cpf: "+ this.getCpf()));
        this.getEndereco().imprimeEndereco();
    }
}
