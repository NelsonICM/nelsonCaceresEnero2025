package com.anahuac.software.creacional.singleton;

// Singleton Logger para manejar los mensajes con severidad
public class Logger {
    private static Logger instance; // Instancia única

    private Logger() {} // Constructor privado

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Se crea la única instancia si aún no existe
        }
        return instance;
    }

    public void log(String severity, String message) {
        System.out.println(severity.toUpperCase() + ": " + message);
    }
}
