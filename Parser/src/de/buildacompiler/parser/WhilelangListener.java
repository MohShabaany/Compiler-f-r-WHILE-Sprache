// Generated from Whilelang.g4 by ANTLR 4.13.0
package de.buildacompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WhilelangParser}.
 */
public interface WhilelangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(WhilelangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(WhilelangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WhilelangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WhilelangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(WhilelangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(WhilelangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterLoop(WhilelangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(WhilelangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#whileDoLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoLoop(WhilelangParser.WhileDoLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#whileDoLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoLoop(WhilelangParser.WhileDoLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(WhilelangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(WhilelangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(WhilelangParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(WhilelangParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(WhilelangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(WhilelangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(WhilelangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(WhilelangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link WhilelangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(WhilelangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link WhilelangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(WhilelangParser.TermContext ctx);
}