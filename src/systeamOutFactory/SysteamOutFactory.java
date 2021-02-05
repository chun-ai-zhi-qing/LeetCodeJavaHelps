package systeamOutFactory;

public class SysteamOutFactory {
    public static ISystemOutAns getISyteamOutAns(String type){
        if(type.equals("int")||type.equals("char")||type.equals("boolean")||type.equals("long")||type.equals("float")||type.equals("double"))
            return new BasicDataTypes();
        if(type.equals(Integer.class.getName())||type.equals(Character.class.getName())||
                type.equals(Boolean.class.getName())||type.equals(Long.class.getName())||
                type.equals(Float.class.getName())||type.equals(Double.class.getName()))
            return new BasicDataTypes();
        if(type.indexOf("[][]")!=-1)
            return new TwoArrayType();
        if(type.indexOf("[]")!=-1)
            return new OneArrayType();
        if(type.equals("void"))
            return new VoidDataType();
        if(type.equals(String.class.getName()))
            return new StringDataType();
        return null;
    }
}
