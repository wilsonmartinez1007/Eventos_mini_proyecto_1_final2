import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        List<Candidato> miLista = new ArrayList<>();//array tipo candidato llamado miLista
        int i= 0;//sera la posicion en la que se guardara cada candidato en mi array(miLista)
        Ciudades newCiudad; 
        PartidoPolitico newPartido;
        while(!salir){

            
            System.out.println("MENU----");
            System.out.println("1. Insertar candidato");
            System.out.println("2. Actualizar cand idato");
            System.out.println("3. Eliminar candidato");
            System.out.println("4. Buscar candidato por nombre");
            System.out.println("5. Listar todos los candidato");
            System.out.println("6. Salir del CRUD");
            System.out.println("0. Salir");
            int numSwitch = scanner.nextInt();//numero para el Switch
            
            switch(numSwitch){
                case 1: {
                    
                    scanner.nextLine();
                    System.out.print("Ingresa su nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa su cedula: ");
                    String cedula = scanner.nextLine();
                    
                    
                    Ciudades ciudad[] = Ciudades.values();//Se comparten los enums de Ciudades a la lista de enums(ciudad[])
                    System.out.println("\n CIUDADAES DE VALLE DEL CAUCA: \n");
                    
                    for (int k = 0; k < ciudad.length;k++){//for donde k es menor a la longitud de la lista(ciudad)
                    System.out.print("  " + (k+1)+ "." + ciudad[k]);//Se imprime la lista(ciudad) por posicion
                    if((k+1)%4 == 0){System.out.println("\n");//La condicion if()genera un salto de linea por cada multiplo de 4

                    }};   
                    System.out.print("\n\nDijite el numero que corresponde a su ciudad: ");
                    byte numCiudad = scanner.nextByte(); //se dijita el num dependiendo la ciudad
                    newCiudad = ciudad[numCiudad - 1];//se guarda en (newCiudad) el valor de la lista ciudad[posicion -1(ya que las posiciones inician en 0)]
                    System.out.println("\nDijita si eres de Derecha o Izquierda: ");
                    System.out.println("1.Derecha       2.Izquierda  ");
                    byte numEleccion = scanner.nextByte();//se dijita la eleccion del cantidato                   
                    boolean derecha;
                    if(numEleccion == 1){//Si se cumple la condicion el candidato es de derecha
                        derecha = true;
                    }else{derecha = false;}//caso contratio el candidato es de izquierda


                    System.out.println("\nPARTIDOS POLITICOS DE COLOMBIA: ");
                    PartidoPolitico partidosP[] = PartidoPolitico.values();//Comparto los valores de enums(PartidoPolitico) a una lista tipo enums(partiidoPolitico[])
                    for (int x = 0; x < partidosP.length;x++){ //se recorre mientras m < a la longitud de los PartidosPoliticos
                    System.out.print("  " + (x+1)+ "." + partidosP[x]);//se imprimimen las opciones de partidosPoliticos
                    if((x+1)%2 == 0){System.out.println("\n");//La condicion if()genera un salto de linea por cada multiplo de 2                 
                       }
                    }
                    System.out.print("\n\nDijite el numero que corresponde a su Partido Politico: ");
                    byte numPartido = scanner.nextByte();  //se guarda el num del pPolitico dijitado
                    newPartido = partidosP[numPartido - 1];//se guarda en (newPartido) el valor de la lista paridosP[posicion -1(ya que las posiciones inician en 0)]
                    
                    System.out.println("los nombre son "+nombre);
                    Candidato candidato = new Candidato(nombre, cedula, newCiudad, derecha, newPartido);//Se crea el candidato
                    miLista.add(i, candidato);//Se guarda el cantidato en la posicion i
                    i+=1;//Se le suma 1 al i
                    break;
                    }
                }
        }
    }
}//hola, hola
