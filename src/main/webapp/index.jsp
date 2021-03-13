<html>
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <div style="margin: auto; width: 25%; border: 3px solid #73AD21; padding: 10px;">
            <h2>Uygulamaya Hosgeldin !</h2>
            <form action="/ServletSerializableExample/kaydet" method="post">
                <label for="shapes">Secim Yapiniz</label>

                <select name="sekilTipi" id="shapes" onchange="hideFields()" required>
                    <option value="#">**Secim Yapiniz**</option>
                    <option value="Kare">Kare</option>
                    <option value="Dikdortgen">Dikdortgen</option>
                    <option value="Daire">Daire</option>
                </select>

                <br>
                <label for="kenar1" id="lbl_kenar1" hidden>1. Kenar :</label>
                <input type="text" id="kenar1" name="kenar1" hidden>

                <br>
                <label for="kenar2" id="lbl_kenar2" hidden>2. Kenar :</label>
                <input type="text" id="kenar2" name="kenar2" hidden>

                <br>
                <label for="yaricap" id="lbl_yaricap" hidden>Yaricapi :</label>
                <input type="text" id="yaricap" name="yaricap" hidden>

                <br>
                <input type="submit" value="Ekle" id="button">
                <input type="reset" value="Temizle">
            </form>

        </div>
        <div style="margin: auto; width: 25%; border: 3px solid #FA0000; padding: 10px;">
            <form action="/ServletSerializableExample/listele" method="get">
                <input type="submit" value="Listele" >
            </form>
        </div>
        <script>
            function hideFields() {
                var sekilTipi = document.getElementById("shapes").value;

                if (sekilTipi == "Daire"){
                    document.getElementById("kenar1").style.display="none";
                    document.getElementById("lbl_kenar1").style.display="none";

                    document.getElementById("kenar2").style.display="none";
                    document.getElementById("lbl_kenar2").style.display="none";

                    document.getElementById("yaricap").style.display="block";
                    document.getElementById("lbl_yaricap").style.display="block";
                }
                else if(sekilTipi == "Dikdortgen"){
                    document.getElementById("kenar1").style.display="block";
                    document.getElementById("lbl_kenar1").style.display="block";

                    document.getElementById("kenar2").style.display="block";
                    document.getElementById("lbl_kenar2").style.display="block";

                    document.getElementById("yaricap").style.display="none";
                    document.getElementById("lbl_yaricap").style.display="none";
                }
                else if(sekilTipi == "Kare"){
                    document.getElementById("kenar1").style.display="block";
                    document.getElementById("lbl_kenar1").style.display="block";

                    document.getElementById("kenar2").style.display="none";
                    document.getElementById("lbl_kenar2").style.display="none";

                    document.getElementById("yaricap").style.display="none";
                    document.getElementById("lbl_yaricap").style.display="none";
                }
            }
        </script>
    </body>
</html>
