package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class DoubleTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        Object object = new Double(Double.valueOf(premeter));
        return object;
    }
}
