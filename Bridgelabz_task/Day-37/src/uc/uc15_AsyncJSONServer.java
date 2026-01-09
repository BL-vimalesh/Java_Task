package uc;

import java.net.http.*;
import java.net.URI;
import java.util.concurrent.*;

public class uc15_AsyncJSONServer {
    private static final HttpClient client = HttpClient.newHttpClient();

    public static CompletableFuture<Void> addEmployeeToServer(String json) {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:3000/employees"))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(json))
            .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenAccept(response -> System.out.println("Response: " + response.body()));
    }

    public static void main(String[] args) {
        String empJson = "{\"id\":1,\"name\":\"Vimalesh\",\"salary\":50000}";
        addEmployeeToServer(empJson).join();
    }
}

