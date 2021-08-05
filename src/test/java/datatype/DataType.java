package datatype;

import io.cucumber.java.DataTableType;
import models.Request;
import models.body.AuthorizationBody;

import java.util.Map;


public class DataType {

    @DataTableType
    public Request request(Map<String,String> datos){
        AuthorizationBody authorizationBody = new AuthorizationBody(datos.get("usuario"),datos.get("contrasena"));
        return new Request(datos.get("url"),authorizationBody,datos.get("respuestaEsperada"));
    }

}
