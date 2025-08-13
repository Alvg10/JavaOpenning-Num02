import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {        
            Set<String> setTareas = new HashSet<>();
            List<String> listTareas = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            boolean Run = true;
                while(Run) {        
                    System.out.println("===Eliga lo que desea hacer=== \n 1: Agregar, \n 2: Mostrar, \n 3: Eliminar, \n 4: Salir");
                    try{     
                            int opc = scan.nextInt();       
                            switch (opc) {
                                    case 1: // Agregar tarea
                                            scan.nextLine();
                                            System.out.println("      ingrese la tarea que desee");
                                            String task = scan.nextLine();                
                                            if (setTareas.add(task)){                    
                                                listTareas.add(task);
                                                System.out.println("     Su tarea se agrego con exito");                                        
                                                break;
                                            }else{
                                                System.out.println("Elemento repetido");
                                                break;
                                            }
                                    case 2: // Mostrar tarea
                                            if(setTareas.isEmpty()){
                                                System.out.println("====La lista esta vacia====");
                                                continue;
                                            }else{        
                                                System.out.println("--Tus tareas son--");         
                                                for(int i = 0; i < listTareas.size(); i++)  
                                                System.out.println((i+1)+"."+listTareas.get(i));                                                   
                                                break;
                                            } 
                                    case 3: // Eliminar tarea
                                            if(!listTareas.isEmpty()){
                                             try{
                                                for( int i = 0; i < listTareas.size(); i++ )
                                                    System.out.println((i+1)+"."+listTareas.get(i));
                                                    System.out.println("Ingrese el numero de tarea que desea eliminar");
                                                    int eliminar = scan.nextInt();
                                                    scan.nextLine();                    
                                                    int eliminarmenos = (eliminar - 1);
                                                if(eliminarmenos < 0 ||eliminarmenos >= listTareas.size()){
                                                    System.out.println("Ingrese el rango de numero de la lista");
                                                    continue;
                                                }else{
                                                    System.out.println("la tarea a eliminar es: " + listTareas.get(eliminarmenos));
                                                    String setEliminar = listTareas.get(eliminarmenos);
                                                    listTareas.remove(eliminarmenos);
                                                    setTareas.remove(setEliminar);
                                                    System.out.println("                      Eliminado con exito");
                                                    continue;  
                                                }                    
                                            } catch (InputMismatchException e){
                                                    System.out.println("Ingreso un caracter no valido, por favor vuelva a intentarlo");
                                                    }
                                                scan.nextLine();    
                                                break;      
                                            }else{
                                                System.out.println("---Todavia no hay nada---");
                                                continue;
                                            }                                                 
                                    case 4: //Salir
                                            scan.nextLine();                                                 
                                            System.out.println("Esta seguro de salir ?? (si / no) \n ");
                                            String cancel = scan.nextLine().trim().toLowerCase();        
                                            if(cancel.equals("si")){
                                                System.out.println("Gracias por usar el sistema");
                                                Run = false;
                                                break;  
                                            }else if (cancel.equals("no")){
                                                break;
                                            } else{
                                                System.out.println("---Solo si o no por favor--- \n");
                                            }
                                            break;   
                                    default:
                                            System.out.println("Solo del 1 al 4");
                                    break;
                            } //cierre del Switch
                    }catch(InputMismatchException e){
                        System.out.println("Solo numeros por favor");
                        scan.nextLine();// Limpia el buffer.
                        continue;
                    }
            }
        scan.close();
    }
}
