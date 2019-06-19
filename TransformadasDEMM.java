public class TransformadasDEMM {

    public int[][] cuadradosXnum(int numero){
    int[][] tablaM=new int[numero][2];
        for(int i = 0; i < tablaM.length; i++) {
           tablaM[i][0]=i+1;
           tablaM[i][1]=(i+1)*(i+1);           
        }
        return tablaM;
    }    
    public void sumaDeValoresxParesImpar(){
        int[][]  datos={{2,30,60,20},{40,4,10,3},{50,17,5,9},{15,4,8,6}};
        int par=0, impar=0, todos=0;        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                if(datos[i][j]%2==0){
                    par=par+datos[i][j];
                }else{
                    impar=impar+datos[i][j];
                }
                todos=todos+datos[i][j];
            }
        }
        System.out.println("PAR:"+par);
        System.out.println("impar:"+impar);
        System.out.println("todos:"+todos);
     }

    public int[][] transformada01DEMM(int dim, int numIint){
        int[][] matriz=new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(j<dim-i){
                    matriz[i][j]=numIint+(i+j)*(i+j+1)/2+i;
                }else{
                matriz[i][j]=-1;
                }
            }
        }        
    return matriz;
    }
    public int[][] transformada02DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                if(j<dim-i){
                    matriz[i][j]=numIint+(i+j)*(i+j+1)/2+j;
                }else{
                    matriz[i][j]=-1;
                }
            }
        }
        
       return matriz; 
    }
    public int[][] transformada03DEMM(int dim, int numIint){
    {   int[][] matriz = new int[dim][dim];
        int i = 1;
        int j = 1;
            for (int element = 0; element < dim * dim; element++){
            matriz[i - 1][j - 1] = element;
            if ((i + j) % 2 == 0){
                    if (j < dim)j++;
        else
                i+= 2;
                    if (i > 1)i--;
        }else{
                    if (i < dim)i++;
            else
                j+= 2;
                    if (j > 1)j--;
            }
        }
        return matriz;
        }
    }
    public int[][] transformada04DEMM(int dim, int numIint){
    {   int[][] matriz = new int[dim][dim];
        int i = 1;
        int j = 1;
            for (int element = 0; element < dim * dim; element++){
            matriz[j - 1][i - 1] = element;
            if ((i + j) % 2 == 0){
                    if (j < dim)j++;
        else
                i+= 2;
                    if (i > 1)i--;
        }else{
                    if (i < dim)i++;
            else
                j+= 2;
                    if (j > 1)j--;
            }
        }
        return matriz;
        }
    }
    public int[][] transformada05DEMM(int dim, int numIint){
        int[][] matriz=new int[5][5];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }        
    return matriz;
    }
    public int[][] transformada06DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                if(contador<=i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada07DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < matriz[0].length; j++){
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada11DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        
        for (int i = 0; i < matriz.length;i++) {
            for (int j = matriz[0].length-1; j>=0; j--){
            
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada13DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = 0; j < matriz[0].length; j++){
        for (int i = 0; i < matriz.length;i++) {
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada14DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = 0; j < matriz[0].length; j++){
        for (int i = 0; i < matriz.length;i++) {
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada16DEMM(int dim, int numIint){
        int[][] matriz=new int[5][5];
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length-1; j>=0; j--) {
                if(contador<=i){
                    matriz[j][i]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            }   contador=0;
        }
        return matriz;
    }
    public int[][] transformada17DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz[0].length-1; j>=0; j--){
        for (int i = 0; i < matriz.length;i++) {
            
                if(contador<=j){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada18DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        int contador=0;
        for (int j = matriz[0].length-1; j>=0; j--){
        for (int i = 0; i < matriz.length;i++) {
                if(j<dim-i){
                    matriz[i][j]=numIint;
                    numIint++;
                    contador++;
                }else{
                matriz[i][j]=-1;
                
                }
            } contador=0;
        }
        
       return matriz; 
    }
    public int[][] transformada19DEMM(int dim, int numIint){
        int[][] matriz = new int[dim][dim];
        int contador = 0;
        for (int j = matriz.length - 1; j >= 0; j--) {
            for (int i = matriz[0].length - 1; i >= 0; i--) {
                if (contador <= j) {
                    matriz[i][j] = numIint;
                    numIint++;
                    contador++;
                } else {
                    matriz[i][j] = -1;
                }
            }
            contador = 0;
        }
        return matriz;
    }
    public int[][] transformada22DEMM(int dim, int numIint){
        int cont = 0;
        int[][] matriz = new int[dim][dim];
        for (int y = 0; y <= matriz.length - 1; y++) {
            if (cont % 2 == 0) {
                for (int x = matriz[0].length - 1; x >= 0; x--) {
                    matriz[x][y] = numIint;
                    numIint++;
                }
            } else {
                for (int x = 0; x <= matriz[0].length - 1; x++) {
                    matriz[x][y] = numIint;
                    numIint++;
                }
            }
            cont++;
        }

        return matriz;
    }
    public int[][] transformada25DEMM(int dim, int numIint){
        int contador=0;
          int[][] matriz=new int[dim][dim];
          for (int x = 0; x < matriz.length; x++) {
              if(contador%2==0){
                  for (int y = 0; y < matriz[0].length; y++) {
                      matriz[x][y]=numIint;
                      numIint++;
                  }
              }else{
                  for (int y = matriz[0].length-1; y >=0; y--) {
                      matriz [x][y]=numIint;
                      numIint++;
                  }
              }
              contador++;
        }
        return matriz;
    }
    public int[][] transformada28DEMM(int dim, int numIint){
    int cont=0; int[][] matriz=new int[5][5];
        for (int x =matriz.length-1; x >=0 ; x--) {
            if(cont%2==0){
                for (int y = 0; y < matriz[0].length; y++) {
                    matriz[x][y]=numIint;
                    numIint++;
                }
            }else{
                for (int y = matriz[0].length-1; y >=0; y--) {
                    matriz[x][y]=numIint;
                    numIint++;
                }
            }
            cont++;
        }    
        return matriz;
    }
    public int[][] transformada29DEMM(int dim, int numIint){
    int[][] matriz=new int[5][5];
        for (int c = 0; c < dim/2; c++) {
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numIint;
                numIint++;
            }            
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numIint;
                numIint++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numIint;
                numIint++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numIint;
                numIint++;                
            }

        }

        if(dim%2!=0){
        matriz[dim/2][dim/2]=numIint;
        }

        return matriz;
    }
    public int[][] transformada30DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
                  
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numIint;
                numIint++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numIint;
                numIint++;                
            }
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numIint;
                numIint++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numIint;
                numIint++;
            }      
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numIint--;
        }
        
        return matriz;
     }
    public int[][] transformada31DEMM(int dim, int numIint){
        int[][] matriz=new int [dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numIint;
                numIint++;
            }            
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numIint;
                numIint++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numIint;
                numIint++;                
            }
            for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numIint;
                numIint++;                
            }

        }

        if(dim%2!=0){
        matriz[dim/2][dim/2]=numIint;
        }
        return matriz;
    }
    public int[][] transformada32DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        for (int c = 0; c < dim/2; c++) {
            for (int lxx = dim-c-1; lxx > c; lxx--) {
                matriz[lxx][c]=numIint;
                numIint++;                
            }
            for (int lsx = c; lsx < dim-c-1; lsx++) {
                matriz[c][lsx]=numIint;
                numIint++;
            }      
        for (int ldx = c; ldx < dim-c-1; ldx++) {
                matriz[ldx][dim-1-c]=numIint;
                numIint++;                
            }
            for (int lix = dim-c-1; lix > c; lix--) {
                matriz[dim-1-c][lix]=numIint;
                numIint++;                
            }
        }
        
        if(dim%2!=0){
        matriz[dim/2][dim/2]=numIint--;
        }
        
        return matriz;
     }
    public int[][] transformada36DEMM(int dim, int numIint){
        int[][] matriz=new int[dim][dim];
        for(int Prin = 0; Prin < dim/2; Prin++){
            for(int ldx = dim-Prin-1; ldx > Prin; ldx--){
                matriz[ldx][dim-Prin-1]=numIint;
                numIint++;
            }
            for(int lsx = dim-Prin-1; lsx>Prin; lsx--){
                matriz[Prin][lsx]=numIint;
                numIint++;
            }
            for(int lxx = Prin; lxx<dim-Prin-1; lxx++){
                matriz[lxx][Prin]=numIint;
                numIint++;
            }
            for(int lix = Prin; lix<dim-Prin-1; lix++){
                matriz[dim-Prin-1][lix]=numIint;
                numIint++;
            }
        if(dim%2!=0){
            matriz[dim/2][dim/2]=numIint;
        }
        }
        return matriz;
    }
    public void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        TransformadasDEMM ag=new TransformadasDEMM();
        int[][] matriX=ag.cuadradosXnum(10);
        for (int i = 0; i < matriX.length; i++) {
            System.out.println(matriX[i][0]+"|"+matriX[i][1]);
        }
        System.out.println("Resultados de Suma de contenido de Matriz");
        ag.sumaDeValoresxParesImpar();
        System.out.println("transformada01DEMM");
        ag.imprimirMatriz(ag.transformada01DEMM(5, 0));
        System.out.println("transformada02DEMM");
        ag.imprimirMatriz(ag.transformada02DEMM(5, 0));
        System.out.println("transformada03DEMM");
        ag.imprimirMatriz(ag.transformada03DEMM(5, 0));
        System.out.println("transformada04DEMM");
        ag.imprimirMatriz(ag.transformada04DEMM(5, 0));
        System.out.println("transformada05DEMM");
        ag.imprimirMatriz(ag.transformada05DEMM(5, 0));
        System.out.println("transformada06DEMM");
        ag.imprimirMatriz(ag.transformada06DEMM(5, 0));
        System.out.println("transformada07DEMM");
        ag.imprimirMatriz(ag.transformada07DEMM(5, 0));
        System.out.println("transformada11DEMM");
        ag.imprimirMatriz(ag.transformada11DEMM(5, 0));
        System.out.println("transformada13DEMM");
        ag.imprimirMatriz(ag.transformada13DEMM(5, 0));
        System.out.println("transformada14DEMM");
        ag.imprimirMatriz(ag.transformada14DEMM(5, 0));
        System.out.println("transformada16DEMM");
        ag.imprimirMatriz(ag.transformada16DEMM(5, 0));
        System.out.println("transformada17DEMM");
        ag.imprimirMatriz(ag.transformada17DEMM(5, 0));
        System.out.println("transformada18DEMM");
        ag.imprimirMatriz(ag.transformada18DEMM(5, 0));
        System.out.println("transformada19DEMM");
        ag.imprimirMatriz(ag.transformada19DEMM(5, 0));
        System.out.println("transformada22DEMM");
        ag.imprimirMatriz(ag.transformada22DEMM(5, 0));
        System.out.println("transformada25DEMM");
        ag.imprimirMatriz(ag.transformada25DEMM(5, 0));
        System.out.println("transformada28DEMM");
        ag.imprimirMatriz(ag.transformada28DEMM(5, 0));
        System.out.println("transformada29DEMM");
        ag.imprimirMatriz(ag.transformada29DEMM(5, 0));
        System.out.println("transformada30DEMM");
        ag.imprimirMatriz(ag.transformada30DEMM(5, 0));
        System.out.println("transformada31DEMM");
        ag.imprimirMatriz(ag.transformada31DEMM(5, 0));
        System.out.println("transformada32DEMM");
        ag.imprimirMatriz(ag.transformada32DEMM(5, 0));
        System.out.println("transformada36DEMM");
        ag.imprimirMatriz(ag.transformada36DEMM(5, 0));
  
    }
}
