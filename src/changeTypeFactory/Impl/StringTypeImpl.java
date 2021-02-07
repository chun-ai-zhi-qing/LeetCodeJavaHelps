package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class StringTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        premeter = premeter.substring(1,premeter.length() - 1);
        return premeter;
    }
}
