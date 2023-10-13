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

                    case 2: {
                        System.out.println("Lista de candidatos registrados");
                        for (int j = 0; j < miLista.size(); j++) {                   //se muestra lista de todos los candidatos registrados
                            Candidato candidatoExistente = miLista.get(j);
                            System.out.println((j + 1) + " . " + candidatoExistente.getNombre());
                        }
                        System.out.println("¿Cual candidato desea hacerle una actualizacion? \n");
                        int numeroCandidato = scanner.nextInt();
                    
                        if (numeroCandidato >= 1 && numeroCandidato <= miLista.size()) { //el condicional garantiza que el numero no sea mas grande que la lista ni sea menor al primer valor de ella 
                            scanner.nextLine();
                    
                            Candidato candidatoActualizar = miLista.get(numeroCandidato - 1);
                    
                            System.out.println("Cambie el nombre:");  //ingresa los nuevos cambios
                            String nuevoNombre = scanner.nextLine();
                            System.out.println("Cambie el numero de cedula:");
                            String nuevaCedula = scanner.nextLine();
                    
                            Ciudades ciudad[] = Ciudades.values();   //se muestran de nuevo las ciudades permitidas 
                            System.out.println("ciudades del valle del cauca:");
                            for (int k = 0; k < ciudad.length; k++) {
                                System.out.print((k + 1) + ". " + ciudad[k] + " ");
                                System.out.println("\n");
                            }
                            System.out.println("\nDigite el numero que corresponde a la nueva ciudad:"); //se actualiza la ciudad 
                            byte numCiudad = scanner.nextByte();
                            candidatoActualizar.setCiudades(ciudad[numCiudad - 1]);
                    
                            System.out.println("Cambie el partido politico:"); //se muestran de nuevo los valores de los partidos permitidos
                            PartidoPolitico partidosP[] = PartidoPolitico.values();
                            for (int x = 0; x < partidosP.length; x++) {
                                System.out.print((x + 1) + ". " + partidosP[x] + " ");
                                System.out.println("\n");
                            }
                            System.out.println("\nDigite el numero que corresponde al nuevo partido politico:"); //se actualiza el partido
                            byte numPartido = scanner.nextByte();
                            candidatoActualizar.setPartidoPolitico(partidosP[numPartido - 1]);
                    
                            System.out.println("Cambie la postura politica:");
                            System.out.println("1. Derecha");
                            System.out.println("2. Izquierda");
                            byte numEleccion = scanner.nextByte();
                            boolean derecha = (numEleccion == 1);
                            candidatoActualizar.setDerecha(derecha);
                    
                            candidatoActualizar.setNombre(nuevoNombre);
                            candidatoActualizar.setCedula(nuevaCedula);
                    
                            System.out.println("Ha actualizado los datos del candidato.");
                        } else {
                            System.out.println("Este candidato no esta registrado.");
                        }
                        break;
                    }


                }
        }
    }
}//hola, hola
