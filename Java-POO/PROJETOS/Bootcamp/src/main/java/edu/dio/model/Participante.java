package edu.dio.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Getter
public class Participante extends Pessoa {
    private Set<Conteudo> inscricoesEmConteudos;
    private Set<Conteudo> conteudosConcluidos;

    public Participante(String nome) {
        super(nome);
        inscricoesEmConteudos = new LinkedHashSet<>();
        conteudosConcluidos = new LinkedHashSet<>();
    }

    public Participante(String nome, String email, LocalDate dataNascimento) {
        super(nome, email, dataNascimento);
        inscricoesEmConteudos = new LinkedHashSet<>();
        conteudosConcluidos = new LinkedHashSet<>();
    }

    public void addInscricaoEmConteudo(Conteudo conteudo) {
        if (conteudo != null) {
            this.inscricoesEmConteudos.add(conteudo);
        } else {
            throw new IllegalArgumentException("O conteúdo que será adicionado não pode estar nulo!");
        }
    }

    public void addConteudoConcluido(Conteudo conteudo) {
        if (conteudo != null) {
            this.conteudosConcluidos.add(conteudo);
        } else {
            throw new IllegalArgumentException("O conteúdo que será adicionado não pode estar nulo!");
        }
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.inscricoesEmConteudos.addAll(bootcamp.getConteudos());
        bootcamp.addParticipante(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.inscricoesEmConteudos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.inscricoesEmConteudos.remove(conteudo.get());
        } else {
            System.err.println("Você ainda não se inscreveu em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp()).sum();
    }

    public void exibirConteudosEmAndamento() {
        System.out.printf("%n--- CONTEÚDOS EM ANDAMENTO DE %s ---%n", this.getNome());
        if (!inscricoesEmConteudos.isEmpty()) {
            imprimirDadosDeInscricoes();
        } else {
            System.out.println("Você ainda não se inscreveu em nenhum conteúdo!");
        }
    }

    public void exibirConteudosConcluidos() {
        System.out.printf("%n--- CONTEÚDOS CONCLUÍDOS %s ---%n", this.getNome());
        if (!conteudosConcluidos.isEmpty()) {
            imprimirDadosConteudosConcluidos();
        } else {
            System.out.println("Você ainda não se inscreveu em nenhum conteúdo!");
        }
    }

    public void exibirDadosParticipante() {
        System.out.printf(
                """
                Nome : %s
                Email: %s
                Data nascimento: %s
                XP: %.2f
                """, this.getNome(), this.getEmail(), this.getDataNascimento(), this.calcularTotalXp());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Participante that = (Participante) o;
        return Objects.equals(getInscricoesEmConteudos(), that.getInscricoesEmConteudos()) && Objects.equals(getConteudosConcluidos(), that.getConteudosConcluidos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getInscricoesEmConteudos(), getConteudosConcluidos());
    }

    private void imprimirDadosDeInscricoes() {
        inscricoesEmConteudos.forEach(c -> {
            if (c instanceof Curso) {
                System.out.printf(
                        """
                        Curso    : %s
                        Descrição: %s
                        CH       : %d
                        """, c.getTitulo(), c.getDescricao(), ((Curso) c).getCargaHoraria());
            } else {
                System.out.printf(
                        """
                        Mentoria : %s
                        Descrição: %s
                        Data     : %s
                        """, c.getTitulo(), c.getDescricao(), ((Mentoria) c).getDataMentoria());
            }
        });
    }

    private void imprimirDadosConteudosConcluidos() {
        conteudosConcluidos.forEach(c -> {
            if (c instanceof Curso) {
                System.out.printf(
                        """
                        Curso    : %s
                        Descrição: %s
                        CH       : %d
                        """, c.getTitulo(), c.getDescricao(), ((Curso) c).getCargaHoraria());
            } else {
                System.out.printf(
                        """
                        Mentoria : %s
                        Descrição: %s
                        Data     : %s
                        """, c.getTitulo(), c.getDescricao(), ((Mentoria) c).getDataMentoria());
            }
        });
    }
}
