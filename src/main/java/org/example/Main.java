package org.example;


import org.example.factories.IPaymentGetwayFactory;
import org.example.services.Service;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        IPaymentGetwayFactory factory = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un mode de payement : \n");
        String paymentType = scanner.nextLine();
        // Créer le service avec la factory de passerelle appropriée
        Service service = new Service(factory, paymentType);

        System.out.println("Choisissez votre montant : \n");
        String amount = scanner.nextLine();
        scanner.close();

        service.createPaymentGetway();

        service.processPayment(Double.parseDouble(amount));
    }

}