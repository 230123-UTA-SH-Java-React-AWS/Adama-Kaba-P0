package com.revature.controllers;

import com.revature.service.PokemonService;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class PokemonController implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        // TODO Auto-generated method stub
        String verb = exchange.getRequestMethod();

        //PUT - 3, updating
        //POST - infinite, create a new resource
        switch (verb) {
            case "GET":
                getRequest(exchange);
                break;
            case "POST":
                postRequest(exchange);
                break;

            default:
                break;
        }

        System.out.println();
    }

    private void getRequest(HttpExchange exchange) throws IOException {
        PokemonService serv = new PokemonService();
        String jsonCurrentList = serv.getAllPokemon();

        exchange.sendResponseHeaders(200, jsonCurrentList.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(jsonCurrentList.getBytes());
        os.close();
    }

    /*
        Javelin
        HttpClient - library
    */

    private void postRequest(HttpExchange exchange) throws IOException {

        //InputStream has a bunch of bytes
        InputStream is = exchange.getRequestBody();

        //We need to convert the InputStream into String
        //StringBuilder is like a mutable version of a String
        StringBuilder textBuilder = new StringBuilder();

        //Converts our binary into letters
        //try_resource block will automatically close the resource within the parenthesis
        try (Reader reader = new BufferedReader(new InputStreamReader(is, Charset.forName(StandardCharsets.UTF_8.name())))) {
            int c = 0;

            //read() method from BufferReader will give a -1 once there is no more letters left
            //TLDR keep reading each letter until there is no more left
            while ((c = reader.read()) != -1) {
                //Adds the letter to your text
                textBuilder.append((char) c);
            }
        }

        exchange.sendResponseHeaders(200, textBuilder.toString().getBytes().length);

        //Don't forget to call on the service layer and execute the method
        PokemonService pokeService = new PokemonService();
        pokeService.saveToPokeBox(textBuilder.toString());

        OutputStream os = exchange.getResponseBody();
        os.write(textBuilder.toString().getBytes());
        os.close();
    }

}

