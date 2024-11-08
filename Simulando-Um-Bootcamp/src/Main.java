import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso js");
		curso2.setDescricao("descrição curso js");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());

		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria);
		 */

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devdaniel = new Dev();
		devdaniel.setNome("Daniel");
		devdaniel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Daniel:" + devdaniel.getConteudosInscritos());
		devdaniel.progredir();
		devdaniel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Daniel:" + devdaniel.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Daniel:" + devdaniel.getConteudosConcluidos());
		System.out.println("XP:" + devdaniel.calcularTotalXp());

		System.out.println("-------");

		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());

	}
}
