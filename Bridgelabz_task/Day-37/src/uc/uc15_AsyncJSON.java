package uc;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.databind.*;

public class uc15_AsyncJSON {
    private static final ExecutorService executor = Executors.newFixedThreadPool(2);
    private static final ObjectMapper mapper = new ObjectMapper();

    public static CompletableFuture<Void> addEmployeeToJSON(Map<String,Object> emp) {
        return CompletableFuture.runAsync(() -> {
            try {
                File file = new File("employees.json");
                List<Map<String,Object>> employees = new ArrayList<>();
                if (file.exists()) {
                    employees = Arrays.asList(mapper.readValue(file, Map[].class));
                    employees = new ArrayList<>(employees);
                }
                employees.add(emp);
                mapper.writeValue(file, employees);
                System.out.println("Employee added to JSON file");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }, executor);
    }

    public static void main(String[] args) {
        Map<String,Object> emp = Map.of("id",1,"name","Vimalesh","salary",50000);
        addEmployeeToJSON(emp).join();
        executor.shutdown();
    }
}

