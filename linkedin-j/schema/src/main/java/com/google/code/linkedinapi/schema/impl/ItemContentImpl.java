
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.google.code.linkedinapi.schema.InvitationRequest;
import com.google.code.linkedinapi.schema.ItemContent;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invitationRequest"
})
@XmlRootElement(name = "item-content")
public class ItemContentImpl
    implements Serializable, ItemContent
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "invitation-request", required = true, type = InvitationRequestImpl.class)
    protected InvitationRequestImpl invitationRequest;

    public InvitationRequest getInvitationRequest() {
        return invitationRequest;
    }

    public void setInvitationRequest(InvitationRequest value) {
        this.invitationRequest = ((InvitationRequestImpl) value);
    }

}
