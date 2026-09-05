package model;

public class EnderecoModel {
    private String uf;
    private String rua;
    private String cep;
    private int numero;

    public EnderecoModel() {
    }

    public EnderecoModel(String uf, String rua, String cep, int numero) {
        System.out.println("Quantidade de Caracteres " + uf.length());
        if (uf.length() != 2) {
            System.out.println("Uf invalida");
        } else {
            this.uf = uf;
        }
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf.length() != 2) {
            System.out.println("Uf invalida");
        } else {
            this.uf = uf;
        }
    }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public void imprimeEndereco() {
            System.out.println("----Endereco----");
            System.out.println("Uf: " + this.getUf());
            System.out.println("Rua: " + this.getRua());
            System.out.println("Cep: " + this.getCep());
            System.out.println("Numero: " + this.getNumero());
        }
    }
