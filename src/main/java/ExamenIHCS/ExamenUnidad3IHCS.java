package ExamenIHCS;

public class ExamenUnidad3IHCS {
     public int [][] Ejercicio6IHCS(int dimen, int numInit) {
        
        System.out.println("Ejercicio 6 : ");
        int [][] matriz = new int [dimen][dimen];
        int contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            if(j<i+1){
                matriz[i][j]=numInit;
                numInit++;
                contador++;
            }else{
                matriz[i][j]=0;
            }
                         
            }
        }
        contador = 0;
        return matriz;
        
    }
    public int [][] Ejercicio9IHCS(int dimen, int numInit) {
        
        System.out.println("Ejercicio 9 : ");
        int [][] matriz = new int [dimen][dimen];
        int contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            if(j>= dimen - (i + 1)){
                matriz[i][j]=numInit;
                numInit++;
                contador++;
            }else{
                matriz[i][j]=0;
            }
                         
            }
        }
        contador = 0;
        return matriz;
        
    }
      public int [][] Ejercicio12IHCS(int dimen, int numInit) {
        
        System.out.println("Ejercicio 12 : ");
        int [][] matriz = new int [dimen][dimen];
        int contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[0].length - 1; j >= 0; j--) {
                
            if(j >= i){
                matriz[i][j]=numInit;
                numInit++;
                contador++;
            }else{
                matriz[i][j]=0;
            }
                         
            }
            contador = 0;
        }
        
        return matriz;
        
    }
    public int [][] Ejercicio26IHCS(int dimen, int numInit) {
        
        System.out.println("Ejercicio 26 : ");
        int [][] matriz = new int [dimen][dimen];
        int contador = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            if (contador % 2 == 0){
                for (int j = matriz [0].length - 1; j >= 0; j--){
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                }
            }else{
                for(int j = 0; j < matriz.length; j++){
                    matriz[i][j] = numInit;
                    numInit++;
                    contador++;
                }
            }
        }
        contador = 0;
        return matriz;
        
        
    }
    public int [][] Ejercicio30IHCS(int dimen, int numInit) {
        
        System.out.println("Ejercicio 30 : ");
        int [][] matriz = new int [dimen][dimen];
        
         for (int c = 0; c < dimen / 2;c++){
             for (int leep = c; leep < dimen - c -1; leep++){
                 matriz [leep][dimen - 1 - c] = numInit++;
             }
            for (int lees = dimen-c-1; lees > c; lees--){
                 matriz [dimen - 1-c][lees] = numInit++;
            }
            for (int cold = dimen-c-1; cold > c; cold--){
                 matriz [cold][c] = numInit++;
            }
            for (int Id = c; Id < dimen - c -1; Id++){
                 matriz [c][Id] = numInit++;
            }
         }
         if(dimen % 2 !=0){
             matriz[dimen / 2][dimen / 2] = numInit;
         }
        return matriz;         
    }
    public void imprimir(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");  
        }
    }
    public static void main(String[] args) {
        ExamenUnidad3IHCS free=new ExamenUnidad3IHCS();
        System.out.println("RESULTADO");
        free.imprimir(free.Ejercicio6IHCS(5,0));
        System.out.println("");
        free.imprimir(free.Ejercicio9IHCS(5,0));
        System.out.println("");
        free.imprimir(free.Ejercicio12IHCS(5,0));
        System.out.println("");
        free.imprimir(free.Ejercicio26IHCS(5,0));
        System.out.println("");
        free.imprimir(free.Ejercicio30IHCS(5,0));
        System.out.println("");
        
    }
}
