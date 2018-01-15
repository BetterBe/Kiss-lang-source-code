// Generated from C:/Users/laxga/Desktop/intelliJ Projects/KPUIE/KPUIExtension/src/kss2\KSSParser.g4 by ANTLR 4.7
package org.kss.meta;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KSSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KSSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KSSParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(KSSParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(KSSParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(KSSParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(KSSParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(KSSParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(KSSParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#styleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleDeclaration(KSSParser.StyleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#eventDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventDeclaration(KSSParser.EventDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#styleField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleField(KSSParser.StyleFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(KSSParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(KSSParser.ConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#disconnection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnection(KSSParser.DisconnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#tag_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_modifier(KSSParser.Tag_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#style_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle_modifier(KSSParser.Style_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#ref_mofifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_mofifier(KSSParser.Ref_mofifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(KSSParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(KSSParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#ref_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_call(KSSParser.Ref_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(KSSParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(KSSParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#templateValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateValue(KSSParser.TemplateValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(KSSParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(KSSParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(KSSParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#multiName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiName(KSSParser.MultiNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#multiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiValue(KSSParser.MultiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(KSSParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#stylingHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylingHeader(KSSParser.StylingHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#eventHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventHeader(KSSParser.EventHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#eventAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAssign(KSSParser.EventAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#stylingDescendantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylingDescendantList(KSSParser.StylingDescendantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#eventAddon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventAddon(KSSParser.EventAddonContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#pointerAddon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerAddon(KSSParser.PointerAddonContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#descendantSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescendantSelector(KSSParser.DescendantSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#eventSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventSelector(KSSParser.EventSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#stylePointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylePointer(KSSParser.StylePointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#elementHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementHeader(KSSParser.ElementHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#classHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassHeader(KSSParser.ClassHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#dataDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataDecorator(KSSParser.DataDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#tagData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagData(KSSParser.TagDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#variableData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableData(KSSParser.VariableDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#multipleValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleValues(KSSParser.MultipleValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#rgb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgb(KSSParser.RgbContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#rgba}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRgba(KSSParser.RgbaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercent(KSSParser.PercentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#pixel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPixel(KSSParser.PixelContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#vec2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec2(KSSParser.Vec2Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#vec3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec3(KSSParser.Vec3Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#vec4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVec4(KSSParser.Vec4Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#udim2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdim2(KSSParser.Udim2Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#true_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_(KSSParser.True_Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#false_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse_(KSSParser.False_Context ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(KSSParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link KSSParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(KSSParser.NumContext ctx);
}