/*C8_Ejercicios1A14.java
* Crea una biblioteca de funciones matemáticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
* Observa bien lo que hace cada función ya que, si las implementas en el orden
* adecuado, te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua
* resulta trivial teniendo voltea y la función siguientePrimo también es muy fácil de
* implementar teniendo esPrimo.
*@CarmenTrual
*/
import java.util.Scanner;

public class C8_Ejercicios1A14{
  
  //Función 6, voltea
  public static int voltea(int num){
    int numVolt;
    numVolt = 0;
    int resto;
    resto = 1;

    while(num > 0){
      resto = num % 10;
      numVolt = numVolt * 10 + resto;
      num /= 10;
    }
    return numVolt;
  }

  //Función 1, esCapicua
  public static boolean esCapicua(int num){
    int numVolt;
    numVolt = voltea(num);

    if(num == numVolt){
      return true;
    }
    return false;
  }

  //Función 2, esPrimo
  public static boolean esPrimo(int num){
    for(int i = 2; i < num; i++){
      if(num%i == 0){
        return false;
      } 
    }    
    return true;
  }

  //Función 3, sigPrimo
  public static int sigPrimo(int num){
    boolean primo;
    primo = false;

    while (primo == false){
      num++;
      primo = esPrimo(num);
    }

    return num;
  }

  //Función 4, potencia
  public static int potencia(int b, int e){
    int acum;
    acum = 1;

    for(int i = 1; i <= e; i++){
      acum *= b;
    }
    return acum;
  }

  //Función 5, digitos
  public static int digitos(int num){
    int cantNum;
    cantNum = 0;

    while(num > 0){
      cantNum++;
      num /= 10;
    }
    return cantNum;  
  }


  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    //1. Usamos la función esCapicua

    System.out.println("1.- Vamos a comprobar si un número es capicúo.");
    System.out.print("Introduce el número: ");
    int numCapi;
    numCapi = sc.nextInt();
    
    boolean capiONo;
    capiONo = esCapicua(numCapi);

    if(capiONo){
      System.out.println("El número " + numCapi + " es capicúo");
    } else {
      System.out.println("El número " + numCapi + " no es capicúo");
    }
    System.out.println("");

    //2. Usamos la función esPrimo

    System.out.println("2.- Vamos a comprobar si un número es primo o no.");
    System.out.print("Introduce el número: ");
    int numPrim;
    numPrim = sc.nextInt();

    boolean primONo;
    primONo = esPrimo(numPrim);

    if(primONo){
      System.out.println("Tu número es primo");
    } else {
      System.out.println("Tu número no es primo");
    }
    System.out.println("");

    //3.Usamos la función sigPrimo
    System.out.println("3.- Vamos a comprobar el siguiente número primo a uno introducido.");
    System.out.print("Introduce el número: ");
    int numParaSigPrimo;
    numParaSigPrimo = sc.nextInt();

    int numSigPrimo;
    numSigPrimo = sigPrimo(numParaSigPrimo);

    System.out.println("A partir de número " + numParaSigPrimo + ", el siguiente primo es: " + numSigPrimo);
    System.out.println("");

    //4. Usamos la función potencia
    System.out.println("4.- Vamos a calcular una potencia.");
    System.out.print("Introduce la base: ");
    int numBase;
    numBase = sc.nextInt();

    System.out.print("Introduce el exponente: ");
    int numExp;
    numExp = sc.nextInt();

    int pot;
    pot = potencia(numBase, numExp);

    System.out.println(numBase + " ^ " + numExp + " = " + pot);
    System.out.println("");

    //5. Usamos la función digitos
    System.out.println("5.- Vamos a comprobar la cantidad de dígitos de un número.");
    System.out.print("Introduce el número: ");
    int numDig;
    numDig = sc.nextInt();

    int cantDig;
    cantDig = digitos(numDig);

    System.out.println("El número " + numDig + " tiene " + cantDig + " dígitos");
    System.out.println("");

    //6. Usamos la función voltea
    System.out.println("6.- Vamos a voltear un número.");
    System.out.print("Introduce el número: ");
    int numParaVolt;
    numParaVolt = sc.nextInt();

    int numVolt;
    numVolt = voltea(numParaVolt);

    System.out.println("El número " + numParaVolt + " volteado es " + numVolt + ".");
    
  }
}
