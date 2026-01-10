package uc;

import java.io.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class uc15_AsyncCSV {
    private static final ExecutorService executor = Executors.newFixedThreadPool(2);

    public static CompletableFuture<Void> addEmployeeToCSV(String line) {
        return CompletableFuture.runAsync(() -> {
            try {
                Files.write(Paths.get("employees.csv"), (line + "\n").getBytes(),
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                System.out.println("Employee added to CSV");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, executor);
    }

    public static CompletableFuture<Void> readEmployeesFromCSV() {
        return CompletableFuture.runAsync(() -> {
            try {
                String data = Files.readString(Paths.get("employees.csv"));
                System.out.println("CSV Data:\n" + data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, executor);
    }

    public static void main(String[] args) {
        addEmployeeToCSV("1,Vimalesh,50000")
            .thenRun(() -> readEmployeesFromCSV());
        executor.shutdown();
    }
}

