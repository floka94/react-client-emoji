package com.example;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/test")
public class TelegramTestResource {

    @POST
    public void test(@QueryParam("chatId") String chatId,
                     @QueryParam("text") String text) {
        System.out.println(chatId);
        System.out.println(text);
    }
}
