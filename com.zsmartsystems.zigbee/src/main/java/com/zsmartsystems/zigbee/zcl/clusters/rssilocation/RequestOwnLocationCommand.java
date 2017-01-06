package com.zsmartsystems.zigbee.zcl.clusters.rssilocation;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;

import java.util.Map;
import java.util.HashMap;

/**
 * <p>
 * Request Own Location Command value object class.
 * </p>
 * <p>
 * Cluster: <b>RSSI Location</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the RSSI Location cluster.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class RequestOwnLocationCommand extends ZclCommand {
    /**
     * Requesting Address command message field.
     */
    private Long requestingAddress;

    /**
     * Default constructor setting the command type field.
     */
    public RequestOwnLocationCommand() {
        genericCommand = false;
        clusterId = 11;
        commandId = 7;
        commandDirection = false;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public RequestOwnLocationCommand(final Map<Integer, Object> fields) {
        this();
        requestingAddress = (Long) fields.get(0);
    }

    /**
     * Gets Requesting Address.
     * @return the Requesting Address
     */
    public Long getRequestingAddress() {
        return requestingAddress;
    }

    /**
     * Sets Requesting Address.
     * @param requestingAddress the Requesting Address
     */
    public void setRequestingAddress(final Long requestingAddress) {
        this.requestingAddress = requestingAddress;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(requestingAddress, ZclDataType.IEEE_ADDRESS);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        requestingAddress = (Long) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("requestingAddress = ");
        builder.append(requestingAddress);
        return builder.toString();
    }

}