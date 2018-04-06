import ballerina/http;
import ballerina/io;
import ballerina/auth;

endpoint http:ApiEndpoint ep {
    port:9090
};

@http:ServiceConfig {
      basePath:"/echo"
}

@auth:Config {
    authentication:{enabled:true},
    scopes:["xxx"]
}
service<http:Service> echo bind ep {
    @http:ResourceConfig {
        methods:["GET"],
        path:"/test"
    }
    @auth:Config {
        scopes:["scope2", "scope4"]
    }
    echo (endpoint client, http:Request req) {
        http:Response res = new;
        _ = client -> respond(res);
    }
}
