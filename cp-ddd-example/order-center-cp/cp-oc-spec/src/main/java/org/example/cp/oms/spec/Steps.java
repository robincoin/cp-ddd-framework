package org.example.cp.oms.spec;

/**
 * 订单中台统一定义所有的活动和步骤.
 */
public abstract class Steps {

    public static abstract class SubmitOrder {
        public static final String Activity = "submitOrder";

        public static final String BasicStep = "basic";
        public static final String ProductStep = "product";
        public static final String PersistStep = "persist";
        public static final String BroadcastStep = "mq";
    }

    public static abstract class CancelOrder {
        public static final String Activity = "cancelOrder";

        public static final String BasicStep = "basic";
        public static final String StateStep = "state";
        public static final String PersistStep = "persist";
    }
}
