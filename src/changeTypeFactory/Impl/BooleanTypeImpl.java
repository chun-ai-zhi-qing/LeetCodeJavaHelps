package changeTypeFactory.Impl;
import changeTypeFactory.IChangeType;

public class BooleanTypeImpl implements IChangeType {
    @Override
    public Object ChangeType(String premeter) {
        return Boolean.valueOf(premeter);
    }
}
