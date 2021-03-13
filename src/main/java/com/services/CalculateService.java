package com.services;

import com.enums.EnumSekilTipi;
import com.shapes.Daire;
import com.shapes.Dikdortgen;
import com.shapes.Kare;
import com.shapes.Sekil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class CalculateService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sekilTipi = req.getParameter("sekilTipi");

        Sekil daire;
        Sekil dikdortgen;
        Sekil kare;

        if (sekilTipi != null || sekilTipi != "") {

            List<Sekil> sekilList = new ArrayList<Sekil>();
            IOService ioService = new IOService();
            sekilList = ioService.readSekilList();

            // DAIRE
            if (EnumSekilTipi.Daire.toString().equals(sekilTipi)) {
                double yaricap = 0;

                if (req.getParameter("yaricap") != "") {
                    yaricap = Double.parseDouble(req.getParameter("yaricap"));
                    daire = new Daire(yaricap);

                    sekilList.add(daire);
                    ioService.writeSekilList(sekilList);

                } else {
                    resp.getWriter().write("<html><body>Yaricap girilmedi<body></html>");
                }

            //DIKDORTGEN
            } else if (EnumSekilTipi.Dikdortgen.toString().equals(sekilTipi)) {
                double kenar1 = 0;
                double kenar2 = 0;
                if (req.getParameter("kenar1") != "" && req.getParameter("kenar2") != "") {
                    kenar1 = Double.parseDouble(req.getParameter("kenar1"));
                    kenar2 = Double.parseDouble(req.getParameter("kenar2"));
                    dikdortgen = new Dikdortgen(kenar1, kenar2);

                    sekilList.add(dikdortgen);
                    ioService.writeSekilList(sekilList);

                } else {
                    resp.getWriter().write("<html><body>Kenar 1 , Kenar 2 girilmedi <body></html>");
                }

            }
            //KARE
            else if(EnumSekilTipi.Kare.toString().equals(sekilTipi)) {

                double kenar1 = 0;

                if (req.getParameter("kenar1") != "") {
                    kenar1 = Double.parseDouble(req.getParameter("kenar1"));
                    kare = new Kare(kenar1);

                    sekilList.add(kare);
                    ioService.writeSekilList(sekilList);
                }
                else {
                    resp.getWriter().write("<html><body>Kenar 1 girilmedi<body></html>");
                }
            }

            resp.sendRedirect(req.getContextPath());
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Sekil> sekilList = new ArrayList<Sekil>();
        IOService ioService = new IOService();
        sekilList = ioService.readSekilList();

        String sonuc="";
        for (Sekil sekil:sekilList){
            sonuc += "<span>"+sekil.toString() + "<span><br>";
        }
        resp.getWriter().write("<html><body>"+sonuc+"</body></html>");
    }
}
