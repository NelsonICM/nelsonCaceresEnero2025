package com.anahuac.software.creacional.singleton;

import java.util.HashMap;
import java.util.Map;

// Clase que maneja la asistencia de alumnos
public class AttendanceManager {
    private Map<String, String> attendanceList;
    private Logger logger;

    public AttendanceManager() {
        attendanceList = new HashMap<>();
        logger = Logger.getInstance(); // Se obtiene la única instancia del Logger
    }

    public void markAttendance(String student, String status) {
        attendanceList.put(student, status);

        switch (status.toLowerCase()) {
            case "presente":
                logger.log("INFO", "Alumno " + student + " está presente.");
                break;
            case "ausente":
                logger.log("ERROR", "Alumno " + student + " está ausente.");
                break;
            case "justificado":
                logger.log("WARNING", "Alumno " + student + " tiene falta justificada.");
                break;
            default:
                logger.log("ERROR", "Estado desconocido para " + student + ": " + status);
        }
    }

    public void showAttendance() {
        System.out.println("\nResumen de asistencia:");
        for (Map.Entry<String, String> entry : attendanceList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
