// Generated from Whilelang.g4 by ANTLR 4.13.0
package de.buildacompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WhilelangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WhilelangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(WhilelangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WhilelangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WhilelangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(WhilelangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#whileDoLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDoLoop(WhilelangParser.WhileDoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(WhilelangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(WhilelangParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(WhilelangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(WhilelangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link WhilelangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(WhilelangParser.TermContext ctx);
}