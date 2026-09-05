import model.AtendimentoModel;
import model.EnderecoModel;
import model.PetModel;
import model.TutorModel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnderecoModel evento1 = new EnderecoModel("MS", "Afonso Pena", "79154-040", 25);

        EnderecoModel evento2 = new EnderecoModel("GO", "Santa Luzia", "79112-014", 147);

        TutorModel tutor1 = new TutorModel("Vinicius Queiroz", "025.254.014-55", evento1);

        TutorModel tutor2 = new TutorModel("Joao Augusto", "014.588.111-36", evento2);

        PetModel pet1 = new PetModel("Bidu", "Vira lata", 10.2, tutor1);

        PetModel pet2 = new PetModel("Bob", "Pastor Alemao", 12.4, tutor1);

        PetModel pet3 = new PetModel("Guto", "Pitbull", 15.9, tutor2);

        AtendimentoModel atendimento1 = new AtendimentoModel("24/05/2022", "Machucado", 49.90, pet1);

        AtendimentoModel atendimento2 = new AtendimentoModel("12/07/2023", "Vacina", 39.90, pet2);

        AtendimentoModel atendimento3 = new AtendimentoModel("05/02/2024", "Vacina", 39.90, pet3);

        atendimento1.imprimeAtendimento();


    }
}