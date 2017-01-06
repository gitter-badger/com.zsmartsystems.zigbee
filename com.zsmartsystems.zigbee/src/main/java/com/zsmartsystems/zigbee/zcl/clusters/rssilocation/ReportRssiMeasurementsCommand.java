package com.zsmartsystems.zigbee.zcl.clusters.rssilocation;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import com.zsmartsystems.zigbee.zcl.field.NeighborInformation;

/**
 * <p>
 * Report RSSI Measurements Command value object class.
 * </p>
 * <p>
 * Cluster: <b>RSSI Location</b>. Command is sent <b>FROM</b> the server.
 * This command is a <b>specific</b> command used for the RSSI Location cluster.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class ReportRssiMeasurementsCommand extends ZclCommand {
    /**
     * Reporting Address command message field.
     */
    private Long reportingAddress;

    /**
     * Number of Neighbors command message field.
     */
    private Integer numberOfNeighbors;

    /**
     * Neighbors Information command message field.
     */
    private List<NeighborInformation> neighborsInformation;

    /**
     * Default constructor setting the command type field.
     */
    public ReportRssiMeasurementsCommand() {
        genericCommand = false;
        clusterId = 11;
        commandId = 6;
        commandDirection = false;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public ReportRssiMeasurementsCommand(final Map<Integer, Object> fields) {
        this();
        reportingAddress = (Long) fields.get(0);
        numberOfNeighbors = (Integer) fields.get(1);
        neighborsInformation = (List<NeighborInformation>) fields.get(2);
    }

    /**
     * Gets Reporting Address.
     * @return the Reporting Address
     */
    public Long getReportingAddress() {
        return reportingAddress;
    }

    /**
     * Sets Reporting Address.
     * @param reportingAddress the Reporting Address
     */
    public void setReportingAddress(final Long reportingAddress) {
        this.reportingAddress = reportingAddress;
    }

    /**
     * Gets Number of Neighbors.
     * @return the Number of Neighbors
     */
    public Integer getNumberOfNeighbors() {
        return numberOfNeighbors;
    }

    /**
     * Sets Number of Neighbors.
     * @param numberOfNeighbors the Number of Neighbors
     */
    public void setNumberOfNeighbors(final Integer numberOfNeighbors) {
        this.numberOfNeighbors = numberOfNeighbors;
    }

    /**
     * Gets Neighbors Information.
     * @return the Neighbors Information
     */
    public List<NeighborInformation> getNeighborsInformation() {
        return neighborsInformation;
    }

    /**
     * Sets Neighbors Information.
     * @param neighborsInformation the Neighbors Information
     */
    public void setNeighborsInformation(final List<NeighborInformation> neighborsInformation) {
        this.neighborsInformation = neighborsInformation;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(reportingAddress, ZclDataType.IEEE_ADDRESS);
        serializer.serialize(numberOfNeighbors, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(neighborsInformation, ZclDataType.N_X_NEIGHBORS_INFORMATION);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        reportingAddress = (Long) deserializer.deserialize(ZclDataType.IEEE_ADDRESS);
        numberOfNeighbors = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        neighborsInformation = (List<NeighborInformation>) deserializer.deserialize(ZclDataType.N_X_NEIGHBORS_INFORMATION);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("reportingAddress = ");
        builder.append(reportingAddress);
        builder.append(", ");
        builder.append("numberOfNeighbors = ");
        builder.append(numberOfNeighbors);
        builder.append(", ");
        builder.append("neighborsInformation = ");
        builder.append(neighborsInformation);
        return builder.toString();
    }

}