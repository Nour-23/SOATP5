package serveur;

import jakarta.xml.ws.Endpoint;

import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8084/BanqueService";
        BanqueService banqueService = new BanqueService();

        // Publiez le service à l'URL spécifiée
        Endpoint.publish(url, banqueService);

        System.out.println("Service web CalculatriceWS publié à l'adresse : " + url);
    }
}