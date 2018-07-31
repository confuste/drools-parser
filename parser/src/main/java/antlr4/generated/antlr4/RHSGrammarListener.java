// Generated from /Users/alex/Alejandro/Repositorio/IntellijIDEA/drools-parser/parser/src/main/java/antlr4/RHSGrammar.g4 by ANTLR 4.7
package antlr4;

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RHSGrammarParser}.
 */
public interface RHSGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(RHSGrammarParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(RHSGrammarParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(RHSGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(RHSGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(RHSGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(RHSGrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#operation_update}.
	 * @param ctx the parse tree
	 */
	void enterOperation_update(RHSGrammarParser.Operation_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#operation_update}.
	 * @param ctx the parse tree
	 */
	void exitOperation_update(RHSGrammarParser.Operation_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#operation_insert}.
	 * @param ctx the parse tree
	 */
	void enterOperation_insert(RHSGrammarParser.Operation_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#operation_insert}.
	 * @param ctx the parse tree
	 */
	void exitOperation_insert(RHSGrammarParser.Operation_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#update_object}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_object(RHSGrammarParser.Update_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#update_object}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_object(RHSGrammarParser.Update_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#insert_object}.
	 * @param ctx the parse tree
	 */
	void enterInsert_object(RHSGrammarParser.Insert_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#insert_object}.
	 * @param ctx the parse tree
	 */
	void exitInsert_object(RHSGrammarParser.Insert_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RHSGrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RHSGrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RHSGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(RHSGrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RHSGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(RHSGrammarParser.TextContext ctx);
}