/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author user
 */
class Konversi {
    float celcius, reamur, kelvin,fahrenheit;
    
    Konversi(float Celcius){
        this.celcius = Celcius;
    }
    public float convertReamur(){
        this.reamur = (4*celcius)/5;
        return reamur;
    }
    public float convertKelvin(){
         this.kelvin = (float) (this.celcius+273.15); 
         return this.kelvin;
    }
    public float convertFahrenheit(){
        this.fahrenheit = ((9*this.celcius)/5)+32;
        return this.fahrenheit;
    }
    
    public String kondisiAir(){
        if(celcius<=0){
            return "Kondisi Air beku.";
        }else if(celcius>=100){
            return "Kondisi Air mendidih.";
        }else{
            return "Kondisi Air normal.";
        }
    }
    
    public void tampilData(){
        System.out.println("Suhu dalam Celcius : "+this.celcius);
        System.out.println("Dalam Fahrenheit : "+this.fahrenheit);
        System.out.println("Dalam Reamur : "+this.reamur);
        System.out.println("Dalam Kelvin : "+this.kelvin);
        kondisiAir();
    }
}