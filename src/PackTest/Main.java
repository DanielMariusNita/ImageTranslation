package PackTest;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;

import PackWork.PhotoTranslate;

public class Main extends PackWork.PhotoTranslate{

    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numele fotografiei cu extensia sa : ");
	String str_input = scan.nextLine(); //citeste numele pozei de la tastatura
	
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("\nIntroduceti numele fotografiei dupa modificare cu extensia dorita : ");
	String str_input1 = scan1.nextLine(); //introducem numele pozei dupa executia functiei

	Scanner scan2 = new Scanner(System.in);
	System.out.println("\nIntroduceti x: ");
	int val_x = scan2.nextInt();

	Scanner scan3 = new Scanner(System.in);
	System.out.println("\nIntroduceti y: ");
	int val_y = scan3.nextInt();
	PhotoTranslate pt = new PhotoTranslate();
        
        try{
            BufferedImage image = ImageIO.read(new File(str_input));
            
            long startTime = pt.getCurrentTime();
            translate(image, val_x, val_y);
            long endTime = pt.getCurrentTime();
            long duration = (endTime - startTime); //calculeaza timpul necesar executiei (evaluarea performantelor)
            
            File output = new File(str_input1);
            ImageIO.write(image, "jpg", output);
            
            System.out.println("Precesare finalizata - timp (milisecunde) " + duration);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void translate(BufferedImage image, int x, int y) {
	  
        int width = image.getWidth();
        int height = image.getHeight();
        System.out.println(width);
        System.out.println(height);

        for(int i=0; i<height-y; i++){ 
            for(int j=0; j<width-x; j++){
                int p = image.getRGB(j+x, i+y);
                image.setRGB(j, i, p);
            }
        }
        
        for(int i=height-y; i<height; i++){ //for-ul asta si cel de mai jos umplu spatiul ramas liber cu pixeli de culoare neagra
            for(int j=0; j<width; j++){
               int p = image.getRGB(j, i);
               int a = (p>>24) & 0xff; //get alpha
               int r = (p>>16) & 0xff; //get red
               int g = (p>>8) & 0xff; //get green
               int b = p & 0xff; //get blue
               
               a = 255;
               r = 0;
               g = 0;
               b = 0;
               p = (a<<24) | (r<<16) | (g<<8) | b;
               image.setRGB(j, i, p);
           }
        }
        
        for(int i=0; i<height; i++){
            for(int j=width-x; j<width; j++){
               int p = image.getRGB(j, i);
               int a = (p>>24) & 0xff; //get alpha
               int r = (p>>16) & 0xff; //get red
               int g = (p>>8) & 0xff; //get green
               int b = p & 0xff; //get blue
               
               a = 255;
               r = 0;
               g = 0;
               b = 0;
               p = (a<<24) | (r<<16) | (g<<8) | b;
               image.setRGB(j, i, p);
           }
        }
    }
    
    static void varArgs(int ... arg){
        for(int i:arg){
            System.out.println("arg = " + i);
        }
    }
}