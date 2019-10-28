/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
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

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        final int hMin = 01;
        final int mMin = 00;
        final int sMin = 00;

        int hAct = cal.get(Calendar.HOUR_OF_DAY);
        int mAct = cal.get(Calendar.MINUTE);
        int sAct = cal.get(Calendar.SECOND);

        int hRnd = RND.nextInt(hAct - hMin + 1) + hMin;
        int mRnd = RND.nextInt(mAct - mMin + 1) + mMin;
        int sRnd = RND.nextInt(sAct - sMin + 1) + sMin;

        System.out.printf("Hora actual ......: %d:%d:%d%n", hAct, mAct, sAct);
        System.out.printf("Hora inicio ......: %d:%d:%d%n", hRnd, mRnd, sRnd);

        //Pasar hora actual y hora random a segundos
        int tiempoActSeg = hAct * 3600 + mAct * 60 + sAct;
        int tiempoRndSeg = hRnd * 3600 + mRnd * 60 + sRnd;

        //Saber segundos que hay de diferencia
        int segDif = tiempoActSeg - tiempoRndSeg;

        //Pasar segundos a minutos
        int minDif = segDif / 60;

        //Pasar a horas
        int horaDif = minDif / 60;
        minDif = minDif % 60;
        segDif = segDif % 60;

        System.out.printf("Tiempo de clase ..: %d:%d:%d%n", horaDif, minDif, segDif);

    }
}
