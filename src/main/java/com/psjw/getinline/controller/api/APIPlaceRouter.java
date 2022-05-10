package com.psjw.getinline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

/**
 * packageName : com.psjw.getinline.controller.api
 * fileName : APIPlaceRouter
 * author : psjw
 */
@Configuration
public class APIPlaceRouter {


    @Bean
    public RouterFunction<ServerResponse> placeRouter(APIPlaceHandler apiPlaceHandler){
//        return RouterFunctions.route()
//                .nest(RequestPredicates.path("/api/f/places"), builder -> {
//                    builder.GET("", req -> ServerResponse.ok().body(List.of("place1", "place2")))
//                            .POST("", req -> ServerResponse.ok().body(true))
//                            .GET("/{placeId}", req -> ServerResponse.ok().body("place "+req.pathVariable("pliaceId")))
//                            .PUT("/{placeId}", req -> ServerResponse.ok().body(true))
//                            .DELETE("/{placeId}", req -> ServerResponse.ok().body(true))
//                })
//                .build();

        return RouterFunctions.route()
                .nest(RequestPredicates.path("/api/f/places"), builder -> {
                    builder.GET("", apiPlaceHandler::getPlaces)
                            .POST("", apiPlaceHandler::createPlaces)
                            .GET("/{placeId}", apiPlaceHandler::getPlace)
                            .PUT("/{placeId}", apiPlaceHandler::modifyPlaces)
                            .DELETE("/{placeId}", apiPlaceHandler::removePlaces);
                })
                .build();
    }
}
