package grammar;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class RunCompiler {

    public static void main(String[] args) throws IOException {
        String infile;
        String outfile;

        StupidSimpleCompiler compiler = new StupidSimpleCompiler();

        System.out.println("Vilket program vill du kompilera?");
        Scanner scanner = new Scanner(System.in);
        infile = scanner.nextLine();
        System.out.println("Vart ska den kompilerade filen sparas?");
        outfile = scanner.nextLine();

        StupidSimpleLexer lexer = new StupidSimpleLexer(CharStreams.fromFileName(infile));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StupidSimpleParser parser = new StupidSimpleParser(tokens);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);

        Writer w = new OutputStreamWriter(new FileOutputStream(outfile), "US-ASCII");
        w.write(compiler.getCompiledCode());
        w.close();
    }
}
