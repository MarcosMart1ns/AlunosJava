class Main{
    public static void main(String[] args) {
        //instancia novo aluno
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        //seta nome 
        a1.setNome("Mario");
        a2.setNome("Roger");
        a3.setNome("Marcela");
        //instancia vetor 
        Vetor lista = new Vetor();
        //adciona aluno na lista 
        lista.adicionaEm(0, a1);
        lista.adicionaEm(4, a3);
        lista.adiciona(a2);
        //printa lista 

        System.out.println("Lista de Alunos: \n"+lista);
        System.out.println("\nQuantidade de alunos: "+lista.tamanho());
        System.out.println(a1.getNome());
        

    }
}