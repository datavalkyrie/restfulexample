/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.datawhisperers.restfulexample.avromodel;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class VehicleActivityAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5087429882674562098L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VehicleActivityAvro\",\"namespace\":\"com.datawhisperers.restfulexample.avromodel\",\"fields\":[{\"name\":\"activityType\",\"type\":\"string\"},{\"name\":\"transportMode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<VehicleActivityAvro> ENCODER =
      new BinaryMessageEncoder<VehicleActivityAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<VehicleActivityAvro> DECODER =
      new BinaryMessageDecoder<VehicleActivityAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<VehicleActivityAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<VehicleActivityAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<VehicleActivityAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<VehicleActivityAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this VehicleActivityAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a VehicleActivityAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a VehicleActivityAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static VehicleActivityAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence activityType;
  @Deprecated public java.lang.CharSequence transportMode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public VehicleActivityAvro() {}

  /**
   * All-args constructor.
   * @param activityType The new value for activityType
   * @param transportMode The new value for transportMode
   */
  public VehicleActivityAvro(java.lang.CharSequence activityType, java.lang.CharSequence transportMode) {
    this.activityType = activityType;
    this.transportMode = transportMode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return activityType;
    case 1: return transportMode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: activityType = (java.lang.CharSequence)value$; break;
    case 1: transportMode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'activityType' field.
   * @return The value of the 'activityType' field.
   */
  public java.lang.CharSequence getActivityType() {
    return activityType;
  }


  /**
   * Sets the value of the 'activityType' field.
   * @param value the value to set.
   */
  public void setActivityType(java.lang.CharSequence value) {
    this.activityType = value;
  }

  /**
   * Gets the value of the 'transportMode' field.
   * @return The value of the 'transportMode' field.
   */
  public java.lang.CharSequence getTransportMode() {
    return transportMode;
  }


  /**
   * Sets the value of the 'transportMode' field.
   * @param value the value to set.
   */
  public void setTransportMode(java.lang.CharSequence value) {
    this.transportMode = value;
  }

  /**
   * Creates a new VehicleActivityAvro RecordBuilder.
   * @return A new VehicleActivityAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder newBuilder() {
    return new com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder();
  }

  /**
   * Creates a new VehicleActivityAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new VehicleActivityAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder(other);
    }
  }

  /**
   * Creates a new VehicleActivityAvro RecordBuilder by copying an existing VehicleActivityAvro instance.
   * @param other The existing instance to copy.
   * @return A new VehicleActivityAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for VehicleActivityAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VehicleActivityAvro>
    implements org.apache.avro.data.RecordBuilder<VehicleActivityAvro> {

    private java.lang.CharSequence activityType;
    private java.lang.CharSequence transportMode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.activityType)) {
        this.activityType = data().deepCopy(fields()[0].schema(), other.activityType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.transportMode)) {
        this.transportMode = data().deepCopy(fields()[1].schema(), other.transportMode);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing VehicleActivityAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.activityType)) {
        this.activityType = data().deepCopy(fields()[0].schema(), other.activityType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.transportMode)) {
        this.transportMode = data().deepCopy(fields()[1].schema(), other.transportMode);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'activityType' field.
      * @return The value.
      */
    public java.lang.CharSequence getActivityType() {
      return activityType;
    }


    /**
      * Sets the value of the 'activityType' field.
      * @param value The value of 'activityType'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder setActivityType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.activityType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'activityType' field has been set.
      * @return True if the 'activityType' field has been set, false otherwise.
      */
    public boolean hasActivityType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'activityType' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder clearActivityType() {
      activityType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'transportMode' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransportMode() {
      return transportMode;
    }


    /**
      * Sets the value of the 'transportMode' field.
      * @param value The value of 'transportMode'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder setTransportMode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.transportMode = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'transportMode' field has been set.
      * @return True if the 'transportMode' field has been set, false otherwise.
      */
    public boolean hasTransportMode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'transportMode' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleActivityAvro.Builder clearTransportMode() {
      transportMode = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public VehicleActivityAvro build() {
      try {
        VehicleActivityAvro record = new VehicleActivityAvro();
        record.activityType = fieldSetFlags()[0] ? this.activityType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.transportMode = fieldSetFlags()[1] ? this.transportMode : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<VehicleActivityAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<VehicleActivityAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<VehicleActivityAvro>
    READER$ = (org.apache.avro.io.DatumReader<VehicleActivityAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.activityType);

    out.writeString(this.transportMode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.activityType = in.readString(this.activityType instanceof Utf8 ? (Utf8)this.activityType : null);

      this.transportMode = in.readString(this.transportMode instanceof Utf8 ? (Utf8)this.transportMode : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.activityType = in.readString(this.activityType instanceof Utf8 ? (Utf8)this.activityType : null);
          break;

        case 1:
          this.transportMode = in.readString(this.transportMode instanceof Utf8 ? (Utf8)this.transportMode : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










