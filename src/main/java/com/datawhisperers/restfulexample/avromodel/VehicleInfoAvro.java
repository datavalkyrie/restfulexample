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
public class VehicleInfoAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -72410702832229965L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"VehicleInfoAvro\",\"namespace\":\"com.datawhisperers.restfulexample.avromodel\",\"fields\":[{\"name\":\"vehicleType\",\"type\":\"string\"},{\"name\":\"fuelType\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<VehicleInfoAvro> ENCODER =
      new BinaryMessageEncoder<VehicleInfoAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<VehicleInfoAvro> DECODER =
      new BinaryMessageDecoder<VehicleInfoAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<VehicleInfoAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<VehicleInfoAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<VehicleInfoAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<VehicleInfoAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this VehicleInfoAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a VehicleInfoAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a VehicleInfoAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static VehicleInfoAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence vehicleType;
  @Deprecated public java.lang.CharSequence fuelType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public VehicleInfoAvro() {}

  /**
   * All-args constructor.
   * @param vehicleType The new value for vehicleType
   * @param fuelType The new value for fuelType
   */
  public VehicleInfoAvro(java.lang.CharSequence vehicleType, java.lang.CharSequence fuelType) {
    this.vehicleType = vehicleType;
    this.fuelType = fuelType;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vehicleType;
    case 1: return fuelType;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: vehicleType = (java.lang.CharSequence)value$; break;
    case 1: fuelType = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vehicleType' field.
   * @return The value of the 'vehicleType' field.
   */
  public java.lang.CharSequence getVehicleType() {
    return vehicleType;
  }


  /**
   * Sets the value of the 'vehicleType' field.
   * @param value the value to set.
   */
  public void setVehicleType(java.lang.CharSequence value) {
    this.vehicleType = value;
  }

  /**
   * Gets the value of the 'fuelType' field.
   * @return The value of the 'fuelType' field.
   */
  public java.lang.CharSequence getFuelType() {
    return fuelType;
  }


  /**
   * Sets the value of the 'fuelType' field.
   * @param value the value to set.
   */
  public void setFuelType(java.lang.CharSequence value) {
    this.fuelType = value;
  }

  /**
   * Creates a new VehicleInfoAvro RecordBuilder.
   * @return A new VehicleInfoAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder newBuilder() {
    return new com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder();
  }

  /**
   * Creates a new VehicleInfoAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new VehicleInfoAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder(other);
    }
  }

  /**
   * Creates a new VehicleInfoAvro RecordBuilder by copying an existing VehicleInfoAvro instance.
   * @param other The existing instance to copy.
   * @return A new VehicleInfoAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for VehicleInfoAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<VehicleInfoAvro>
    implements org.apache.avro.data.RecordBuilder<VehicleInfoAvro> {

    private java.lang.CharSequence vehicleType;
    private java.lang.CharSequence fuelType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[0].schema(), other.vehicleType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.fuelType)) {
        this.fuelType = data().deepCopy(fields()[1].schema(), other.fuelType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing VehicleInfoAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.vehicleType)) {
        this.vehicleType = data().deepCopy(fields()[0].schema(), other.vehicleType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.fuelType)) {
        this.fuelType = data().deepCopy(fields()[1].schema(), other.fuelType);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'vehicleType' field.
      * @return The value.
      */
    public java.lang.CharSequence getVehicleType() {
      return vehicleType;
    }


    /**
      * Sets the value of the 'vehicleType' field.
      * @param value The value of 'vehicleType'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder setVehicleType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.vehicleType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'vehicleType' field has been set.
      * @return True if the 'vehicleType' field has been set, false otherwise.
      */
    public boolean hasVehicleType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'vehicleType' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder clearVehicleType() {
      vehicleType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'fuelType' field.
      * @return The value.
      */
    public java.lang.CharSequence getFuelType() {
      return fuelType;
    }


    /**
      * Sets the value of the 'fuelType' field.
      * @param value The value of 'fuelType'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder setFuelType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.fuelType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'fuelType' field has been set.
      * @return True if the 'fuelType' field has been set, false otherwise.
      */
    public boolean hasFuelType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'fuelType' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.VehicleInfoAvro.Builder clearFuelType() {
      fuelType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public VehicleInfoAvro build() {
      try {
        VehicleInfoAvro record = new VehicleInfoAvro();
        record.vehicleType = fieldSetFlags()[0] ? this.vehicleType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.fuelType = fieldSetFlags()[1] ? this.fuelType : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<VehicleInfoAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<VehicleInfoAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<VehicleInfoAvro>
    READER$ = (org.apache.avro.io.DatumReader<VehicleInfoAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.vehicleType);

    out.writeString(this.fuelType);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.vehicleType = in.readString(this.vehicleType instanceof Utf8 ? (Utf8)this.vehicleType : null);

      this.fuelType = in.readString(this.fuelType instanceof Utf8 ? (Utf8)this.fuelType : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.vehicleType = in.readString(this.vehicleType instanceof Utf8 ? (Utf8)this.vehicleType : null);
          break;

        case 1:
          this.fuelType = in.readString(this.fuelType instanceof Utf8 ? (Utf8)this.fuelType : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










