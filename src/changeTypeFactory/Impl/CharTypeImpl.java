package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class CharTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        Character c = premeter.charAt(1);
        return c;
    }
}
