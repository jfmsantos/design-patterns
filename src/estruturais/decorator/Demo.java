package estruturais.decorator;

import estruturais.decorator.decorators.CompressionDecorator;
import estruturais.decorator.decorators.DataSource;
import estruturais.decorator.decorators.DataSourceDecorator;
import estruturais.decorator.decorators.EncryptionDecorator;
import estruturais.decorator.decorators.FileDataSource;

public class Demo {
	
	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,10000\nSteven Jobs,91200";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
	}
}