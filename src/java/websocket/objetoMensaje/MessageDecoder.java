/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket.objetoMensaje;

import dto.Mensaje;
import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import com.google.gson.Gson;

public class MessageDecoder implements Decoder.Text<Mensaje> {

    private static Gson gson = new Gson();

    @Override
    public Mensaje decode(String s) throws DecodeException {
        Mensaje message = gson.fromJson(s, Mensaje.class);
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public void destroy() {
        // Close resources
    }
}