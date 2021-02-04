package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class FloatTypeImpl implements IChangeType {

    @Override
    public Object ChangeType(String premeter) {
        Object object = new Float(Float.valueOf(premeter));
        return object;
    }
}
