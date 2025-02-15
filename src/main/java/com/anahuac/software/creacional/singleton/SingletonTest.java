package com.anahuac.software.creacional.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        AttendanceManager attendance = new AttendanceManager();

        // Simulacion de pase de lista
        attendance.markAttendance("Carlos Perez", "presente");
        attendance.markAttendance("Ana Gomez", "ausente");
        attendance.markAttendance("Luis Rodriguez", "justificado");
        attendance.markAttendance("Maria Lopez", "ausente");
        attendance.markAttendance("Pedro Sanchez", "presente");

        // Mostrar la lista de asistencia
        attendance.showAttendance();
    }
}
