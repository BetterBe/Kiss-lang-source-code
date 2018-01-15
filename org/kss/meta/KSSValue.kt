package org.kss.meta

import org.kss.NumberTypes
import org.kss.antlr.*
import kotlin.math.roundToInt

class KSSValue {

    companion object{

        var variables : HashMap<String,Any?>? = null

        fun getValueFromContext(vctx : KSSParser.ValueContext):Any?{
            if(vctx.vec2()!=null || vctx.udim2()!=null || vctx.vec3()!=null || vctx.vec4()!=null || vctx.rgb()!=null || vctx.rgba()!=null){
                return KSSValue(vctx)
            }else{
                if(vctx.true_()!=null){
                    return true
                }else if(vctx.false_()!=null){
                    return false
                }else if(vctx.NONE()!=null){
                    return null
                }else if(vctx.number()!=null){
                    if(vctx.number().pixel()!=null || vctx.number().percent()!=null){
                        return KSSValue(vctx)
                    }
                    return getNumberFrom(vctx.number())
                }else if(vctx.STRING()!=null){
                    return getStringFrom(vctx.text)
                }else if(vctx.name()!=null && variables !=null){
                    return variables!!.get(vctx.name().text)
                }
            }
            return null
        }
        fun getNumberFrom(nctx : KSSParser.NumberContext) : Float{
            var r = 0F
            if(nctx.num()!=null){
                r = nctx.num().text.toFloat()
            }else if(nctx.percent()!=null){
                r = nctx.percent().num().text.toFloat() * 0.01F
            }else if(nctx.pixel()!=null){
                r = nctx.pixel().num().text.toFloat().roundToInt().toFloat()
            }
            return r
        }
        fun getStringFrom(str : String) = str.substring(1..str.length-2)
    }

    var valueType = ValueTypes.NONE
    var numberType = NumberTypes.NUMBER
    val context : KSSParser.ValueContext

    var float0 = 0F
    var float1 = 0F
    var float2 = 0F
    var float3 = 0F

    var string0 = ""

    var boolean0 = false

    constructor(ctx : KSSParser.ValueContext){
        context = ctx
        assignValueFromContext()
    }

    constructor(){
        context = KSSParser.ValueContext(null,-1)
    }

    fun asString(str : String): KSSValue {
        string0 = str
        valueType = ValueTypes.STRING
        return this
    }
    fun asNumber(f : Float): KSSValue {
        float0 = f
        valueType = ValueTypes.NUMBER
        return this
    }
    fun asBoolean(bool : Boolean): KSSValue {
        boolean0 = bool
        valueType = ValueTypes.BOOLEAN
        return this
    }

    fun asReference(reference : String): KSSValue {
        string0 = reference
        valueType = ValueTypes.REFERENCE
        return this
    }

    fun asVec2(f0 : Float, f1 : Float): KSSValue {
        float0 = f0
        float1 = f1
        valueType = ValueTypes.VEC2
        return this
    }
    fun asVec3(f0 : Float, f1 : Float, f2 : Float): KSSValue {
        float0 = f0
        float1 = f1
        float2 = f2
        valueType = ValueTypes.VEC3
        return this
    }
    fun asVec4(f0 : Float, f1 : Float, f2 : Float, f3 : Float): KSSValue {
        float0 = f0
        float1 = f1
        float2 = f2
        float3 = f3
        valueType = ValueTypes.VEC4
        return this
    }
    fun asRGB(f0 : Float, f1 : Float, f2 : Float): KSSValue {
        float0 = f0
        float1 = f1
        float2 = f2
        valueType = ValueTypes.RGB
        return this
    }
    fun asRGBA(f0 : Float, f1 : Float, f2 : Float, f3 : Float): KSSValue {
        float0 = f0
        float1 = f1
        float2 = f2
        float3 = f3
        valueType = ValueTypes.RGBA
        return this
    }
    fun asUDim2(f0 : Float, f1 : Float, f2 : Float, f3 : Float): KSSValue {
        float0 = f0
        float1 = f1
        float2 = f2
        float3 = f3
        valueType = ValueTypes.UDIM2
        return this
    }

    fun asNone(): KSSValue {
        valueType = ValueTypes.NONE
        return this
    }



