package org.acme.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class IP {
    private String ipAddress;
    private Protocol protocol;

    public IP(String ipAddress) {

        if (ipAddress == null) {
            throw new IllegalArgumentException("Null IP Address");
        }

        if (ipAddress.length() <= 15) {
            this.protocol = Protocol.IPV4;
        } else {
            this.protocol = Protocol.IPV6;
        }

        this.ipAddress = ipAddress;
    }
}
