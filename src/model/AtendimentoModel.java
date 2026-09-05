package model;

public class AtendimentoModel {
    private String data;
    private String descricao;
    private double valor;
    private PetModel pet;

    public AtendimentoModel(){
    }
    public AtendimentoModel(String data, String descricao, double valor, PetModel pet){
        this.data = data;
        this.descricao = descricao;
        if(valor < 0){
            System.out.println("Valor invalido, será definido como 0");
            this.valor = 0;
        }else{
            this.valor = valor;
        }
        this.pet = pet;
    }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getDescricao() {
                return descricao;
            }

            public void setDescricao(String descricao) {
                this.descricao = descricao;
            }

            public double getValor() {
                return valor;
            }

            public void setValor(double valor) {
                this.valor = valor;
            }

            public PetModel getPet() {
                return pet;
            }

            public void setPet(PetModel pet) {
                this.pet = pet;
            }
            public void imprimeAtendimento(){
                System.out.println("----Atendimento----");
                System.out.println("Data: "+ this.getData());
                System.out.println("Descricao: "+ this.getDescricao());
                System.out.println("Valor: "+ this.getValor());
                this.getPet().imprimePet();
            }
        }
