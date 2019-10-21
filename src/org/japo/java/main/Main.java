/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        //Variables
        int caramelos;
        int caramelosSueltos;
        int bolsas;
        double precioBolsa;
        double precioCaramelos;
        double precioSin;
        double iva;
        double precioCon;

        System.out.println("CARAMELOS PARA BAUTIZOS");
        System.out.printf("=============================%n");
        //Operaciones
        try {
            //Entrada de datos
            System.out.printf("%nCantidad de caramelos ...: ");
            caramelos = SCN.nextInt();
            //Bolasas y caramelos
            bolsas = caramelos / 100;
            caramelosSueltos = caramelos % 100;
            
            System.out.printf("%nBolsas completas ........: %d%n", bolsas);
            System.out.printf("Caramelos sueltos .......: %d%n", caramelosSueltos);
            //Precio sin IVA
            precioBolsa = bolsas * 5;
            precioCaramelos = caramelosSueltos * 0.07;
            
            System.out.printf(Locale.ENGLISH,"%nImporte bolsas ..........:  %.2f€%n", precioBolsa);
            System.out.printf(Locale.ENGLISH,"Importe suelto ..........:  %.2f€%n", precioCaramelos);
            
            //Precio con IVA
            precioSin = precioBolsa + precioCaramelos;
            System.out.printf(Locale.ENGLISH,"%nImporte previo ..........:  %.2f€%n", precioSin);
            
            iva = precioSin * 0.21;
            System.out.print("IVA ( 21% ) .............:");
            System.out.printf(Locale.ENGLISH,"  %.2f€%n", iva);
            
            precioCon = precioSin + iva;
            System.out.printf(Locale.ENGLISH,"%nImporte PVP .............:  %.2f€%n", precioCon);

        } catch (Exception e) {
            System.out.println(">>> Entrada errónea");
            
        } finally {
            SCN.nextLine();
        }
    }

}
