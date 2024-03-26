package PackWork;
import PackWork.Interface;
import PackWork.Photo;

public class PhotoTranslate extends Photo  implements Interface {
	 static {
	        // Bloc de inițializare statică
	        // Acest bloc este executat în momentul încărcării clasei în memorie
	        System.out.println("Clasa Main a fost incarcata!");
	    }
    @Override
    public long getCurrentTime() {
        return System.currentTimeMillis();
    }
    
    /*public void translate(BufferedImage image, int x, int y) {
        width = image.getWidth();
        height = image.getHeight();
        System.out.println(width);
        System.out.println(height);

        for(int i=0; i<height-y; i++){
            for(int j=0; j<width-x; j++){
               int p = image.getRGB(j+y, i+x);
               image.setRGB(j, i, p);
           }
        }
        
        for(int i=height-y; i<height; i++){
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
    }*/
    
}
