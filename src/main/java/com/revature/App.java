package com.revature;

import com.revature.controllers.PokemonController;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Starting backend server...");

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/pokemon", new PokemonController());

        server.setExecutor(null);
        server.start();
    }
}

