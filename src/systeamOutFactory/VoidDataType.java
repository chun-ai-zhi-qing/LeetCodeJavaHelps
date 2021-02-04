package systeamOutFactory;

import java.lang.reflect.Method;

public class VoidDataType implements ISystemOutAns{
    @Override
    public void SystemOutAns(Method method, Object[] premeters, Object object) throws Exception {
        method.invoke(object , premeters);
    }
}
