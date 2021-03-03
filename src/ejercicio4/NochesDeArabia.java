package ejercicio4;

/**
 *
 * @author adrian
 */
public class NochesDeArabia {

    /**
     * @param args ejecucion del programa nochesDeArabia.
     */
    public static void main(String[] args) {

        //Creo la lampara con 4 genios max.
        LamparaMagica miLampara = new LamparaMagica(4);

        System.out.println(" _______  _        _______  ______  _________ _       \n"
                + "(  ___  )( \\      (  ___  )(  __  \\ \\__   __/( (    /|\n"
                + "| (   ) || (      | (   ) || (  \\  )   ) (   |  \\  ( |\n"
                + "| (___) || |      | (___) || |   ) |   | |   |   \\ | |\n"
                + "|  ___  || |      |  ___  || |   | |   | |   | (\\ \\) |\n"
                + "| (   ) || |      | (   ) || |   ) |   | |   | | \\   |\n"
                + "| )   ( || (____/\\| )   ( || (__/  )___) (___| )  \\  |\n"
                + "|/     \\|(_______/|/     \\|(______/ \\_______/|/    )_)");

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        //Froto la lámpara 5 veces.
        Genio miGenio[] = {
            miLampara.rub(2),
            miLampara.rub(3),
            miLampara.rub(4),
            miLampara.rub(5),
            miLampara.rub(1),
       };

        //Imprimimos el genio.
        for (Genio gn : miGenio) {
            System.out.println(gn);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        //Pedimos deseos.
        for (Genio gn : miGenio) {
            gn.concederDeseo();
        }
        
        for (Genio gn : miGenio) {
            gn.concederDeseo();
        }

        //Imprimimos el genio.
        for (Genio gn : miGenio) {
            System.out.println(gn);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        // Metemos el demonio reciclado.
        miLampara.daDemonio((DemonioReciclable) miGenio[2]);

        //Frotamos la lampara con 7 deseos.
        Genio gn = miLampara.rub(7);

        //Imprimimos el resultado del método toString en el nuevo genio gn.
        System.out.println(gn);
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

    }
}
