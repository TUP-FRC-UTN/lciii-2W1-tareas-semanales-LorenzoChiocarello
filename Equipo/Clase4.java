
package clase4;
import java.util.Scanner;

public class Clase4 {

    
    public static void main(String[] args) {
        
        Jugador[] equipo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidad = sc.nextInt();
        
        equipo = new Jugador[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese nombre jugador " + i);
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese posicion" + i);
            int posicion = sc.nextInt();
            
            System.out.println("Ingrese numero camiseta");
            int nroCamiseta = sc.nextInt();
            
            System.out.println("Cantidad de partidos jugados");
            int cantPartidosJugados = sc.nextInt();
            
            System.out.println("Ingrese estado fisico");
            int porcentajeEstadoFisico = sc.nextInt();
            
            
            
            equipo[i] = new Jugador(nombre, posicion, nroCamiseta, cantPartidosJugados, porcentajeEstadoFisico);
            
            
            
        }
        
        //muestra contenido del vector
        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
            
        }
        
        int cantMenos10partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getCantPartidosJugados()<10){
                cantMenos10partidos++;
            }
            
        }
        
        System.out.println("Cantidad de jugadores con menos de 10 partidos: " + cantMenos10partidos);
        
        Jugador jugadorConMasPartidosJugados = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if (jugadorConMasPartidosJugados.getCantPartidosJugados() < equipo[i].getCantPartidosJugados()){
                
                jugadorConMasPartidosJugados = equipo[i];
            }
        
        }
        
        System.out.println("El jugador con mas partidos jugados es: " + jugadorConMasPartidosJugados);
        
        System.out.println("Ingrese el numero de camiseta que desea buscar: ");
        int nroCamiseta = sc.nextInt();
        
        Jugador j = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if(equipo[i].getNroCamiseta()== nroCamiseta){
                j = equipo[i];
                break;
                
            }
        }
        
        System.out.println("Estado fisico de ese jugador es: " + j.getPorcentajeEstadoFisico());
        
        double promedio = 0;
        double sumaEstadoFisico = 0;
        
        
        for (int i = 0; i < equipo.length; i++) {
            
            equipo[i].getPorcentajeEstadoFisico();
            sumaEstadoFisico =+ equipo[i].getPorcentajeEstadoFisico() + sumaEstadoFisico;
            
            
        }
        
        
        promedio = sumaEstadoFisico / equipo.length;
        System.out.println("El promedio de estado fisico del equipo es: " + promedio);
        
        
        int cantArqueros = 0;
        int cantDefensores = 0;
        int cantMediocampistas = 0;
        int cantDelanteros = 0;
        double promedioA = 0;
        double promedioDef = 0;
        double promedioM = 0;
        double promedioDel= 0;
        double sumaPartidosA = 0;
        double sumaPartidosDef = 0;
        double sumaPartidosM = 0;
        double sumaPartidosDel = 0;
        
        for (int i = 0; i < equipo.length; i++) {
            equipo[i].getCantPartidosJugados();
            if(equipo[i].getPosicion()==1){
                cantArqueros++;
                sumaPartidosA =+ equipo[i].getCantPartidosJugados() + sumaPartidosA;
            }
            if(equipo[i].getPosicion()==2){
                cantDefensores++;
                sumaPartidosDef =+ equipo[i].getCantPartidosJugados() + sumaPartidosDef;
            }
            if(equipo[i].getPosicion()==3){
                cantMediocampistas++;
                sumaPartidosM =+ equipo[i].getCantPartidosJugados() + sumaPartidosM;
            }
            if(equipo[i].getPosicion()==4){
                cantDelanteros++;
                sumaPartidosDel =+ equipo[i].getCantPartidosJugados() + sumaPartidosDel;
            }
                
        
        }
        
        promedioA = sumaPartidosA / cantArqueros;
        promedioDef = sumaPartidosDef / cantDefensores;
        promedioM = sumaPartidosM / cantMediocampistas;
        promedioDel = sumaPartidosDel / cantDelanteros;
        
        System.out.println("El promedio de partidos jugados por arqueros es: " + promedioA);
        System.out.println("El promedio de partidos jugados por defensores es: " + promedioDef);
        System.out.println("El promedio de partidos jugados por mediocampistas es: " + promedioM);
        System.out.println("El promedio de partidos jugados por delanteros es: " + promedioDel);
        
        
        
        
        /*
        Jugador jugadorConMasPartidosJugados = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if(jugadorConMasPartidosJugados.getCantPartidosJugados()) < equipo[i].getCantPartidosJugados();
            
        }
        */
        
        //System.out.println("El jugador con mas partidos jugados" + jugadorConMasPartidosJugados);
        
        
        /*
        Persona[] personas = new Persona[3];
        
        personas[0] = new Persona("Juan" , 20);
        personas[1] = new Persona("Pedro" , 30);
        personas[2] = new Persona("Pablo" , 40);
        
        double promedio = 0;
        
        int suma = 0;
        
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            suma =+ personas[i].decimeEdad();
            
        }
        
        promedio = (double) suma / personas.length;
        System.out.println("El promedio de edades es de:" + promedio);
        
        */
        
        /*
        int[] vector;
        vector = new int[3];
        
        vector[0] = 4;
        vector[1] = 5;
        vector[2] = 6;
        
        double promedio = 0;
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        
        promedio = (double)suma / vector.length;
        System.out.println("El promedio es: " + promedio);
        */
    }

    
    
}
