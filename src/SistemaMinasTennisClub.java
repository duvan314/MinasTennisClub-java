import java.util.Scanner;
import java.util.ArrayList;

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


    public static void main(String[] args) {
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

        System.out.println("Ingresa su documento");
        int documento = input.nextInt();

        if (VerificarUsuario(documento)) {
            System.out.println("Ingresa la contraseña");
            String contraseña = input.next();
            if (VerificarContraseña(contraseña, documento)){
                System.out.println("acceso permitido");

                System.out.println("Bienvenido");

            }else {
                System.out.println("error!!!!!!!!!!, contraseña incorrecta");
            }
        } else{
            System.out.println(documento+" No es un usuario correcto");
        }


        // Comprobar si existe el usuario en caso de que no dirigir al menú de registrarse con el mensaje "Usted aún no está registrado".
        // Si existe el usuario, desplegar un menú con los métodos del rol del usuario (Caddie, Jugador, Profesor,...


    }


    private static void registrarse() {

        System.out.println("Dígite su documento");
        int documento = input.nextInt();

        if (VerificarUsuario(documento)){
            System.out.println("El usuario "+documento+" ya Existente");
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
        if(!contraseña1.equals(contraseña2)){
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
            Jugador jugador = new Jugador(nombre, edad, telefono, documento, categoria, contraseña, escuela, competencia, rol);
            jugadores.add(jugador);
            String Rol = "Jugador";
            Persona persona = new Persona(nombre, edad, telefono, documento, categoria, contraseña, Rol);
            personas.add(persona);
        } else if (option.equals("2")) {
            String rol = "Profesor";   //------------
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

            Profesor profesor = new Profesor(nombre, edad, telefono, documento, categoria, contraseña, horario, rol );
            profesores.add(profesor);
            String Rol = "Profesor";
            Persona persona = new Persona(nombre, edad, telefono, documento, categoria, contraseña, Rol);
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
            Cancha cancha = new Cancha(null, null);
            Caddie caddie = new Caddie(nombre, edad, telefono, documento, categoria, contraseña, horario, cancha, rol);
            caddies.add(caddie);
        } else if (option.equals("4")) {
            String rol = "Caddie Jugador";
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
            CaddieJugador caddieJugador = new CaddieJugador(nombre, edad, telefono, documento, categoria, contraseña, horario, rol);
            caddieJugadores.add(caddieJugador);
            String Rol = "Caddie Jugador";
            Persona persona = new Persona(nombre, edad, telefono, documento, categoria, contraseña, Rol);
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
            if (personas.get(i).documento == documento) {
                // indice ddonde esta el usuario
                return true;
            }
        }


        return false;
    }


    private static boolean  VerificarContraseña(String contraseña, int documento) {

        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).documento == documento & personas.get(i).documento==documento) {
                // indice ddonde esta el usuario
                return true;
            }
        }


        return false;
    }

}

