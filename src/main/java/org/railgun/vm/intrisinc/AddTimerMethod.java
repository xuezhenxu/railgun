package org.railgun.vm.intrisinc;

import org.railgun.vm.object.RGFunctionObject;
import org.railgun.vm.time.UserTimer;
import org.railgun.vm.time.UserTimerManager;

/**
 * Created by hinus on 2017/12/13.
 */
public class AddTimerMethod implements InnerMethod<UserTimer> {
    @Override
    public UserTimer call(Object... args) {
        return UserTimerManager.getManager().addTimer(((Integer)args[2]).intValue(),
                (RGFunctionObject) args[1],
                ((Boolean)args[0]).booleanValue());
    }
}
