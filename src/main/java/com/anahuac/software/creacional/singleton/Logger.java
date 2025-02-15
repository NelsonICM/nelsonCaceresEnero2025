package com.anahuac.software.creacional.singleton;

// Singleton Logger para manejar los mensajes con severidad
public class Logger {
    private static Logger instance; // Instancia unica

    private Logger() {} // Constructor privado

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Se crea la unica instancia si aun no existe
        }
        return instance;
    }

    public void log(String severity, String message) {
        System.out.println(severity.toUpperCase() + ": " + message);
    }
}
