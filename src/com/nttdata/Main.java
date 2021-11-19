package com.nttdata;

import com.nttdata.controller.ListController;

public class Main {

    public static void main(String[] args) {

        ListController listController = new ListController();
        listController.generateList();
        System.out.println("La lista generada de 50 numeros aleatorios queda: \n");
        System.out.println(listController.toString());

        //Comparar lista
        System.out.println("La lista anterior contiene elementos repetidos: " + listController.compareList(listController.getList()));

        //Enviar lista y retornar lista nueva sin elementos repetidos
        System.out.println("La lista nueva sin elementos repetidos queda: ");
        System.out.println(listController.onlyList(listController.getList()));


    }
}
