package changeTypeFactory;

import changeTypeFactory.Impl.*;

public class ChangeTypeFactory {
    public static IChangeType getChangeTypeImlp(Class type) throws Exception {
        if (type.getName().equals("int") || type.getName().equals(Integer.class.getName()))
            return new IntegerTypeImpl();
        else if (type.getName().equals("double") || type.getName().equals(Double.class.getName()))
            return new DoubleTypeImpl();
        else if (type.getName().equals("float") || type.getName().equals(Float.class.getName()))
            return new FloatTypeImpl();
        else if(type.getName().equals("[I"))
            return new OneIntegerArrayImpl();
        else if(type.getName().equals("[[I"))
            return new TwoIntegerArrayImpl();
        else if(type.getName().equals("[D"))
            return new OneDoubleArrayImpl();
        else if(type.getName().equals("[F"))
            return new OneFloatArrayImpl();
        else if(type.getName().equals("[[F"))
            return new TwoFloatArrayImpl();
        else if(type.getName().equals(String.class.getName()))
            return new StringTypeImpl();
        else if(type.getName().equals("[C"))
            return new OneCharArrayImpl();
        else if(type.getName().equals(Boolean.class.getName())||type.getName().equals("boolean"))
            return new BooleanTypeImpl();
        else if(type.getName().equals(String[].class.getName()))
            return new OneStringArrayImpl();
        else if(type.getName().equals("char"))
            return new CharTypeImpl();
        else if(type.getName().equals("[[C"))
            return new TwoCharArrayImpl();
        else
            throw new Exception("没有类型");
    }
}
