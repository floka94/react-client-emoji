package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@RequestScoped
@Path("/telegram")
public class TelegramResource {

    @Inject
    @RestClient
    TelegramClient telegramClient;

    @POST
    public Response sendMessage(@QueryParam("chatId") String chatId,
                                @QueryParam("text") String text) {
        return Response.ok(telegramClient.sendMessage(chatId, text)).build();
    }
}
