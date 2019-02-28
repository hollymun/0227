import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {

	public static void main(String[] args) {
		
		Properties prop=new Properties();
		prop.setProperty("name", "문찌");
		prop.setProperty("jop", "koongya");
		prop.setProperty("hometown", "왕십리");
	/*	
		try {
			prop.store(new FileOutputStream("~ Moon$ /Users/mac/Documents/sample.txt"), "moon2");
		} catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		//ERROR->throw try/catch 
		 *	}
		 */

	}
}
