package com.roshka.sifen.core.fields.request.event;

import org.w3c.dom.Node;

import com.roshka.sifen.core.exceptions.SifenException;
import com.roshka.sifen.internal.response.SifenObjectBase;
import com.roshka.sifen.internal.util.ResponseUtil;

public class TrGeVeAnt extends SifenObjectBase {
    private String Id;

    @Override
    public void setValueFromChildNode(Node value) throws SifenException {
        if (value.getLocalName().equals("Id")) {
            this.Id = ResponseUtil.getTextValue(value);
        }
    }

    public String getId() {
        return Id;
    }
}