package org.bootcamp.generarpdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class GenararPdf {
    public static void main(String[] args) {
        String todoElHtml = "";
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        twoDForm.setDecimalFormatSymbols(dfs);

        String datoHtml = "";
        float sumaTotal = 0;

        for (Productos next : ListasProductos.listas()) {
            System.out.println(" " + next.getCodigobarra());
            System.out.println(" " + next.getCantidad_productos());
            System.out.println(" " + next.getNombre());
            System.out.println("getPrecios " + next.getPrecios());
            System.out.println(" " + next.getPreciocosto());
            sumaTotal += next.getPrecios();
            datoHtml += "<tr><td>" + next.getCodigobarra() + "</td><td>" + next.getNombre() + "</td> <td>" + next.getPreciocosto() + "</td>   <td>" + next.getCantidad_productos() + "</td> <td>" + next.getPrecios() + "</td>  </tr> ";

        }

        try {
            OutputStream file = new FileOutputStream(new File("FacturaVenta.pdf"));
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, file);
            StringBuilder htmlString = new StringBuilder();

            StringBuilder append2 = htmlString.append(ListasProductos.linea1() + ListasProductos.user() + ListasProductos.linea2() + datoHtml + ListasProductos.linea3() + Double.valueOf(twoDForm.format(sumaTotal))
                    + ListasProductos.linea4());

            document.open();
            InputStream is = new ByteArrayInputStream(append2.toString().getBytes());
            XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
            document.close();
            file.close();


        } catch (DocumentException | IOException | NumberFormatException e) {
            e.printStackTrace();
        }


    }
}
