import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String fileName = args[0];
        int n = Integer.parseInt(args[1]);
		Color [][] imageIn = Runigram.read(fileName);
        Color [][] imageOut = Runigram.grayScaled(imageIn);
		
        Runigram.morph(imageIn, imageOut, n);
        

	}
}
