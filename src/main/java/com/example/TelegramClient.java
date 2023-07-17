package com.example;

import jakarta.json.JsonObject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/test")
@RegisterRestClient(configKey = "telegram-api")
public interface TelegramClient {

    @POST
    JsonObject sendMessage(@QueryParam("chatId") String chatId,
                           @QueryParam("text") String text);

}
