import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class SistemaMinasTennisClub {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Integer> documentos = new ArrayList<>();   ///  sujetos a ser eliminados
    public static ArrayList<String> contraseñas = new ArrayList<>();
    public static ArrayList<String> nombres = new ArrayList<>();
    public static ArrayList<String> roles = new ArrayList<>();   // si es jugador cadie etc

    public static ArrayList<Jugador> jugadores = new ArrayList<>();   ///
    public static ArrayList<CaddieJugador> caddieJugadores = new ArrayList<>();
    public static ArrayList<Caddie> caddies = new ArrayList<>();
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Persona> personas = new ArrayList<>();
    public static ArrayList<Cancha> canchas = new ArrayList<>();

    public static ArrayList<Sede> sedes = new ArrayList<>();
    public static String[] TipoCancha = new String[]{"Cancha", "Mini Cancha", "Muro"};


    public static void main(String[] args) {

//
//        Persona persona1 = new Persona("duvan", 52, 312425, 147852369, "1", "25852741258", "Profesor");
//        personas.add(persona1);
//        Persona persona2 = new Persona("duvan2", 52, 312425, 147852369, "1", "25852741258", "Profesor");
//        personas.add(persona2);
//        Persona persona3 = new Persona("duvan3", 524443, 312425, 147852369, "1", "25852741258", "Profesor");
//        personas.add(persona3);
//        Persona persona4 = new Persona("duvan4", 524443, 312425, 147852369, "1", "25852741258", "Profesor");
//        personas.add(persona4);



//        AregarCancha();
//        CanchaDisponible();
//        FechaMañana();


        // canchas predeterminadas
//        Cancha cancha1 = new Cancha("1", "Cancha", true, 1,ciudades[0], sedesMedellin[0]);
//        Cancha cancha2 = new Cancha("2", "Mini Cancha", true, 2,ciudades[0], sedesMedellin[0]);
//        Cancha cancha3 = new Cancha("3", "Cancha", true, 3,ciudades[1], sedesBogota[0]);
//        canchas.add(cancha1);
//        canchas.add(cancha2);
//        canchas.add(cancha3);


        String option;

        while (true) {
            System.out.println("============================================");
            System.out.println("Bienvenido al sistema de Minas Tennis Club");
            System.out.println("Escoja una opción: ");
            System.out.println("1. Ingresar");
            System.out.println("2. Registrarse");
            System.out.println("3. Cambiar contraseña");
            System.out.println("4. Salir");

            System.out.println();

            option = input.next();

            if (option.equals("1")) {
                ingresar();
            } else if (option.equals("2")) {
                registrarse();
            } else if (option.equals("3")) {
                cambiarContraseña();
            } else if (option.equals("4")) {
                break;
            }
        }


    }


    private static void ingresar() {

        //for (int i = 0; i < personas.size(); i++) { System.out.println(personas.get(i)); }

        System.out.println("Ingresa su documento");
        int documento = input.nextInt();


        if (VerificarUsuario(documento)) {
            System.out.println("Ingresa la contraseña");
            String contraseña = input.next();
            if (VerificarContraseña(contraseña, documento)) {
                System.out.println("Acceso permitido");

                System.out.println("Bienvenido + jugar caddie");

            } else {
                System.out.println("Error!!!!!!!!!!, contraseña incorrecta");
            }
        } else {
            System.out.println(documento + " No es un usuario correcto");
        }


        // Comprobar si existe el usuario en caso de que no dirigir al menú de registrarse con el mensaje "Usted aún no está registrado".
        // Si existe el usuario, desplegar un menú con los métodos del rol del usuario (Caddie, Jugador, Profesor,...


    }


    private static void registrarse() {

        System.out.println("Dígite su documento");
        int documento = input.nextInt();

        if (documento > 1000000) {
            System.out.println();
        } else {
            System.out.println("Documento incorrecto");
            return;
        }


        if (VerificarUsuario(documento)) {
            System.out.println("El usuario " + documento + " ya Existente");
            System.out.println();
            return;
        }

        // cambiando el coduento a string para ser comparable con la contraseña
        String contraseña1 = null;
        System.out.println("Digite una contraseña segura");
        System.out.println("Diferente al ocumento y comommimino 8 caracteres");

        contraseña1 = input.next();
        String d = String.valueOf(documento);

        // La contraseña esta condicionada a un mínimo de 8 caracteres y además que sea difenete al documento

        if (!(d.equals(contraseña1)) & contraseña1.length() > 8) {
            contraseñas.add(contraseña1);
            System.out.println("Contraseña segura");

        } else {
            System.out.println("Contrseña incorrecta");
            return;
        }
        System.out.println("Escribe de nuevo la contraseña");
        String contraseña2 = input.next();
        if (!contraseña1.equals(contraseña2)) {
            System.out.println("Las Contraseñas no coinsiden ");
            return;
        }

        String contraseña = contraseña1;


        System.out.println("Digite su edad");
        int edad = input.nextInt();
        System.out.println("Digite su teléfono");
        int telefono = input.nextInt();
        System.out.println("Digite su nombre");
        String nombre = input.next();


        System.out.println("¿Cuál es su categoría?");
        System.out.println("0. Principinate");
        System.out.println("1. Primera");
        System.out.println("2. Intermedia");
        System.out.println("3. Segunda");
        System.out.println("4. Tercera");
        System.out.println("5. Cuarta");
        System.out.println("6. Quinta");


        String option;
        option = input.next();
        String categoria = null;

        while (true) {
            if (option.equals("1")) {
                categoria = "Primera";
            } else if (option.equals("2")) {
                categoria = "Intermedia";
            } else if (option.equals("3")) {
                categoria = "Segunda";
            } else if (option.equals("4")) {
                categoria = "Tercera";
            } else if (option.equals("5")) {
                categoria = "Cuarta";
            } else if (option.equals("6")) {
                categoria = "Quinta";
            } else if (option.equals("0")) {
                categoria = "Principiante";
            } else {
                System.out.println("Ingresó una categoría no valida");

            }
            break;
        }

        System.out.println("¿Cúal es su relación con Minas Tennis Club");
        System.out.println("1. Jugador");
        System.out.println("2. Profesor");
        System.out.println("3. Caddie");
        System.out.println("4. Caddie Jugador");
        option = input.next();

        // Según el rol que seleccione se debe desplegar otro menú que solicite al usuario cada una de las instancias propias de él

        if (option.equals("1")) {
            String rol = "Jugador";
            System.out.println("¿Hace usted parte de la escuela de tennis?");
            System.out.println("1. Si");
            System.out.println("2. No");

            option = input.next();
            boolean escuela;
            if (option.equals("1")) {
                escuela = true;
            } else if (option.equals("2")) {
                escuela = false;
            } else {
                System.out.println("Respuesta no valida");
                return;
            }
            System.out.println("¿Está usted en alguna competecia de tennis?");
            System.out.println("1. Si");
            System.out.println("2. No");
            option = input.next();
            boolean competencia;
            if (option.equals("1")) {
                competencia = true;
            } else if (option.equals("2")) {
                competencia = false;
            } else {
                System.out.println("Respuesta no valida");
                return;
            }

            System.out.println("Ingresa ciuad");
            String ciuad = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

            int optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                ciuad = sedes.get(optionInt).ciudad;

            }else {
                System.out.println("Dato no valido");
                return; }

            System.out.println("Ingresa Sede");
            String nombreSede = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

           optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                nombreSede = sedes.get(optionInt).nombre;

            }else {
                System.out.println("Dato no valido");
                return;
            }


            Sede sede = new Sede(nombreSede, ciuad);
            sedes.add(sede);
            Jugador jugador = new Jugador(nombre, edad, telefono, documento, categoria, contraseña, escuela, competencia, rol);
            jugadores.add(jugador);

            Persona persona = new Persona(nombre, sede, edad, telefono, documento, categoria, contraseña, rol);
            personas.add(persona);

        } else if (option.equals("2")) {
            String Rol = "Profesor";   //------------
            boolean libre = true;
            System.out.println("Seleccione su horario de trabajo");
            System.out.println("1. Lunes a sábado de 6:00am a 2:00pm");
            System.out.println("2. Lunes a sábado de 2:00pm a 10:00pm");

            option = input.next();
            String horario = null;
            if (option.equals("1")) {
                horario = "Lunes a sábado de 6:00am a 2:00pm";
            } else if (option.equals("2")) {
                horario = "Lunes a sábado de 2:00pm a 10:00pm";
            } else {
                System.out.println("Ingresó un horario no valido");
            }

            System.out.println("Ingresa ciuad");
            String ciuad = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

            int optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                ciuad = sedes.get(optionInt).ciudad;

            }else {
                System.out.println("Dato no valido");
                return;
            }

            System.out.println("Ingresa Sede");
            String nombreSede = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

            optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                nombreSede = sedes.get(optionInt).nombre;

            }else {
                System.out.println("Dato no valido");
                return;
            }

            Sede sede = new Sede(nombreSede, ciuad);
            Profesor profesor = new Profesor(nombre, edad, telefono, documento, categoria, contraseña, horario, Rol, libre);
            profesores.add(profesor);

            Persona persona = new Persona(nombre, sede, edad, telefono, documento, categoria, contraseña, Rol);
            personas.add(persona);
        } else if (option.equals("3")) {
            String rol = "Caddie";
            System.out.println("Seleccione su horario de trabajo");
            System.out.println("1. Lunes a sábado de 6:00am a 2:00pm");
            System.out.println("2. Lunes a sábado de 2:00pm a 10:00pm");

            option = input.next();
            String horario = null;
            if (option.equals("1")) {
                horario = "Lunes a sábado de 6:00am a 2:00pm";
            } else if (option.equals("2")) {
                horario = "Lunes a sábado de 2:00pm a 10:00pm";
            } else {
                System.out.println("Ingresó un horario no valido");
            }
            //Cancha cancha = new Cancha(null, null, false,);
            //Caddie caddie = new Caddie(nombre, edad, telefono, documento, categoria, contraseña, horario, cancha, rol);
           // caddies.add(caddie);
        } else if (option.equals("4")) {
            String Rol = "Caddie Jugador";
            System.out.println("Seleccione su horario de trabajo");
            System.out.println("1. Lunes a sábado de 6:00am a 2:00pm");
            System.out.println("2. Lunes a sábado de 2:00pm a 10:00pm");

            option = input.next();
            String horario = null;
            if (option.equals("1")) {
                horario = "Lunes a sábado de 6:00am a 2:00pm";
            } else if (option.equals("2")) {
                horario = "Lunes a sábado de 2:00pm a 10:00pm";
            } else {
                System.out.println("Ingresó un horario no valido");
            }


            System.out.println("Ingresa ciuad");
            String ciuad = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

            int optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                ciuad = sedes.get(optionInt).ciudad;

            }else {
                System.out.println("Dato no valido");
                return;
            }

            System.out.println("Ingresa Sede");
            String nombreSede = null;
            for (int i = 0; i < sedes.size(); i++) {
                System.out.println(i+". "+sedes.get(i).ciudad);
            }

            optionInt = input.nextInt();

            if (optionInt <sedes.size()){
                nombreSede = sedes.get(optionInt).nombre;

            }else {
                System.out.println("Dato no valido");
                return;
            }

            Sede sede = new Sede(nombreSede, ciuad);

            CaddieJugador caddieJugador = new CaddieJugador(nombre, edad, telefono, documento, categoria, contraseña, horario, Rol);
            caddieJugadores.add(caddieJugador);

            Persona persona = new Persona(nombre,sede, edad, telefono, documento, categoria, contraseña, Rol);
            personas.add(persona);
        }
    }

    private static void cambiarContraseña() {
        System.out.println("Digite su documento");
        // Se debe verificar que el usuario exista en la base de datos
        int documento = input.nextInt();

        System.out.println("Ingrese su contraseña actual");
        String contraseña = input.next();
        // Se debe verificar que la contraseña coincida.
        System.out.println("Ingrese su nueva contraseña");
        String contraseñaNueva = input.next();
        System.out.println("Verifique su nueva contraseña");
        String verificacion = input.next();
        if (contraseñaNueva != verificacion) {
            System.out.println("Las contraseñas ingresadas no coinciden");
        } else {
            System.out.println("Cambio de contraseña exitoso");
        }

    }


    private static boolean VerificarUsuario(int documento) {

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDocumento() == documento) {
                // indice ddonde esta el usuario
                return true;
            }
        }


        return false;
    }


    private static boolean VerificarContraseña(String contraseña, int documento) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).documento == documento & personas.get(i).documento == documento) {
                // indice ddonde esta el usuario
                return true;
            }
        }


        return false;
    }


    private static void AregarCancha() {


        System.out.println("Ingresa ciuad");
        String ciuad = null;
        for (int i = 0; i < sedes.size(); i++) {
            System.out.println(i+". "+sedes.get(i).ciudad);
        }

        int optionInt = input.nextInt();

        if (optionInt <sedes.size()){
            ciuad = sedes.get(optionInt).ciudad;

        }else {
            System.out.println("Dato no valido");
            return; }

        System.out.println("Ingresa Sede");
        String nombreSede = null;
        for (int i = 0; i < sedes.size(); i++) {
            System.out.println(i+". "+sedes.get(i).ciudad);
        }

        optionInt = input.nextInt();

        if (optionInt <sedes.size()){
            nombreSede = sedes.get(optionInt).nombre;

        }else {
            System.out.println("Dato no valido");
            return;
        }


        Sede sede = new Sede(nombreSede, ciuad);
        sedes.add(sede);



        System.out.println("Ingrese el tipo de cancha");

        System.out.println("1. " + TipoCancha[0]);
        System.out.println("2. " + TipoCancha[1]);
        System.out.println("3. " + TipoCancha[2]);

        String tipo = null;

        String option = input.next();

        if (option.equals("1")) {
            tipo = TipoCancha[0];
        } else if (option.equals("2")) {
            tipo = TipoCancha[1];
        } else if (option.equals("3")) {
            tipo = TipoCancha[2];
        } else {
            System.out.println("Valor invalido");
            return;

        }




        boolean libre = true;

        String turnos = null;    // Que es turnos?



        int id = canchas.size() + 1;

        Cancha cancha = new Cancha(turnos, tipo, libre, id,sede);
        System.out.println("" +
                "Cancha Registrada" +
                "=====================");

        canchas.add(cancha);


    }


    private static void CanchaDisponible() {

        System.out.println("Las Canchas disponibles son: ");

        for (int i = 0; i < canchas.size(); i++) {
            if (canchas.get(i).libre) {
                System.out.println("Cancha Nº: " + canchas.get(i).id + ", Tipo: " + canchas.get(i).tipo);
            }

        }


    }

    public static void FechaMañana() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
        Calendar c = Calendar.getInstance();

        //Number of Days to add
        c.add(Calendar.DAY_OF_MONTH, 1);
        //Date after adding the days to the given date
        String newDate = sdf.format(c.getTime());
        //Displaying the new Date after addition of Days
        System.out.println(newDate);
    }


    private static void Busquda() {

        System.out.println("Buscar por: ");

        System.out.println("1. Ciudad");
        System.out.println("2. Sede");
        System.out.println("3. Cancha");
        System.out.println("5. Rol");

        String option = input.next();

        if (option.equals(1)){
            System.out.println("1. Valor exacto");
            System.out.println("2. Valor sin considerar mayúsculas");
            String option2 = input.next();
            if (option2.equals(1)){
                System.out.println("Ingresa el Nombre de la ciudad");
                String ciudad = input.next();
                int k;
                for (int i = 0; i < sedes.size(); i++) {
                    if (sedes.get(i).ciudad.equals(ciudad)){
                        System.out.println("Ciudad Encontrada");
                         k = i;
                         resumeCiudad(ciudad);
                        break;
                    }
                    }
                }else if(option.equals(2)){
                System.out.println("Ingresa el Nombre de la ciudad");
                String ciudad = input.next();
                ciudad = ciudad.toLowerCase();
                int k;
                for (int i = 0; i < sedes.size(); i++) {
                    if (sedes.get(i).ciudad.toLowerCase().equals(ciudad)){
                        System.out.println("Ciudad Encontrada");
                        k = i;
                        resumeCiudad(ciudad);
                        break;
                    }
                }

            }
        } else if(option.equals(2)){


        }





        System.out.println("1. Edad");
        System.out.println("2. Telefono");
        System.out.println("3. Rol");



        if (option.equals("1")) {
            System.out.println("Encontrar: ");

            System.out.println("1. Mayor edad");
            System.out.println("2. Menor edad");
            System.out.println("3. Rango de edad");
            String option2 = input.next();

            if (option2.equals("1")) {
                int edad = 0;
                int k = 0;
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).getEdad() > edad) {
                        edad = personas.get(i).getEdad();
                        k = i;
                    }


                }
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(k).getEdad() == personas.get(i).getEdad()) {
                        System.out.println(personas.get(i));
                    }
                }

            } else if (option2.equals("2")) {
                int edad = 10000;
                int k = 0;
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(i).getEdad() < edad) {
                        edad = personas.get(i).getEdad();
                        k = i;
                    }

                }
                for (int i = 0; i < personas.size(); i++) {
                    if (personas.get(k).getEdad() == personas.get(i).getEdad()) {
                        System.out.println(personas.get(i));
                    }
                }
            } else if (option.equals("3")) {
                System.out.println("el ango de edad es: ");
            } else {

            }
        } else if (option.equals("2")) {
                System.out.println("  ");

        } else if (option.equals("3")) {

        } else {
                System.out.println("Valor invalido");

        }
    }

    public static void resumeCiudad(String ciudad){
        int numeroSedes=0;
        int numeroCanchas=0;
        int canchao=0;
        int cancha1=0;
        int cancha2=0;
        for (int i = 0; i < sedes.size(); i++) {
            if (sedes.get(i).ciudad.equals(ciudad)){
                numeroSedes++;

            }

        }

        for (int i = 0; i < canchas.size(); i++) {
         if(canchas.get(i).sede.ciudad.equals(ciudad)){
             numeroCanchas++;
             if (canchas.get(i).tipo.equals(TipoCancha[0])){
                 canchao++;
             } else if(canchas.get(i).tipo.equals(TipoCancha[1])){
                 cancha1++;
             }else if(canchas.get(i).tipo.equals(TipoCancha[2])){
                 cancha2++;
             }
         }
        }

        System.out.println("En la ciudad de "+ciudad+" Hay:");
        System.out.println("* "+numeroSedes+" sedes");
        System.out.println("* "+cancha1+cancha2+canchao+ " canchas");

        System.out.println("   * "+canchao+" de tipo "+TipoCancha[0]);
        System.out.println("   * "+cancha1+" de tipo "+TipoCancha[1]);
        System.out.println("   * "+cancha2+" de tipo "+TipoCancha[2]);
    }



}



