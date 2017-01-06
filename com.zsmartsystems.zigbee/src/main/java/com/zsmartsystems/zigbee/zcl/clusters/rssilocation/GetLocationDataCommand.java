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
 * Get Location Data Command value object class.
 * </p>
 * <p>
 * Cluster: <b>RSSI Location</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the RSSI Location cluster.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class GetLocationDataCommand extends ZclCommand {
    /**
     * Header command message field.
     */
    private Integer header;

    /**
     * Number Responses command message field.
     */
    private Integer numberResponses;

    /**
     * Target Address command message field.
     */
    private Long targetAddress;

    /**
     * Default constructor setting the command type field.
     */
    public GetLocationDataCommand() {
        genericCommand = false;
        clusterId = 11;
        commandId = 3;
        commandDirection = true;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public GetLocationDataCommand(final Map<Integer, Object> fields) {
        this();
        header = (Integer) fields.get(0);
        numberResponses = (Integer) fields.get(1);
        targetAddress = (Long) fields.get(2);
    }

    /**
     * Gets Header.
     * @return the Header
     */
    public Integer getHeader() {
        return header;
    }

    /**
     * Sets Header.
     * @param header the Header
     */
    public void setHeader(final Integer header) {
        this.header = header;
    }

    /**
     * Gets Number Responses.
     * @return the Number Responses
     */
    public Integer getNumberResponses() {
        return numberResponses;
    }

    /**
     * Sets Number Responses.
     * @param numberResponses the Number Responses
     */
    public void setNumberResponses(final Integer numberResponses) {
        this.numberResponses = numberResponses;
    }

    /**
     * Gets Target Address.
     * @return the Target Address
     */
    public Long getTargetAddress() {
        return targetAddress;
    }

    /**
     * Sets Target Address.
     * @param targetAddress the Target Address
     */
    public void setTargetAddress(final Long targetAddress) {
        this.targetAddress = targetAddress;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(header, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(numberResponses, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(targetAddress, ZclDataType.IEEE_ADDRESS);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        header = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        numberResponses = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        targetAddress = (Long) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("header = ");
        builder.append(header);
        builder.append(", ");
        builder.append("numberResponses = ");
        builder.append(numberResponses);
        builder.append(", ");
        builder.append("targetAddress = ");
        builder.append(targetAddress);
        return builder.toString();
    }

}