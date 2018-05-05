// Generated from Hardware.g4 by ANTLR 4.7.1

    package hw.lang.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HardwareParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HardwareVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HardwareParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(HardwareParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#packageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDecl(HardwareParser.PackageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#moduleDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDef(HardwareParser.ModuleDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#portDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortDeclList(HardwareParser.PortDeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#portDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortDecl(HardwareParser.PortDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#portDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPortDir(HardwareParser.PortDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(HardwareParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#packedSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackedSize(HardwareParser.PackedSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HardwareParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(HardwareParser.ModuleBodyContext ctx);
}