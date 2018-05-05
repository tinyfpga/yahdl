// Generated from Hardware.g4 by ANTLR 4.7.1

    package hw.lang.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HardwareParser}.
 */
public interface HardwareListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HardwareParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(HardwareParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(HardwareParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void enterPackageDecl(HardwareParser.PackageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void exitPackageDecl(HardwareParser.PackageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void enterModuleDef(HardwareParser.ModuleDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#moduleDef}.
	 * @param ctx the parse tree
	 */
	void exitModuleDef(HardwareParser.ModuleDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#portDeclList}.
	 * @param ctx the parse tree
	 */
	void enterPortDeclList(HardwareParser.PortDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#portDeclList}.
	 * @param ctx the parse tree
	 */
	void exitPortDeclList(HardwareParser.PortDeclListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#portDecl}.
	 * @param ctx the parse tree
	 */
	void enterPortDecl(HardwareParser.PortDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#portDecl}.
	 * @param ctx the parse tree
	 */
	void exitPortDecl(HardwareParser.PortDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#portDir}.
	 * @param ctx the parse tree
	 */
	void enterPortDir(HardwareParser.PortDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#portDir}.
	 * @param ctx the parse tree
	 */
	void exitPortDir(HardwareParser.PortDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(HardwareParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(HardwareParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#packedSize}.
	 * @param ctx the parse tree
	 */
	void enterPackedSize(HardwareParser.PackedSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#packedSize}.
	 * @param ctx the parse tree
	 */
	void exitPackedSize(HardwareParser.PackedSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HardwareParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(HardwareParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HardwareParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(HardwareParser.ModuleBodyContext ctx);
}