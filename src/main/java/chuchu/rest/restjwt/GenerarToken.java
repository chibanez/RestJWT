package chuchu.rest.restjwt;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import chuchu.rest.beans.DatosLogin;
import chuchu.rest.restjwt.jwt.JWTDemo;

@Path("generarToken")
public class GenerarToken {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public DatosLogin generarToken() {
 	   DatosLogin a = new DatosLogin();
 	   a.setToken(JWTDemo.createJWT("3423938", "SMSV", "Carlos Ibanez", 90000));
 	   System.out.println("TOKEN GENERADO: " + a.getToken());
 	   return a;
    }

}
