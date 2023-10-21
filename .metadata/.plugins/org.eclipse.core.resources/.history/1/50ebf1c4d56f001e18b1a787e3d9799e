package de.buildacompiler.compiler;

import java.util.*;

import org.antlr.runtime.tree.TreeWizard.Visitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import de.buildacompiler.parser.*;
import java.io.*;


public class Main {
	
	/**
	 * Hauptmethode des Programms, das eine Datei mit WHILE-Sprache interpretiert und daraus Assembly-Code generiert.
	 * Diese Methode liest den Inhalt der Datei "code.whilelang", parst diesen durch den WhilelangLexer und WhilelangParser
	 * und generiert am Ende eine Assembly-Datei mit dem entsprechenden Code.

	 */

	public static void main(String[] args)throws Exception  {
		
		
		ANTLRInputStream input = new ANTLRFileStream("code.whilelang");
		
		// Erstelle einen Lexer
		WhilelangLexer lexer = new WhilelangLexer(input);
				
		// Erstelle einen Token-Stream aus dem Lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		// Erstelle einen Parser
		WhilelangParser parser = new WhilelangParser(tokens);
		
		// Starte das Parsing und erhalte den Parse-Baum (AST)
        ParseTree tree = parser.program();
      
       
      
        /**
         * Versucht, eine neue Datei namens "assembly.asm" zu erstellen und bereitet das Schreiben von Daten in diese Datei vor.
         */
        try { 
        PrintStream output = new PrintStream(new File("assembly.asm"));
        System.setOut(output);
        String assemblyCode = "section .data\n"
					+ "		out_format db \"Result: %d\", 10, 0  ; Format string for printf-style output\n"
					+ "section .text\n"
					+ "  extern _printf\n"
					+ "  global _main\n"
					+ "_main:\n" ;
			   assemblyCode += new MyVisitor().visit(tree);
			   assemblyCode +="; Beenden und Aufräumen \n"
			   		        + "add rsp, " + new MyVisitor().getstackCapacity() +"                 ; Stack aufräumen.\n"
					   		+"pop rbp                     ; Holt den Basiszeiger zurück.\n"
					   		+"ret                         ; Funktion beenden\n";
			   				
			   
        output.println(assemblyCode);
        output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       

        
       
 

     
		
		
		
		
		
	}	
	
	
	


	}
 

