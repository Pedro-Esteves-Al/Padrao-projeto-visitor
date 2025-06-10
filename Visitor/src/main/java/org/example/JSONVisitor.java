package org.example;

public class JSONVisitor implements Visitor {
    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return "{" +
                "\nmatricula: " + aluno.getMatricula() +
                "\nnome: " + aluno.getNome() +
                "\ncurso: " + aluno.getNomeCurso() +
                "\n}";
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return "{" +
                "\nmatricula: " + professor.getMatricula() +
                "\nnome: " + professor.getNome() +
                "\ntitulacao: " + professor.getTitulacao() +
                "\n}";
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "{" +
                "\ncodigo: " + funcionario.getCodigo() +
                "\nnome: " + funcionario.getNome() +
                "\nsalario: " + funcionario.getSalario() +
                "\n}";
    }
}
