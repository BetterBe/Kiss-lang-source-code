// Generated from C:/Users/laxga/Desktop/intelliJ Projects/KPUIE/KPUIExtension/src/kss2\KSSParser.g4 by ANTLR 4.7
package org.kss.meta;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KSSParser}.
 */
public interface KSSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KSSParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KSSParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KSSParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(KSSParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(KSSParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(KSSParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(KSSParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(KSSParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(KSSParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(KSSParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(KSSParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(KSSParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(KSSParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#styleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStyleDeclaration(KSSParser.StyleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#styleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStyleDeclaration(KSSParser.StyleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEventDeclaration(KSSParser.EventDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#eventDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEventDeclaration(KSSParser.EventDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#styleField}.
	 * @param ctx the parse tree
	 */
	void enterStyleField(KSSParser.StyleFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#styleField}.
	 * @param ctx the parse tree
	 */
	void exitStyleField(KSSParser.StyleFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(KSSParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(KSSParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(KSSParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(KSSParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#disconnection}.
	 * @param ctx the parse tree
	 */
	void enterDisconnection(KSSParser.DisconnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#disconnection}.
	 * @param ctx the parse tree
	 */
	void exitDisconnection(KSSParser.DisconnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#tag_modifier}.
	 * @param ctx the parse tree
	 */
	void enterTag_modifier(KSSParser.Tag_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#tag_modifier}.
	 * @param ctx the parse tree
	 */
	void exitTag_modifier(KSSParser.Tag_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#style_modifier}.
	 * @param ctx the parse tree
	 */
	void enterStyle_modifier(KSSParser.Style_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#style_modifier}.
	 * @param ctx the parse tree
	 */
	void exitStyle_modifier(KSSParser.Style_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#ref_mofifier}.
	 * @param ctx the parse tree
	 */
	void enterRef_mofifier(KSSParser.Ref_mofifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#ref_mofifier}.
	 * @param ctx the parse tree
	 */
	void exitRef_mofifier(KSSParser.Ref_mofifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(KSSParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(KSSParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(KSSParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(KSSParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#ref_call}.
	 * @param ctx the parse tree
	 */
	void enterRef_call(KSSParser.Ref_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#ref_call}.
	 * @param ctx the parse tree
	 */
	void exitRef_call(KSSParser.Ref_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(KSSParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(KSSParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(KSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(KSSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#templateValue}.
	 * @param ctx the parse tree
	 */
	void enterTemplateValue(KSSParser.TemplateValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#templateValue}.
	 * @param ctx the parse tree
	 */
	void exitTemplateValue(KSSParser.TemplateValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(KSSParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(KSSParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(KSSParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(KSSParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(KSSParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(KSSParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#multiName}.
	 * @param ctx the parse tree
	 */
	void enterMultiName(KSSParser.MultiNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#multiName}.
	 * @param ctx the parse tree
	 */
	void exitMultiName(KSSParser.MultiNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(KSSParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(KSSParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(KSSParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(KSSParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#stylingHeader}.
	 * @param ctx the parse tree
	 */
	void enterStylingHeader(KSSParser.StylingHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#stylingHeader}.
	 * @param ctx the parse tree
	 */
	void exitStylingHeader(KSSParser.StylingHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#eventHeader}.
	 * @param ctx the parse tree
	 */
	void enterEventHeader(KSSParser.EventHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#eventHeader}.
	 * @param ctx the parse tree
	 */
	void exitEventHeader(KSSParser.EventHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#eventAssign}.
	 * @param ctx the parse tree
	 */
	void enterEventAssign(KSSParser.EventAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#eventAssign}.
	 * @param ctx the parse tree
	 */
	void exitEventAssign(KSSParser.EventAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#stylingDescendantList}.
	 * @param ctx the parse tree
	 */
	void enterStylingDescendantList(KSSParser.StylingDescendantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#stylingDescendantList}.
	 * @param ctx the parse tree
	 */
	void exitStylingDescendantList(KSSParser.StylingDescendantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#eventAddon}.
	 * @param ctx the parse tree
	 */
	void enterEventAddon(KSSParser.EventAddonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#eventAddon}.
	 * @param ctx the parse tree
	 */
	void exitEventAddon(KSSParser.EventAddonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#pointerAddon}.
	 * @param ctx the parse tree
	 */
	void enterPointerAddon(KSSParser.PointerAddonContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#pointerAddon}.
	 * @param ctx the parse tree
	 */
	void exitPointerAddon(KSSParser.PointerAddonContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#descendantSelector}.
	 * @param ctx the parse tree
	 */
	void enterDescendantSelector(KSSParser.DescendantSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#descendantSelector}.
	 * @param ctx the parse tree
	 */
	void exitDescendantSelector(KSSParser.DescendantSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#eventSelector}.
	 * @param ctx the parse tree
	 */
	void enterEventSelector(KSSParser.EventSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#eventSelector}.
	 * @param ctx the parse tree
	 */
	void exitEventSelector(KSSParser.EventSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#stylePointer}.
	 * @param ctx the parse tree
	 */
	void enterStylePointer(KSSParser.StylePointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#stylePointer}.
	 * @param ctx the parse tree
	 */
	void exitStylePointer(KSSParser.StylePointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#elementHeader}.
	 * @param ctx the parse tree
	 */
	void enterElementHeader(KSSParser.ElementHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#elementHeader}.
	 * @param ctx the parse tree
	 */
	void exitElementHeader(KSSParser.ElementHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void enterClassHeader(KSSParser.ClassHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#classHeader}.
	 * @param ctx the parse tree
	 */
	void exitClassHeader(KSSParser.ClassHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#dataDecorator}.
	 * @param ctx the parse tree
	 */
	void enterDataDecorator(KSSParser.DataDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#dataDecorator}.
	 * @param ctx the parse tree
	 */
	void exitDataDecorator(KSSParser.DataDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#tagData}.
	 * @param ctx the parse tree
	 */
	void enterTagData(KSSParser.TagDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#tagData}.
	 * @param ctx the parse tree
	 */
	void exitTagData(KSSParser.TagDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#variableData}.
	 * @param ctx the parse tree
	 */
	void enterVariableData(KSSParser.VariableDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#variableData}.
	 * @param ctx the parse tree
	 */
	void exitVariableData(KSSParser.VariableDataContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#multipleValues}.
	 * @param ctx the parse tree
	 */
	void enterMultipleValues(KSSParser.MultipleValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#multipleValues}.
	 * @param ctx the parse tree
	 */
	void exitMultipleValues(KSSParser.MultipleValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#rgb}.
	 * @param ctx the parse tree
	 */
	void enterRgb(KSSParser.RgbContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#rgb}.
	 * @param ctx the parse tree
	 */
	void exitRgb(KSSParser.RgbContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#rgba}.
	 * @param ctx the parse tree
	 */
	void enterRgba(KSSParser.RgbaContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#rgba}.
	 * @param ctx the parse tree
	 */
	void exitRgba(KSSParser.RgbaContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#percent}.
	 * @param ctx the parse tree
	 */
	void enterPercent(KSSParser.PercentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#percent}.
	 * @param ctx the parse tree
	 */
	void exitPercent(KSSParser.PercentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#pixel}.
	 * @param ctx the parse tree
	 */
	void enterPixel(KSSParser.PixelContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#pixel}.
	 * @param ctx the parse tree
	 */
	void exitPixel(KSSParser.PixelContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#vec2}.
	 * @param ctx the parse tree
	 */
	void enterVec2(KSSParser.Vec2Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#vec2}.
	 * @param ctx the parse tree
	 */
	void exitVec2(KSSParser.Vec2Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#vec3}.
	 * @param ctx the parse tree
	 */
	void enterVec3(KSSParser.Vec3Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#vec3}.
	 * @param ctx the parse tree
	 */
	void exitVec3(KSSParser.Vec3Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#vec4}.
	 * @param ctx the parse tree
	 */
	void enterVec4(KSSParser.Vec4Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#vec4}.
	 * @param ctx the parse tree
	 */
	void exitVec4(KSSParser.Vec4Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#udim2}.
	 * @param ctx the parse tree
	 */
	void enterUdim2(KSSParser.Udim2Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#udim2}.
	 * @param ctx the parse tree
	 */
	void exitUdim2(KSSParser.Udim2Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#true_}.
	 * @param ctx the parse tree
	 */
	void enterTrue_(KSSParser.True_Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#true_}.
	 * @param ctx the parse tree
	 */
	void exitTrue_(KSSParser.True_Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#false_}.
	 * @param ctx the parse tree
	 */
	void enterFalse_(KSSParser.False_Context ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#false_}.
	 * @param ctx the parse tree
	 */
	void exitFalse_(KSSParser.False_Context ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KSSParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KSSParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link KSSParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(KSSParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link KSSParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(KSSParser.NumContext ctx);
}