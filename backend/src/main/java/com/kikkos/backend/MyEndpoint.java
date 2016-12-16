/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.kikkos.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.kikkos.JokeProvider;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.kikkos.com",
                ownerName = "backend.kikkos.com",
                packagePath = ""
        )
)
public class MyEndpoint {


    @ApiMethod
    public MyJoke getJoke() {
        MyJoke response = new MyJoke();
        JokeProvider provider = new JokeProvider();
        response.setData(provider.getJoke());

        return response;
    }

}