    fun assignValueFromContext(){
        if(context.STRING()!=null){
            string0 = getStringFrom(context.STRING().text)
            valueType = ValueTypes.STRING
        }else if(context.false_()!=null){
            boolean0 = false
            valueType = ValueTypes.BOOLEAN
        }else if(context.true_()!=null){
            boolean0 = true
            valueType = ValueTypes.BOOLEAN
        }else if(context.number()!=null){
            valueType = ValueTypes.NUMBER
            float0 = getNumberFrom(context.number())
            if(context.number().percent()!=null){
                numberType = NumberTypes.PERCENTILE
            }else if(context.number().pixel()!=null){
                numberType = NumberTypes.PIXEL
            }
        }else if(context.name()!=null){
            valueType = ValueTypes.REFERENCE
            string0 = context.name().text
        }else if(context.vec2()!=null){
            valueType = ValueTypes.VEC2
            float0 = getNumberFrom(context.vec2().number(0))
            float1 = getNumberFrom(context.vec2().number(1))
        }else if(context.vec3()!=null){
            valueType = ValueTypes.VEC3
            float0 = getNumberFrom(context.vec3().number(0))
            float1 = getNumberFrom(context.vec3().number(1))
            float2 = getNumberFrom(context.vec3().number(2))
        }else if(context.vec4()!=null){
            valueType = ValueTypes.VEC4
            float0 = getNumberFrom(context.vec4().number(0))
            float1 = getNumberFrom(context.vec4().number(1))
            float2 = getNumberFrom(context.vec4().number(2))
            float3 = getNumberFrom(context.vec4().number(3))
        }else if(context.rgb()!=null){
            valueType = ValueTypes.RGB
            float0 = getNumberFrom(context.rgb().number(0))
            float1 = getNumberFrom(context.rgb().number(1))
            float2 = getNumberFrom(context.rgb().number(2))
        }else if(context.rgba()!=null){
            valueType = ValueTypes.RGBA
            float0 = getNumberFrom(context.rgba().number(0))
            float1 = getNumberFrom(context.rgba().number(1))
            float2 = getNumberFrom(context.rgba().number(2))
            float3 = getNumberFrom(context.rgba().number(3))
        }else if(context.udim2()!=null){
            valueType = ValueTypes.UDIM2
            float0 = getNumberFrom(context.udim2().number(0))
            float1 = getNumberFrom(context.udim2().number(1))
            float2 = getNumberFrom(context.udim2().number(2))
            float3 = getNumberFrom(context.udim2().number(3))
        }else{
            valueType = ValueTypes.NONE
        }

    }

    override operator fun equals(other : Any?): Boolean{
        if(other is Float){
            return float0 == other
        }else if(other is String){
            return string0.equals(other)
        }else if(other is Boolean){
            return boolean0 == other
        }else if(other is KSSValue){
            return compare(other)
        }else{
            return false
        }
    }

    override fun toString():String{
        when(valueType){

            ValueTypes.NUMBER -> return "KSS-Float[$float0]"
            ValueTypes.REFERENCE -> return "KSSValue [Reference] '$string0'"
            ValueTypes.VEC2 -> return "KSS-Vec2[x: $float0, y: $float1]"
            ValueTypes.VEC3 -> return "KSS-Vec3[x: $float0, y: $float1, z: $float2]"
            ValueTypes.VEC4 -> return "KSS-Vec4[x: $float0, y: $float1, z: $float2, W: $float3]"
            ValueTypes.RGB -> return "KSS-RGB[r: $float0, g: $float1, b: $float2]"
            ValueTypes.RGBA -> return "KSS-RGBA[r: $float0, g: $float1, b: $float2, a: $float3]"
            ValueTypes.UDIM2 -> return "KSS-UDim2[scale-x: $float0, offset-x: $float1, scale-y: $float2, offset-y: $float3]"

            else->return "KSSValue[N/A]"
        }

    }

    fun compare(value : KSSValue)= value.valueType == valueType && value.boolean0 == boolean0 && value.float0 == float0 && value.float1 == float1 && value.float2 == float2 && value.float3 == float3 && value.string0.equals(string0)

}