// Generated from D:/Ahmed Hady/college/Second Term/Compilers/Project/Dynamic-Analyzer-in-C/antlr/src\C_grammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link C_grammarParser}.
 */
public interface C_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(C_grammarParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(C_grammarParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(C_grammarParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(C_grammarParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(C_grammarParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(C_grammarParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(C_grammarParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(C_grammarParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(C_grammarParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(C_grammarParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(C_grammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(C_grammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(C_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(C_grammarParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(C_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(C_grammarParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(C_grammarParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(C_grammarParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(C_grammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(C_grammarParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(C_grammarParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(C_grammarParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(C_grammarParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(C_grammarParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(C_grammarParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(C_grammarParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(C_grammarParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(C_grammarParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(C_grammarParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(C_grammarParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(C_grammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(C_grammarParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(C_grammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(C_grammarParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(C_grammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(C_grammarParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(C_grammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(C_grammarParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(C_grammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(C_grammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(C_grammarParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(C_grammarParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(C_grammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(C_grammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(C_grammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(C_grammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(C_grammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(C_grammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(C_grammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(C_grammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(C_grammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(C_grammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(C_grammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(C_grammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(C_grammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(C_grammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(C_grammarParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(C_grammarParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(C_grammarParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(C_grammarParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(C_grammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(C_grammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(C_grammarParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(C_grammarParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(C_grammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(C_grammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(C_grammarParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(C_grammarParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(C_grammarParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(C_grammarParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(C_grammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(C_grammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(C_grammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(C_grammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(C_grammarParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(C_grammarParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(C_grammarParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(C_grammarParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(C_grammarParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(C_grammarParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(C_grammarParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(C_grammarParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(C_grammarParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(C_grammarParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(C_grammarParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(C_grammarParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(C_grammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(C_grammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(C_grammarParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(C_grammarParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(C_grammarParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(C_grammarParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(C_grammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(C_grammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(C_grammarParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(C_grammarParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(C_grammarParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(C_grammarParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(C_grammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(C_grammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(C_grammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(C_grammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(C_grammarParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(C_grammarParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(C_grammarParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(C_grammarParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(C_grammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(C_grammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(C_grammarParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(C_grammarParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(C_grammarParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(C_grammarParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(C_grammarParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(C_grammarParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(C_grammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(C_grammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(C_grammarParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(C_grammarParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(C_grammarParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(C_grammarParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(C_grammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(C_grammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(C_grammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(C_grammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(C_grammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(C_grammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(C_grammarParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(C_grammarParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(C_grammarParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(C_grammarParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(C_grammarParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(C_grammarParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(C_grammarParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(C_grammarParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(C_grammarParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(C_grammarParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(C_grammarParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(C_grammarParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(C_grammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(C_grammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(C_grammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(C_grammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(C_grammarParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(C_grammarParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(C_grammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(C_grammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(C_grammarParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(C_grammarParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(C_grammarParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(C_grammarParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(C_grammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(C_grammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link C_grammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(C_grammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link C_grammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(C_grammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link C_grammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(C_grammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link C_grammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(C_grammarParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(C_grammarParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(C_grammarParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(C_grammarParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(C_grammarParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(C_grammarParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(C_grammarParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(C_grammarParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(C_grammarParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(C_grammarParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(C_grammarParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(C_grammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(C_grammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(C_grammarParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(C_grammarParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(C_grammarParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(C_grammarParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(C_grammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link C_grammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(C_grammarParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link C_grammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(C_grammarParser.DeclarationListContext ctx);
}