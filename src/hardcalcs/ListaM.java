package hardcalcs;


public class ListaM {   /*lista ao qual sera responsavel por criar a matriz*/
    /*declaracao de variaveis*/
    public elementoM primeiroL; /*elemntos da matriz*/
    public elementoM primeiroC;
    public elementoM ultimoL;
    public elementoM ultimoC;
    private int countL = 1; /*contador de linhas*/
    private int countC = 0; /*contador de colunas*/
    private int countel = 0; /*contador de elementos da matriz*/
    
    public void insereElemento(int valor,int tam){  /*funcao que ira inserir elementos na matriz*/
        if(countel < tam){  /*conta os elementos ate o tamanho recebido da matriz*/
            insereColuna(valor);    /*insere os elementos da coluna*/
            countel++;  /*incrementa o contador de elementos*/
        }else{
            insereLinha(valor); /*insere novas linhas na matriz*/
            countel = 1;    /*reseta com o valor 1 contando com o elemento da linha adicionado*/
        }
    }
    
    public void insereLinha(int valor){ /*insere uma nova linha*/
        elementoM novoultimo = new elementoM();
        novoultimo.dado = valor;
        novoultimo.proxL = null;
        if(primeiroL == null){
            primeiroL = novoultimo;
        }else{
            ultimoL.proxL = novoultimo;
        }
        ultimoL = novoultimo;
        primeiroC = novoultimo;
        ultimoC = novoultimo;
        countL++;
        
    }
    
    public void insereColuna(int valor){    /*insere uma nova coluna*/
        elementoM novoultimo = new elementoM();
        novoultimo.dado = valor;
        novoultimo.proxC = null;
        if(primeiroC == null){
            primeiroC = novoultimo;
        }else{
            ultimoC.proxC = novoultimo;
        }
        ultimoC = novoultimo;
        countC++;
        if((primeiroL == null)&&(ultimoL == null)){
            primeiroL = novoultimo;
            ultimoL = primeiroL;
        }
        
    }
    
    public void deletarMatriz(){    /*deleta a matriz*/
        elementoM ptr = primeiroL;
        countL = 0;
        countC = 0;
        
        while(ptr!=null){
            while(ptr.proxC!=null){
                elementoM excluido = ptr.proxC;
                ptr.proxC = excluido.proxC;
                excluido = null;
            }
            elementoM ptr2 = ptr;
            ptr = ptr2.proxL;
            ptr2 = null;
        }
    }
    
    public void transpor(){ /*transpõe a matriz*/
        elementoM trocar = primeiroL;
        elementoM aux = null;
        elementoM aux2 = null;
        elementoM nextC = primeiroL;
        
        while(trocar != null){
            aux = trocar.proxC;
            trocar.proxC = trocar.proxL;
            trocar.proxL = aux;
            trocar = trocar.proxC;
            aux = null;
        }
        elementoM trocarptr = primeiroL;
        while((trocarptr != null)&&(nextC.proxC != null)&&(this.getDimC()!=1)){
            aux = trocarptr.proxC;
            aux2 = trocarptr.proxL;
            aux = aux.proxL;
            if(aux!=null){
                aux2.proxC = aux;
                aux = null;
            }
            trocarptr = trocarptr.proxL;
            if(trocarptr == null){
                trocarptr = nextC;
                nextC = nextC.proxC;
            }
        }
        trocar = null;
        aux2 = null;
        trocarptr = null;
        nextC = null;
    }
    
    public int getDimL(){   /*retorna a dimnesao de linhas*/
        return countL;
    }
    
    public int getDimC(){   /*retorna a dimnesao de colunas*/
        return countC;
    }
    
    public String getMatrix(){  /*retorna uma string contendo a matriz*/
        elementoM ptr = primeiroL;
        elementoM aux = primeiroL;
        elementoM removidoL;
        String tr = "";
        
        while(aux != null){
            while(ptr!=null){
                tr = tr+ptr.dado+" ";
                elementoM removido = ptr;
                ptr = removido.proxC;
                removido = null;
            }
            tr = tr+"\n";
            removidoL = aux;
            aux = aux.proxL;
            ptr = aux;
            removidoL = null;
        }
        
        return tr;
    }
    
    public ListaM multiplicar(ListaM l,int tam){ /*multiplica duas listas de matrizes diferentes*/
        l.transpor();
        ListaM result = new ListaM();
        elementoM auxC = primeiroL;
        elementoM aux2C = l.primeiroL;
        elementoM auxL = primeiroL;
        elementoM aux2L = l.primeiroL;
        boolean tr = false;
        boolean saiu = false;
        int res = 0;
        
        while(tr != true){
            while((auxC!=null)&&(aux2C!=null)){
                res = (auxC.dado * aux2C.dado)+res;
                auxC = auxC.proxC;
                aux2C = aux2C.proxC;
                saiu = true;
            }
            if(auxL != null){
                auxL = auxL.proxL;
                auxC = auxL;
                aux2C = aux2L;
                if(saiu == true){
                    result.insereElemento(res, tam);
                    saiu = false;
                }
            }else if(aux2L != null){
                aux2L = aux2L.proxL;
                aux2C = aux2L;
                auxL = primeiroL;
                auxC = auxL;
            }else{
                tr = true;
            }
            res = 0;
        }
        
        result.transpor();
        return result;
    }
    
    public ListaM somar(ListaM l){    /*soma duas listas de matrizes*/
        elementoM auxC = this.primeiroL;
        elementoM aux2C = l.primeiroL;
        elementoM auxL = auxC;
        elementoM aux2L = aux2C;
        
        while((auxL != null)&&(aux2L != null)){
            while((auxC != null)&&(aux2C != null)){
                auxC.dado += aux2C.dado;
                auxC = auxC.proxC;
                aux2C = aux2C.proxC;
            }
            auxL = auxL.proxL;
            aux2L = aux2L.proxL;
            auxC = auxL;
            aux2C = aux2L;
        }
        auxC = null;
        aux2C = null;
        aux2L = null;
        auxL = null;
        
        return this;
    }
    
    public void copiarMat(ListaM l,int tam){    /*copia uma matriz para outra*/
        elementoM auxC;
        elementoM auxL = l.primeiroL;
        int n = 0;
        
        while(auxL != null){
            auxC = auxL;
            auxL = auxL.proxL;
            while((n < tam)&&(auxC != null)){
                insereElemento(auxC.dado,tam);
                n++;
                auxC = auxC.proxC;
            }
            n = 0;
        }
    }
}
