// Generated from Final.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FinalParser}.
 */
public interface FinalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FinalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FinalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FinalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FinalParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FinalParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FinalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FinalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#assigstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssigstmt(FinalParser.AssigstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#assigstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssigstmt(FinalParser.AssigstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void enterIfstmt(FinalParser.IfstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#ifstmt}.
	 * @param ctx the parse tree
	 */
	void exitIfstmt(FinalParser.IfstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnstmt(FinalParser.ReturnstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#returnstmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnstmt(FinalParser.ReturnstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(FinalParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(FinalParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FinalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FinalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FinalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FinalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(FinalParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(FinalParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FinalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FinalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(FinalParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(FinalParser.ClazzContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(FinalParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(FinalParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(FinalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(FinalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link FinalParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(FinalParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link FinalParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(FinalParser.MethodContext ctx);
}