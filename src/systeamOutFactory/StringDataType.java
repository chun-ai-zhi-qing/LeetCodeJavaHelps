package systeamOutFactory;

import java.lang.reflect.Method;

public class StringDataType implements ISystemOutAns{
    @Override
    public void SystemOutAns(Method method, Object[] premeters, Object object) throws Exception {
        Object tmp = method.invoke(object , premeters);
        System.out.println(tmp.toString());
    }
}
