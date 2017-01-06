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
 * Set Device Configuration Command value object class.
 * </p>
 * <p>
 * Cluster: <b>RSSI Location</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the RSSI Location cluster.
 * </p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 * </p>
 */
public class SetDeviceConfigurationCommand extends ZclCommand {
    /**
     * Power command message field.
     */
    private Integer power;

    /**
     * Path Loss Exponent command message field.
     */
    private Integer pathLossExponent;

    /**
     * Calculation Period command message field.
     */
    private Integer calculationPeriod;

    /**
     * Number RSSI Measurements command message field.
     */
    private Integer numberRssiMeasurements;

    /**
     * Reporting Period command message field.
     */
    private Integer reportingPeriod;

    /**
     * Default constructor setting the command type field.
     */
    public SetDeviceConfigurationCommand() {
        genericCommand = false;
        clusterId = 11;
        commandId = 1;
        commandDirection = true;
    }

    /**
     * Constructor copying field values from command message.
     *
     * @param fields a {@link Map} containing the value {@link Object}s
     */
    public SetDeviceConfigurationCommand(final Map<Integer, Object> fields) {
        this();
        power = (Integer) fields.get(0);
        pathLossExponent = (Integer) fields.get(1);
        calculationPeriod = (Integer) fields.get(2);
        numberRssiMeasurements = (Integer) fields.get(3);
        reportingPeriod = (Integer) fields.get(4);
    }

    /**
     * Gets Power.
     * @return the Power
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Sets Power.
     * @param power the Power
     */
    public void setPower(final Integer power) {
        this.power = power;
    }

    /**
     * Gets Path Loss Exponent.
     * @return the Path Loss Exponent
     */
    public Integer getPathLossExponent() {
        return pathLossExponent;
    }

    /**
     * Sets Path Loss Exponent.
     * @param pathLossExponent the Path Loss Exponent
     */
    public void setPathLossExponent(final Integer pathLossExponent) {
        this.pathLossExponent = pathLossExponent;
    }

    /**
     * Gets Calculation Period.
     * @return the Calculation Period
     */
    public Integer getCalculationPeriod() {
        return calculationPeriod;
    }

    /**
     * Sets Calculation Period.
     * @param calculationPeriod the Calculation Period
     */
    public void setCalculationPeriod(final Integer calculationPeriod) {
        this.calculationPeriod = calculationPeriod;
    }

    /**
     * Gets Number RSSI Measurements.
     * @return the Number RSSI Measurements
     */
    public Integer getNumberRssiMeasurements() {
        return numberRssiMeasurements;
    }

    /**
     * Sets Number RSSI Measurements.
     * @param numberRssiMeasurements the Number RSSI Measurements
     */
    public void setNumberRssiMeasurements(final Integer numberRssiMeasurements) {
        this.numberRssiMeasurements = numberRssiMeasurements;
    }

    /**
     * Gets Reporting Period.
     * @return the Reporting Period
     */
    public Integer getReportingPeriod() {
        return reportingPeriod;
    }

    /**
     * Sets Reporting Period.
     * @param reportingPeriod the Reporting Period
     */
    public void setReportingPeriod(final Integer reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(power, ZclDataType.SIGNED_16_BIT_INTEGER);
        serializer.serialize(pathLossExponent, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(calculationPeriod, ZclDataType.UNSIGNED_16_BIT_INTEGER);
        serializer.serialize(numberRssiMeasurements, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(reportingPeriod, ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        power = (Integer) deserializer.deserialize(ZclDataType.SIGNED_16_BIT_INTEGER);
        pathLossExponent = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        calculationPeriod = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
        numberRssiMeasurements = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        reportingPeriod = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_16_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("power = ");
        builder.append(power);
        builder.append(", ");
        builder.append("pathLossExponent = ");
        builder.append(pathLossExponent);
        builder.append(", ");
        builder.append("calculationPeriod = ");
        builder.append(calculationPeriod);
        builder.append(", ");
        builder.append("numberRssiMeasurements = ");
        builder.append(numberRssiMeasurements);
        builder.append(", ");
        builder.append("reportingPeriod = ");
        builder.append(reportingPeriod);
        return builder.toString();
    }

}