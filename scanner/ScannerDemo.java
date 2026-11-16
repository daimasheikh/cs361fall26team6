
/**
 * Prints the list of tokens of a JAY file.
 * Usage: java ScannerDemo [file.jay]   (default: prog1.jay)
 */
public class ScannerDemo {

	private static String file1 = "prog1.jay";
	private static int counter = 1;

	public static void main(String args[]) {
		if (args.length > 0)
			file1 = args[0];
		TokenStream ts = new TokenStream(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			// trailing whitespace/comments at the end of the file produce an
			// empty token: it is not a real token, so it is not printed
			if (tk.getValue().equals(""))
				continue;
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
