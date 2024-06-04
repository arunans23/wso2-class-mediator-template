package com.sample.mediator;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MyMediator extends AbstractMediator {

    private static final Log log = LogFactory.getLog(MyMediator.class);

    @Override
    public boolean mediate(MessageContext synCtx) {
        log.info("MyMediator is mediating the message");
        return true;
    }
}
