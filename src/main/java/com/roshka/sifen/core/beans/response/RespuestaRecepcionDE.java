package com.roshka.sifen.core.beans.response;

import org.w3c.dom.Node;

import com.roshka.sifen.core.exceptions.SifenException;
import com.roshka.sifen.core.fields.response.TxProtDe;
import com.roshka.sifen.internal.response.BaseResponse;
import com.roshka.sifen.internal.response.SifenObjectFactory;

/**
 * Clase principal que contiene la respuesta de Sifen al envío para aprobación de un Documento Electrónico.
 */
public class RespuestaRecepcionDE extends BaseResponse {
    private TxProtDe xProtDE;

    /**
     * Método interno, no usar.
     */
    @Override
    public void setValueFromChildNode(Node value) throws SifenException {
        if (value.getLocalName().equals("rProtDe")) {
            xProtDE = SifenObjectFactory.getFromNode(value, TxProtDe.class);
        }
    }

    public TxProtDe getxProtDE() {
        return xProtDE;
    }
}