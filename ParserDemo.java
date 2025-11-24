public class ParserDemo {

	public static void main(String[] args) {
		String fileName = args.length > 0 ? args[0] : "prog1.kay";
		TokenStream tStream = new TokenStream(fileName);
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.print(p.display());
	}

}