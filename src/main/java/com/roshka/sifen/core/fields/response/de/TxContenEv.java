package com.roshka.sifen.core.fields.response.de;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

import com.roshka.sifen.core.exceptions.SifenException;
import com.roshka.sifen.internal.response.SifenObjectBase;
import com.roshka.sifen.internal.response.SifenObjectFactory;

public class TxContenEv extends SifenObjectBase {
    private final List<TrContEv> rContEvList = new ArrayList<>();

    @Override
    public void setValueFromChildNode(Node value) throws SifenException {
        if (value.getLocalName().equals("rContEv")) {
            rContEvList.add(SifenObjectFactory.getFromNode(value, TrContEv.class));
        }
    }

    public List<TrContEv> getrContEvList() {
        return rContEvList;
    }
}