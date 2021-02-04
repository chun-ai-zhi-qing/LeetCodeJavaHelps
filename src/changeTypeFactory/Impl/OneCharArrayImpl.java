package changeTypeFactory.Impl;

import changeTypeFactory.IChangeType;

public class OneCharArrayImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        return premeter.toCharArray();
    }
}
