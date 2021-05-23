// Generated from D:/Ahmed Hady/college/Second Term/Compilers/Project/Dynamic-Analyzer-in-C/antlr/src\C_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link C_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface C_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(C_grammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(C_grammarParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(C_grammarParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(C_grammarParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(C_grammarParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(C_grammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(C_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(C_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(C_grammarParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(C_grammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(C_grammarParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(C_grammarParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(C_grammarParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(C_grammarParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(C_grammarParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(C_grammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(C_grammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(C_grammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(C_grammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(C_grammarParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(C_grammarParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(C_grammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(C_grammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(C_grammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(C_grammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(C_grammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(C_grammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(C_grammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(C_grammarParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(C_grammarParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(C_grammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(C_grammarParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(C_grammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(C_grammarParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(C_grammarParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(C_grammarParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(C_grammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(C_grammarParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(C_grammarParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(C_grammarParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(C_grammarParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(C_grammarParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(C_grammarParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(C_grammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(C_grammarParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(C_grammarParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(C_grammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(C_grammarParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(C_grammarParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(C_grammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(C_grammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(C_grammarParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(C_grammarParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(C_grammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(C_grammarParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(C_grammarParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(C_grammarParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(C_grammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(C_grammarParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(C_grammarParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(C_grammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(C_grammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(C_grammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(C_grammarParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(C_grammarParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(C_grammarParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(C_grammarParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(C_grammarParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(C_grammarParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(C_grammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(C_grammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(C_grammarParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(C_grammarParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(C_grammarParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(C_grammarParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(C_grammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(C_grammarParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(C_grammarParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(C_grammarParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(C_grammarParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(C_grammarParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(C_grammarParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(C_grammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(C_grammarParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(C_grammarParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link C_grammarParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(C_grammarParser.DeclarationListContext ctx);
}