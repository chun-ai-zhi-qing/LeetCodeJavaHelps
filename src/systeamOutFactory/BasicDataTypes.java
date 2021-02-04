package systeamOutFactory;

import java.lang.reflect.Method;

public class BasicDataTypes implements ISystemOutAns {
    @Override
    public void SystemOutAns(Method method, Object[] premeters, Object object) throws Exception {
        System.out.println(method.invoke(object, premeters));
    }
}
