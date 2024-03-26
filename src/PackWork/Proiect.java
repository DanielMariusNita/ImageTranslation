package PackWork;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Proiect {
    String imagePath = "imag.bmp";
    BufferedImage myPicture;

    public Proiect() throws IOException {
        myPicture = ImageIO.read(new File(imagePath));
    }
}
