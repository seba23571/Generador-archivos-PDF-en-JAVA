package org.bootcamp.generarpdf;

import java.util.ArrayList;
import java.util.List;

public class ListasProductos {

    public static List<Productos> listas(){

        List<Productos>     productos = new ArrayList<>();
        productos.add(new Productos("12365844", 3, "vino toro", (float) 65.6, 30));
        productos.add(new Productos("654321", 3, "yerba mate 1kl", (float) 35.1, 15));
        productos.add(new Productos("5897545", 3, "flan chocolate ", (float) 25.2, 12));
        return productos;
    }

    public static String linea1(){
        return"<!DOCTYPE html><html><head><title>supraweb soft</title><style>table, th, td {border: 1px solid black;border-collapse: collapse;}th, td {padding: 3px;}\n" +
                "th {  text-align: center;font-size:10px;}td {  text-align: center;  font-size:9px;a{padding: 5px;}</style></head><body><h2>Factura de Pago</h2>\n" +
                "<br />Factura de venta usuario por usuario  "+
                ":<a style='color:red;' href='https://suprawebsoft.blogspot.com/' target='_blank'><b>&nbsp;"; //+ListasProductos.user()+
    }
    public static String user(){
        return "sebastian";
    }

    public static String linea2(){
        return"</b></a><br /><br /><table style='width:100%'>  <tr><th>codigo de barra </th><th>nombre del prodcuto </th><th>precio de costo </th> <th>Cantidad</th><th>Precios</th></tr>";
        //+datoHtml+
    }

    public static String linea3(){
        return"</table><br /><br />suma total Ventas es :<a style='color:red;'><b> &nbsp; "; //+Double.valueOf(twoDForm.format(sumaTotal))+
    }
    public static String linea4()
    {
        return "</b></a><br /><a target='_blank' href='https://github.com/seba23571/'><img src='clientes.jpg' alt='Trulli' width='350' height='150'/></a></body></html>";
    }

}
