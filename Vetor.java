import java.util.Arrays;

class Vetor{
    private Aluno[] alunos = new Aluno[100];
    
    public void adiciona(Aluno aluno){
        int i;
        for(i=0;i<=alunos.length;i++){
            if(alunos[i]==null){
                alunos[i] = aluno;
                break;
            }
        }
    }
    
    public void adicionaEm(int posicao, Aluno aluno){
        this.alunos[posicao]=aluno;
    }
    
    public Aluno pega(int posicao){
        return this.alunos[posicao];
    }
    
    public void remove(int posicao){
        alunos[posicao] = null;
    }
    
    public boolean contem(Aluno aluno){
        int i;
        
        boolean contem=false;
        
        for(i=0;i<=100;i++){
            if(alunos[i].getNome()==aluno.getNome()){
                contem = true;
                break;
            }else{
                continue;
            }
        }

        return contem;
    }

    public int tamanho(){
        return alunos.length;
    }

    public String toString(){
        return Arrays.toString(alunos);
    }
}