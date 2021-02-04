package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class StringTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        return premeter;
    }
}
