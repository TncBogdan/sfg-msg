package com.tnc.sfgmsg.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {

    ///Mandatory for sending jms object message
    static final long serialVersionUID = 6606977347507020427L;

    private UUID id;
    private String message;
}
