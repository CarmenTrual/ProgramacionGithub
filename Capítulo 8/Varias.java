package misFunciones;

public class Varias {

/**
  @param a primer numero 
  @param b segundo numero 
  @retur multiplicación de a*b
*/

  public static double multiplica(double a, double b) {
    double result;
    result = a*b;

    return result;
    }


/**
@info: funcion para mostrar si eres mayor de edad
@param a: introduce la edad
@return esMayorEdad: si a>18 entonces eres mayor de edad
*/

  public static boolean esMayorEdad (int a){

    if (a>=18){
      return true;
    }
      else{
        return false;
      }
    }

  public static int minimo(int a, int b){
    if (a<b){
      return a;
    }
    else{
      return b;
    }
}

/**
  @info: función para averiguar el signo de un número
  @param a: primer número
  @param b: segudno número
  @return dimeSigno:
    - "<0": el número es negativo
    - "=0": el número es igual a 0
    - ">0": el número es positivo
*/
public static int dimeSigno (int a){
  if(a==0){
    System.out.println("El número es cero");
  }
  if (a>0){
    System.out.println("El número es positivo");
  }
  if (a<0){
    System.out.println("El número es negativo");
  }
  return dimeSigno(a);
}

/**
@info: función para calcular la suma desde 1 a "n".
@param n: número "n".
@return suma: suma de los enteros de 1 a "n".
*/
  public static int suma1aN(int n){
// variable acumuladora
    int suma=0;
  // bucle
  for(int i=1; i<=n; i++){
    suma+=i;
  }

  return suma;
  }

/**
@info: función para calcular el producto de los factoriales desde 1 a "n".
@param n: número "n".
@return producto: producto resultante de todos los factoriales de 1 a "n".
*/

  public static int producto1aN(int n){
// variable para el resultado
    int producto=1;

// bucle para obtener el resultado del factorial n
    for(int i=1; i<=n; i++){
      producto*=i;
    }

// return
  return producto;
}

/**
@info: función para obtener el valor intermedio entre 1 y "n"
@param n: número "n"
@return intermedio: valor intermedio de los enteros de 1 a "n"
*/
  public static double intermedio1aN(int n){
// diferencia (números que se deben sumar a 1 para llegar a "n")
    int numeroMedio=0;

// cálculo de la diferencia
    for(int i=1; i<n; i++){
      numeroMedio++;
        }

// diferentes casos
    if(numeroMedio==0){
      return 0;
    }
    else if(numeroMedio==1){
      return 1;
    }
    else{
    double intermedio=(1+n)/2.0;
    return intermedio;
        }
  }

/**
@info: función para sacar el mayor de entre dos valores
@param:
  - "a": primer número
  - "b": segundo número
@return:
  - "a": el primer número es el mayor
  - "b": el segundo número es el mayor
*/
  public static int maximo(int a, int b){
    if(a>b){
      return a;
    }else{
      return b;
    }
  }
}