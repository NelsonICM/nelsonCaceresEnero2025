package com.anahuac.software.creacional.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        AttendanceManager attendance = new AttendanceManager();

        // Simulación de pase de lista
        attendance.markAttendance("Carlos Pérez", "presente");
        attendance.markAttendance("Ana Gómez", "ausente");
        attendance.markAttendance("Luis Rodríguez", "justificado");
        attendance.markAttendance("María López", "ausente");
        attendance.markAttendance("Pedro Sánchez", "presente");

        // Mostrar la lista de asistencia
        attendance.showAttendance();
    }
}
