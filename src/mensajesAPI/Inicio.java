package mensajesAPI;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do{
            System.out.println("_______________");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensaje");
            System.out.println("3. eliminar mensaje");
            System.out.println("4. editar mensaje");
            System.out.println("6. Salir");

            //leer opción de usuario
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                break;
            }

        }while(opcion != 5);
        }
    }

