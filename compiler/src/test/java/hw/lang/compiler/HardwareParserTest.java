package hw.lang.compiler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.LinkedList;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import hw.lang.parser.HardwareLexer;
import hw.lang.parser.HardwareParser;

@RunWith(Parameterized.class)
public class HardwareParserTest {
	@Parameters(name = "{1}")
	public static Collection<Object[]> data() {
		final ClassLoader classLoader = 
			HardwareParserTest.class.getClassLoader();
		
		final File parserTestDir = 
			new File(classLoader.getResource("hw/lang/parser").getFile());

		final LinkedList<Object[]> tests =
			new LinkedList<>();
		
		for (final File sourceFile : parserTestDir.listFiles()) {
			final String filename = 
				sourceFile.getAbsolutePath();
			
			if (filename.endsWith(".hw")) {
				tests.add(new Object[] {filename, sourceFile.getName()});
			}
		}
		
		return tests;
	}
	
	@Parameter(0)
	public String sourceFileName;
	
	@Parameter(1)
	public String name;
		
	@Test
	public void test() throws IOException {
		ANTLRErrorListener errorListener = new ANTLRErrorListener() {
			@Override
			public void syntaxError(
				Recognizer<?, ?> recognizer, 
				Object offendingSymbol, 
				int line, 
				int charPositionInLine,
				String msg, 
				RecognitionException e
			) {
				assertTrue("syntaxError", false);
			}
			
			@Override
			public void reportContextSensitivity(
				Parser recognizer, 
				DFA dfa, 
				int startIndex, 
				int stopIndex, 
				int prediction,
				ATNConfigSet configs
			) {
				assertTrue("reportContextSensitivity", false);
			}
			
			@Override
			public void reportAttemptingFullContext(
				Parser recognizer, 
				DFA dfa, 
				int startIndex, 
				int stopIndex,
				BitSet conflictingAlts, 
				ATNConfigSet configs
			) {
				assertTrue("reportAttemptingFullContext", false);
			}
			
			@Override
			public void reportAmbiguity(
				Parser recognizer, 
				DFA dfa, 
				int startIndex, 
				int stopIndex, 
				boolean exact,
				BitSet ambigAlts,
				ATNConfigSet configs
			) {
				assertTrue("reportAmbiguity", false);
			}
		};
		
		final HardwareLexer lexer = new HardwareLexer(CharStreams.fromFileName(sourceFileName));
		final CommonTokenStream tokens = new CommonTokenStream(lexer);
		final HardwareParser parser = new HardwareParser(tokens);
		
		parser.addErrorListener(errorListener);
		lexer.addErrorListener(errorListener);
		
		System.out.println(parser.compilationUnit().toStringTree());
	}
}
