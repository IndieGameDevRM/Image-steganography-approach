package readimage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class imagereading extends text{

	public static void Writing_pixel(File f,BufferedImage bf) {
		try {
			int width=bf.getWidth();
			int height=bf.getHeight();
			 for(int y = 0; y < height; y++){ //making disorted pixel
			       for(int x = 0; x < width; x++){
			    	   int aplha=bf.getRGB(x, y);  
			    	   int red=bf.getRGB(x, y);
			    	   int green=bf.getRGB(x, y);
			    	   int blue=bf.getRGB(x, y);
			    	   int p = (aplha<<24) | (red<<16) | (green<<8) | blue; //pixel
			 
			         bf.setRGB(x, y, p);
			       }
			     }
			 
		     ImageIO.write(bf, "png", f);
		}catch (IOException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	public static void Lsb_operation() {
		
		
	}
	public static void main(String arg[]){
		int width=1600;		//image width
		int height=900;		//image height
		BufferedImage bf=null;
		File f,f1=null;
		try {
			f=new File("C:\\Users\\lenovo\\Desktop\\images.png");
			f1=new File("C:\\Users\\lenovo\\Desktop\\output.png");
			bf=new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
			bf=ImageIO.read(f);
			System.out.println("Reading Complete");
			Writing_pixel(f1,bf);
			System.out.println("writingComplete");
			Lsb_operation();
			}catch(IOException e) {
				System.out.println("Error"+e);
			}
	TextInBinary();
	}
}
		
	
	
	
