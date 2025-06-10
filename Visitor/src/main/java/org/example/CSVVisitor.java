package org.example;

public class CSVVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "Matricula, Nome, Curso " + aluno.getMatricula() +
                ", " + aluno.getNome() + ", " + aluno.getNomeCurso();
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "Matricula, Nome, Titulacao " + professor.getMatricula() +
                ", " + professor.getNome() + ", " + professor.getTitulacao();
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Codigo, Nome, Salario " + funcionario.getCodigo() +
                ", " + funcionario.getNome() + ", " + funcionario.getSalario();
    }
}
