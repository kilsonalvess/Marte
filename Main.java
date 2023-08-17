public class Main {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();

        meuAluno.setNome("Kilson Alves");
        meuAluno.setMatricula("20191370040");
        meuAluno.setId(1517);
        meuAluno.setTelefone("998945900");
        meuAluno.setLogin("kilson");
        meuAluno.setSenha("12345");

        meuAluno.RelatorioDeAluno();

        System.out.println("****************************************************************************");

        Professor meuProfessor = new Professor();

        meuProfessor.setNome("Victor Eduardo");
        meuProfessor.setMatricula("2019123456");
        meuProfessor.setId(2020);
        meuProfessor.setTelefone("98888888");
        meuProfessor.setLogin("victor");
        meuProfessor.setSenha("54321");
        meuProfessor.setCoordenador(true);


        meuProfessor.RelatorioProfessor();














    }




}
