package generadorRamdon;
import java.util.Random;
import java.io.*;
public class generadorRamdonApp {
	Random rnd = new Random();
	public static void main(String[] args) {
		copia ("c:/ficheroOrigen.dat");
	}

		public static void copia (String ficheroOriginala)
		{
			try
			{
	      
				FileInputStream fileInput = new FileInputStream(ficheroOriginala);
				BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

				byte [] array = new byte[1000];
				int leidos = bufferedInput.read(array);
				while (leidos > 0)
				{
					leidos=bufferedInput.read(array);
				}


				// Cierre de los ficheros
				bufferedInput.close();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	}
	
}
