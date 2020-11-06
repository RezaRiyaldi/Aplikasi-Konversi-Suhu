import java.util.Scanner;
public class App {
    public static void main(String[] args){
        // Deklarasi variable
        String salahPilih2 = "Anda harus memasukan angka [1, 2, 3], Selain itu salah!",
        salahPilih = "Anda harus memasukan angka [1, 2, 3, 4], Selain itu salah!", 
        pilihSuhuAwal, pilihSuhuKedua;

        float C, R, F, K, 
        // Variable Rumus
        Cel_Fa, 
        Cel_Re, 
        Fa_Cel, 
        Fa_Re, 
        Re_Cel, 
        Re_Fa,
        Cel_Ke, 
        Fa_Ke, 
        Re_Ke, 
        Ke_Fa, 
        Ke_Cel, 
        Ke_Re; 
        // End Deklarations

        // Applications
        Scanner input = new Scanner(System.in);
        System.out.println("========================");
        System.out.println(" APLIKASI KONVERSI SUHU");
        System.out.println("========================");
        System.out.println("1. Celcius\n2. Fahrenheit\n3. Reamur\n4. Kelvin");
        System.out.println("------------------------");
        System.out.print("Masukan Satuan Suhu 1 = ");
        pilihSuhuAwal = input.next();
        switch (pilihSuhuAwal) {
            case "1":
                System.out.println("----------------------------------------------------");
                System.out.println("Satuan suhu 1 yang anda pilih adalah " + pilihSuhuAwal + " yaitu Celcius");
                System.out.println("----------------------------------------------------");      
                System.out.println("1. Fahrenheit\n2. Reamur\n3. Kelvin");  
                System.out.println("------------------------");
                System.out.print("Masukan Satuan Suhu 2 = ");
                pilihSuhuKedua = input.next();
                switch (pilihSuhuKedua) {
                    case "1":
                        System.out.println("-------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Celcius ke Fahrenheit");
                        System.out.println("-------------------------------------------"); 
                        System.out.print("Berapa Celcius = ");
                        C = input.nextFloat();
                        Cel_Fa = (C * 9/5) + 32;
                        System.out.println(C + " Celcius  = " + Cel_Fa + " Fahrenheit");
                        break;

                    case "2":
                        System.out.println("---------------------------------------"); 
                        System.out.println("Anda memilih Konversi Celcius ke Reamur");
                        System.out.println("---------------------------------------"); 
                        System.out.print("Berapa Celcius = ");
                        C = input.nextFloat();
                        Cel_Re = C * 4/5;
                        System.out.println(C + " Celcius  = " + Cel_Re + " Reamur");
                        break;

                    case "3":
                        System.out.println("---------------------------------------"); 
                        System.out.println("Anda memilih Konversi Celcius ke Kelvin");
                        System.out.println("---------------------------------------"); 
                        System.out.print("Berapa Celcius = ");
                        C = input.nextFloat();
                        Cel_Ke = C + 273;
                        System.out.println(C + " Celcius  = " + Cel_Ke + " Kelvin");
                        break;
                
                    default:
                        System.out.println(salahPilih2);
                        break;
                }
                
                break;

            case "2":
                System.out.println("--------------------------------------------------");
                System.out.println("Satuan suhu 1 yang anda pilih adalah " + pilihSuhuAwal + " yaitu Fahrenheit");
                System.out.println("--------------------------------------------------");      
                System.out.println("1. Celcius\n2. Reamur\n3. Kelvin");  
                System.out.println("------------------------");
                System.out.print("Masukan Satuan Suhu 2 = ");
                pilihSuhuKedua = input.next();
                switch (pilihSuhuKedua) {
                    case "1":
                        System.out.println("-------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Fahrenheit ke Celcius");
                        System.out.println("-------------------------------------------"); 
                        System.out.print("Berapa Fahrenheit = ");
                        F = input.nextFloat();
                        Fa_Cel = (F - 32) * 5/9;
                        System.out.println(F + " Fahrenheit = " + Fa_Cel + " Celcius");
                        break;
                
                    case "2":
                        System.out.println("-------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Fahrenheit ke Reamur");
                        System.out.println("-------------------------------------------"); 
                        System.out.print("Berapa Fahrenheit = ");
                        F = input.nextFloat();
                        Fa_Re = (F - 32) * 4/9 ;
                        System.out.println(F + " Fahrenheit = " + Fa_Re + " Reamur");
                        break;
                
                    case "3":
                        System.out.println("-------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Fahrenheit ke Kelvin");
                        System.out.println("-------------------------------------------"); 
                        System.out.print("Berapa Fahrenheit = ");
                        F = input.nextFloat();
                        Fa_Ke = (F - 32) * 5/9  + 273;
                        System.out.println(F + " Fahrenheit = " + Fa_Ke + " Kelvin");
                        break;
                
                    default:
                        System.out.println(salahPilih2);
                        break;
                }
                
                break;
        
            case "3":
                System.out.println("--------------------------------------------------");
                System.out.println("Satuan suhu 1 yang anda pilih adalah " + pilihSuhuAwal + " yaitu Reamur");
                System.out.println("--------------------------------------------------");      
                System.out.println("1. Celcius\n2. Fahrenheit\n3. Kelvin");  
                System.out.println("------------------------");
                System.out.print("Masukan Satuan Suhu 2 = ");
                pilihSuhuKedua = input.next();
                switch (pilihSuhuKedua) {
                    case "1":
                        System.out.println("---------------------------------------"); 
                        System.out.println("Anda memilih Konversi Reamur ke Celcius");
                        System.out.println("---------------------------------------"); 
                        System.out.print("Berapa Reamur = ");
                        R = input.nextFloat();
                        Re_Cel = R * (5/4);
                        System.out.println(R + " Reamur = " + Re_Cel + " Celcius");
                        break;
                
                    case "2":
                        System.out.println("------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Reamur ke Fahrenheit");
                        System.out.println("------------------------------------------"); 
                        System.out.print("Berapa Reamur = ");
                        R = input.nextFloat();
                        Re_Fa = R * (9/4) + 32;
                        System.out.println(R + " Reamur = " + Re_Fa + " Fahrenheit");
                        break;
                
                    case "3":
                        System.out.println("--------------------------------------"); 
                        System.out.println("Anda memilih Konversi Reamur ke Kelvin");
                        System.out.println("--------------------------------------"); 
                        System.out.print("Berapa Reamur = ");
                        R = input.nextFloat();
                        Re_Ke = R * (5/4) + 273;
                        System.out.println(R + " Reamur = " + Re_Ke + " Kelvin");
                        break;
                
                    default:
                        System.out.println(salahPilih2);
                        break;
                }
                
                break;
        
        
            case "4":
                System.out.println("--------------------------------------------------");
                System.out.println("Satuan suhu 1 yang anda pilih adalah " + pilihSuhuAwal + " yaitu Kelvin");
                System.out.println("--------------------------------------------------");      
                System.out.println("1. Celcius\n2. Fahrenheit\n3. Reamur");  
                System.out.println("------------------------");
                System.out.print("Masukan Satuan Suhu 2 = ");
                pilihSuhuKedua = input.next();
                switch (pilihSuhuKedua) {
                    case "1":
                        System.out.println("---------------------------------------"); 
                        System.out.println("Anda memilih Konversi Kelvin ke Celcius");
                        System.out.println("---------------------------------------"); 
                        System.out.print("Berapa Kelvin = ");
                        K = input.nextFloat();
                        Ke_Cel = K - 273;
                        System.out.println(K + " Kelvin = " + Ke_Cel + " Celcius");
                        break;
                
                    case "2":
                        System.out.println("------------------------------------------"); 
                        System.out.println("Anda memilih Konversi Kelvin ke Fahrenheit");
                        System.out.println("------------------------------------------"); 
                        System.out.print("Berapa Kelvin = ");
                        K = input.nextFloat();
                        Ke_Fa = (K-273) * 9/5 + 32 ;
                        System.out.println(K + " Kelvin = " + Ke_Fa + " Fahrenheit");
                        break;
                
                    case "3":
                        System.out.println("--------------------------------------"); 
                        System.out.println("Anda memilih Konversi Kelvin ke Reamur");
                        System.out.println("--------------------------------------"); 
                        System.out.print("Berapa Kelvin = ");
                        K = input.nextFloat();
                        Ke_Re = (K-273) * 4/5;
                        System.out.println(K + " Kelvin = " + Ke_Re + " Reamur");
                        break;
                
                    default:
                        System.out.println(salahPilih2);
                        break;
                }
                
                break;
        
            default:
                System.out.println(salahPilih);
                break;
        }
        
    }
}
