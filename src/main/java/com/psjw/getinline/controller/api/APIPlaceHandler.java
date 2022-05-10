package com.psjw.getinline.controller.api;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;
import java.util.List;

/**
 * packageName : com.psjw.getinline.controller.api
 * fileName : APIPlaceHandler
 * author : psjw
 */
@Component
public class APIPlaceHandler {

    public ServerResponse getPlaces(ServerRequest request) throws Exception {
        return ServerResponse.ok().body(List.of("place1", "place2"));
    }


    public ServerResponse createPlaces(ServerRequest request) throws Exception {
        // TODO: 1은 구현할때 제대로 처리
        return ServerResponse.created(URI.create("/api/f/places/1")).body(true);
    }

    public ServerResponse getPlace(ServerRequest request) throws Exception {
        return ServerResponse.ok().body("place " + request.pathVariable("placeId"));
    }

    public ServerResponse modifyPlaces(ServerRequest request) throws Exception {
        return ServerResponse.ok().body(true);
    }

    public ServerResponse removePlaces(ServerRequest request) throws Exception {
        return ServerResponse.ok().body(true);
    }

}
