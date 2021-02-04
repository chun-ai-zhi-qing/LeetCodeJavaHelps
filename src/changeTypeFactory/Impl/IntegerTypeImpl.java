package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class IntegerTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        Object object = new Integer(Integer.valueOf(premeter));
        return object;
    }
}
