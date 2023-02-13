package models;

public class Restapi {

    public Restapi() {
    
    }

    public void getEmployees() {
        HttpClient httpClient = new HttpClient();
        String host = "http://localhost:3000/";
        String endpoint = "employees";
        String urlStr = host + endpoint;
        String res = httpClient.get(urlStr);
        System.out.println(res);
    }
    
}
