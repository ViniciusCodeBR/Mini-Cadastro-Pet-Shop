package model;

public class PetModel {
    private String nome;
    private String especie;
    private double pesoKg;
    private TutorModel tutor;

    public PetModel(){
    }
    public PetModel(String nome, String especie, double pesoKg, TutorModel tutor){
        this.nome = nome;
        this.especie = especie;
        if(pesoKg <= 0){
            System.out.println("Peso invalido, será preenchido como 1");
             this.pesoKg = 1;
        }else{
            this.pesoKg = pesoKg;
        }
        this.tutor = tutor;
    }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public double getPesoKg() {
            return pesoKg;
        }

        public void setPesoKg(double pesoKg) {
            if(pesoKg <= 0){
                System.out.println("Peso invalido, será preenchido como 1");
                this.pesoKg = 1;
            }else{
                this.pesoKg = pesoKg;
            }
        }

    public TutorModel getTutor() {
        return tutor;
    }

    public void setTutor(TutorModel tutor) {
        this.tutor = tutor;
    }
    public void imprimePet(){
        System.out.println("----Pet----");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("Especie: "+ this.getEspecie());
        System.out.println("Peso: "+ this.getPesoKg());
        this.getTutor().imprimeTutor();
    }
}
