
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	private static int counter = 1;

	public static void main(String args[]) {
		String fileName = args.length > 0 ? args[0] : "prog1.kay";
		TokenStream ts = new TokenStream(fileName);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			if (tk.getType() != null && !tk.getType().isEmpty() && tk.getValue() != null && !tk.getValue().isEmpty()) {
				System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
			}
		}
	}
}
