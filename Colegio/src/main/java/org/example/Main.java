package org.example;

public class Main {
    public static void main(String[] args) {
        Alumno a = new Alumno("Carlos",
                "López", (byte) 58);
        Alumno b = new Alumno("María",
                "Agüeyes", (byte) 19);
        Alumno c = new Alumno("Fabio",
                "Cidep", (byte) 24);
        Alumno d = new Alumno("Ismael",
                "Pistolas", (byte) 85);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        Fichero.escribir(a, "alumnos.bin");
        Alumno e = Fichero.leer("alumnos.bin");
        System.out.println("Leido: " + d.getNombre() + " "
                + d.getApellidos() + " " + d.getEdad());
    }
}