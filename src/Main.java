package src;


public class Main {

    public static void main (String[] args){
        Usuario professores = new Usuario();
        professores.addProfessor(new Professor("João Montadeon", 01, "POO"));
        professores.addProfessor(new Professor("Leandro Maia", 2, "AEDS"));
        professores.addProfessor(new Professor("Marcio Fantini", 3, "Banco de Dados"));
        professores.imprimeDadosProfessores();
        
        Usuario alunos = new Usuario();
        alunos.addaluno(new Aluno("Mariana Gressi", 4, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Gabriela Aguiar", 5, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Wallace Freitas", 6, "Desenvolvimento de Sistemas"));
        alunos.addaluno(new Aluno("Jefferson Constantino", 7, "Biotecnologia"));
        alunos.addaluno(new Aluno("Raphael Menezes", 8, "Biotecnologia"));
        alunos.addaluno(new Aluno("Pedro Nunes", 9, "Biotecnologia"));
        alunos.imprimeDadosAlunos();

        Sala laboratorios = new Sala();
        laboratorios.addLaboratorio(new SalaLaboratorio('L', 1, 15));
        laboratorios.addLaboratorio(new SalaLaboratorio('L', 2, 15));
        laboratorios.imprimeDadosLaboratorios();

        Sala convencionais = new Sala();
        convencionais.addSala(new SalaConvencional('C', 3, 30));
        convencionais.addSala(new SalaConvencional('C', 4, 30));
        convencionais.imprimeDadosSalaConvencional();

        Sala reservas = new Sala();
        reservas.addreserva(new Reserva(new Professor("Joao", 1,"POO"), 15));
        reservas.imprimeReservassala();
    

    }
}

