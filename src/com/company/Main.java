package com.company;

public class Main {

    public static void main(String[] args) {

        Microorganismos micro [0] = new Microorganismos(256,'Microorganismo 1',0);
        Microorganismos micro [1] = new Microorganismos(265,'Microorganismo 2',0);
        Microorganismos micro [2] = new Microorganismos(256,'Microorganismo 3',0);
        Microorganismos micro [3] = new Microorganismos(256,'Microorganismo 4',0);

        Organo org [0]= new Organo('Cerebro');
        Organo org [1]= new Organo('Corazon');
        Organo org [2] = new Organo('Pulmones');
        Organo org [3] = new Organo('Higado');
        Organo org [4] = new Organo('Estomago');
        Organo org [5] = new Organo('Boca');
        Organo org [6] = new Organo('Intestinos');
        int i;

        for(i=0;i<4;i++){
            do{
                switch ()
                {
                    case 0:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[0].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;
                    case 1:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[1].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;
                    case 2:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[2].GetNomb()+" su vida restante es: "+micro[i].GetVida());

                        break;
                    case 3:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[3].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;
                    case 4:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[4].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;
                    case 5:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[5].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;
                    case 6:
                        System.out.println("El "+micro[i].GetNombre() +" esta en "+org[6].GetNomb()+" su vida restante es: "+micro[i].GetVida());
                        break;

                }
            }
            while(micro[i]._vida!=0);

        }



    }
}
