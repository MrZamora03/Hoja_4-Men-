package hoja_4.menú;
import java.util.Scanner;
public class Hoja_4Menú {

    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Opcion=0;
        double radio=0,ancho=0,altura=0,largo=0,Volumen,Area,Perimetro;
        System.out.println("\tMenu\nSeleccione la opcion a operar:\n1. Esfera\n2. Paralelipido\n3. Cono\n4. Cilindro");
        while ((Opcion<1)||(Opcion>4)){
            try{
                Opcion = Integer.parseInt(Teclado.nextLine());
            }catch(Exception e){
                System.out.println("Por favor ingrese solo numeros enteros.");
            }
            if ((Opcion<1)||(Opcion>4)){
                System.out.println("Por favor ingrese un numero entre las opciones dadas.");
            }
        }
        switch (Opcion) {
            case 1:
                System.out.println("Usted escogio la opcion de Esfera.\nPor favor ingrese el radio:");
                while (radio<=0){
                    try{
                        radio = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if (radio<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0");
                    }
                }
                Volumen = (4 * Math.PI * Math.pow(radio, 3))/3;
                Area = 4 * Math.PI * Math.pow(radio, 2);
                Perimetro = 2 * Math.PI * radio;
                System.out.println("El volumen es: " +Math.round(Volumen*100d)/100d +" unidades cubicas."+"\nEl area es de : " +Math.round(Area*100d)/100d +" unidades cuadraticas."+"\nEl perimetro es de: " +Math.round(Perimetro*100d)/100d +" unidades.");
                break;
            case 2:
                System.out.println("Usted escogio la opcion de Paralelipedo.\nPor favor a continuacion ingrese las medidas de la base.\nAncho:");
                while(ancho<=0){
                    try{
                        ancho = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if (ancho<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                System.out.println("Largo:");
                while(largo<=0){
                    try{
                        largo = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(largo<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                System.out.println("Ingrese la altura:");
                while(altura<=0){
                    try{
                        altura = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(altura<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                Volumen = ancho*largo*altura;
                Area = ((2*ancho*largo)+(2*ancho*altura)+(2*largo*altura));
                Perimetro = ((2*ancho)+(2*largo));
                System.out.println("El volumen es de: " +Math.round(Volumen*100d)/100d +" unidades cubicas.\nEl area es de :" +Math.round(Area*100d)/100d +" unidades cuadraticas.\nEl perimetro es de: " +Math.round(Perimetro*100d)/100d +" unidades.");
                break;
            case 3:
                System.out.println("Usted escogio la opcion de Cono.\nPor favor ingrese el radio:");
                while(radio<=0){
                    try{
                        radio = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(radio<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                System.out.println("Por favor ingrese la altura:");
                while(altura<=0){
                    try{
                        altura = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(altura<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                Area = Math.PI * Math.pow(radio, 2);
                Volumen = (Area*altura/3);
                Perimetro = (2 * Math.PI * radio);
                System.out.println("El volumen es de: " +Math.round(Volumen*100d)/100d +" unidades cubicas.\nEl area es de: " +Math.round(Area*100d)/100d +" unidades cuadraticas.\nEl perimetro es de: " +Math.round(Perimetro*100d)/100d +" unidades.");
                break;
            case 4:
                System.out.println("Usted escogio la opcion de Cilindro.\nPor favor ingrese el radio:");
                while(radio<=0){
                    try{
                        radio = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(radio<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                System.out.println("Por favor ingrese la altura:");
                while(altura<=0){
                    try{
                        altura = Double.parseDouble(Teclado.nextLine());
                    }catch(Exception e){
                        System.out.println("Por favor ingrese solo numeros.");
                    }
                    if(altura<=0){
                        System.out.println("Por favor ingrese un numero mayor a 0.");
                    }
                }
                Area = (2 * Math.PI * Math.pow(radio, 2));
                Volumen = Area*altura;
                Perimetro = (2*Math.PI*radio);
                System.out.println("El volumen es de: " +Math.round(Volumen*100d)/100d +" unidades cubicas.\nEl area es de: " +Math.round(Area*100d)/100d +" unidades cuadraticas.\nEl perimetro es de: " +Math.round(Perimetro*100d)/100d +" unidades.");
                break;
            default:
                break;
        }
    }
}