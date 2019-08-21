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
public class SpeedAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5653274778236562503L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SpeedAvro\",\"namespace\":\"com.datawhisperers.restfulexample.avromodel\",\"fields\":[{\"name\":\"engine\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"wheels\",\"type\":{\"type\":\"record\",\"name\":\"WheelsAvro\",\"fields\":[{\"name\":\"frontRight\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"frontLeft\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"backRight\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"backLeft\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}}]}},{\"name\":\"gps\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"acceleration\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}},{\"name\":\"deceleration\",\"type\":{\"type\":\"string\",\"java-class\":\"java.math.BigDecimal\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<SpeedAvro> ENCODER =
      new BinaryMessageEncoder<SpeedAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SpeedAvro> DECODER =
      new BinaryMessageDecoder<SpeedAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SpeedAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SpeedAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SpeedAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SpeedAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SpeedAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SpeedAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SpeedAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SpeedAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.math.BigDecimal engine;
  @Deprecated public com.datawhisperers.restfulexample.avromodel.WheelsAvro wheels;
  @Deprecated public java.math.BigDecimal gps;
  @Deprecated public java.math.BigDecimal acceleration;
  @Deprecated public java.math.BigDecimal deceleration;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SpeedAvro() {}

  /**
   * All-args constructor.
   * @param engine The new value for engine
   * @param wheels The new value for wheels
   * @param gps The new value for gps
   * @param acceleration The new value for acceleration
   * @param deceleration The new value for deceleration
   */
  public SpeedAvro(java.math.BigDecimal engine, com.datawhisperers.restfulexample.avromodel.WheelsAvro wheels, java.math.BigDecimal gps, java.math.BigDecimal acceleration, java.math.BigDecimal deceleration) {
    this.engine = engine;
    this.wheels = wheels;
    this.gps = gps;
    this.acceleration = acceleration;
    this.deceleration = deceleration;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return engine;
    case 1: return wheels;
    case 2: return gps;
    case 3: return acceleration;
    case 4: return deceleration;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: engine = (java.math.BigDecimal)value$; break;
    case 1: wheels = (com.datawhisperers.restfulexample.avromodel.WheelsAvro)value$; break;
    case 2: gps = (java.math.BigDecimal)value$; break;
    case 3: acceleration = (java.math.BigDecimal)value$; break;
    case 4: deceleration = (java.math.BigDecimal)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'engine' field.
   * @return The value of the 'engine' field.
   */
  public java.math.BigDecimal getEngine() {
    return engine;
  }


  /**
   * Sets the value of the 'engine' field.
   * @param value the value to set.
   */
  public void setEngine(java.math.BigDecimal value) {
    this.engine = value;
  }

  /**
   * Gets the value of the 'wheels' field.
   * @return The value of the 'wheels' field.
   */
  public com.datawhisperers.restfulexample.avromodel.WheelsAvro getWheels() {
    return wheels;
  }


  /**
   * Sets the value of the 'wheels' field.
   * @param value the value to set.
   */
  public void setWheels(com.datawhisperers.restfulexample.avromodel.WheelsAvro value) {
    this.wheels = value;
  }

  /**
   * Gets the value of the 'gps' field.
   * @return The value of the 'gps' field.
   */
  public java.math.BigDecimal getGps() {
    return gps;
  }


  /**
   * Sets the value of the 'gps' field.
   * @param value the value to set.
   */
  public void setGps(java.math.BigDecimal value) {
    this.gps = value;
  }

  /**
   * Gets the value of the 'acceleration' field.
   * @return The value of the 'acceleration' field.
   */
  public java.math.BigDecimal getAcceleration() {
    return acceleration;
  }


  /**
   * Sets the value of the 'acceleration' field.
   * @param value the value to set.
   */
  public void setAcceleration(java.math.BigDecimal value) {
    this.acceleration = value;
  }

  /**
   * Gets the value of the 'deceleration' field.
   * @return The value of the 'deceleration' field.
   */
  public java.math.BigDecimal getDeceleration() {
    return deceleration;
  }


  /**
   * Sets the value of the 'deceleration' field.
   * @param value the value to set.
   */
  public void setDeceleration(java.math.BigDecimal value) {
    this.deceleration = value;
  }

  /**
   * Creates a new SpeedAvro RecordBuilder.
   * @return A new SpeedAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder newBuilder() {
    return new com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder();
  }

  /**
   * Creates a new SpeedAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SpeedAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder(other);
    }
  }

  /**
   * Creates a new SpeedAvro RecordBuilder by copying an existing SpeedAvro instance.
   * @param other The existing instance to copy.
   * @return A new SpeedAvro RecordBuilder
   */
  public static com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder newBuilder(com.datawhisperers.restfulexample.avromodel.SpeedAvro other) {
    if (other == null) {
      return new com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder();
    } else {
      return new com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for SpeedAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SpeedAvro>
    implements org.apache.avro.data.RecordBuilder<SpeedAvro> {

    private java.math.BigDecimal engine;
    private com.datawhisperers.restfulexample.avromodel.WheelsAvro wheels;
    private com.datawhisperers.restfulexample.avromodel.WheelsAvro.Builder wheelsBuilder;
    private java.math.BigDecimal gps;
    private java.math.BigDecimal acceleration;
    private java.math.BigDecimal deceleration;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.engine)) {
        this.engine = data().deepCopy(fields()[0].schema(), other.engine);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.wheels)) {
        this.wheels = data().deepCopy(fields()[1].schema(), other.wheels);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasWheelsBuilder()) {
        this.wheelsBuilder = com.datawhisperers.restfulexample.avromodel.WheelsAvro.newBuilder(other.getWheelsBuilder());
      }
      if (isValidValue(fields()[2], other.gps)) {
        this.gps = data().deepCopy(fields()[2].schema(), other.gps);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.acceleration)) {
        this.acceleration = data().deepCopy(fields()[3].schema(), other.acceleration);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.deceleration)) {
        this.deceleration = data().deepCopy(fields()[4].schema(), other.deceleration);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing SpeedAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.datawhisperers.restfulexample.avromodel.SpeedAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.engine)) {
        this.engine = data().deepCopy(fields()[0].schema(), other.engine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.wheels)) {
        this.wheels = data().deepCopy(fields()[1].schema(), other.wheels);
        fieldSetFlags()[1] = true;
      }
      this.wheelsBuilder = null;
      if (isValidValue(fields()[2], other.gps)) {
        this.gps = data().deepCopy(fields()[2].schema(), other.gps);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.acceleration)) {
        this.acceleration = data().deepCopy(fields()[3].schema(), other.acceleration);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.deceleration)) {
        this.deceleration = data().deepCopy(fields()[4].schema(), other.deceleration);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'engine' field.
      * @return The value.
      */
    public java.math.BigDecimal getEngine() {
      return engine;
    }


    /**
      * Sets the value of the 'engine' field.
      * @param value The value of 'engine'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setEngine(java.math.BigDecimal value) {
      validate(fields()[0], value);
      this.engine = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'engine' field has been set.
      * @return True if the 'engine' field has been set, false otherwise.
      */
    public boolean hasEngine() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'engine' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder clearEngine() {
      engine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'wheels' field.
      * @return The value.
      */
    public com.datawhisperers.restfulexample.avromodel.WheelsAvro getWheels() {
      return wheels;
    }


    /**
      * Sets the value of the 'wheels' field.
      * @param value The value of 'wheels'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setWheels(com.datawhisperers.restfulexample.avromodel.WheelsAvro value) {
      validate(fields()[1], value);
      this.wheelsBuilder = null;
      this.wheels = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'wheels' field has been set.
      * @return True if the 'wheels' field has been set, false otherwise.
      */
    public boolean hasWheels() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'wheels' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.datawhisperers.restfulexample.avromodel.WheelsAvro.Builder getWheelsBuilder() {
      if (wheelsBuilder == null) {
        if (hasWheels()) {
          setWheelsBuilder(com.datawhisperers.restfulexample.avromodel.WheelsAvro.newBuilder(wheels));
        } else {
          setWheelsBuilder(com.datawhisperers.restfulexample.avromodel.WheelsAvro.newBuilder());
        }
      }
      return wheelsBuilder;
    }

    /**
     * Sets the Builder instance for the 'wheels' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setWheelsBuilder(com.datawhisperers.restfulexample.avromodel.WheelsAvro.Builder value) {
      clearWheels();
      wheelsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'wheels' field has an active Builder instance
     * @return True if the 'wheels' field has an active Builder instance
     */
    public boolean hasWheelsBuilder() {
      return wheelsBuilder != null;
    }

    /**
      * Clears the value of the 'wheels' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder clearWheels() {
      wheels = null;
      wheelsBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'gps' field.
      * @return The value.
      */
    public java.math.BigDecimal getGps() {
      return gps;
    }


    /**
      * Sets the value of the 'gps' field.
      * @param value The value of 'gps'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setGps(java.math.BigDecimal value) {
      validate(fields()[2], value);
      this.gps = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'gps' field has been set.
      * @return True if the 'gps' field has been set, false otherwise.
      */
    public boolean hasGps() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'gps' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder clearGps() {
      gps = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'acceleration' field.
      * @return The value.
      */
    public java.math.BigDecimal getAcceleration() {
      return acceleration;
    }


    /**
      * Sets the value of the 'acceleration' field.
      * @param value The value of 'acceleration'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setAcceleration(java.math.BigDecimal value) {
      validate(fields()[3], value);
      this.acceleration = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'acceleration' field has been set.
      * @return True if the 'acceleration' field has been set, false otherwise.
      */
    public boolean hasAcceleration() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'acceleration' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder clearAcceleration() {
      acceleration = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'deceleration' field.
      * @return The value.
      */
    public java.math.BigDecimal getDeceleration() {
      return deceleration;
    }


    /**
      * Sets the value of the 'deceleration' field.
      * @param value The value of 'deceleration'.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder setDeceleration(java.math.BigDecimal value) {
      validate(fields()[4], value);
      this.deceleration = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'deceleration' field has been set.
      * @return True if the 'deceleration' field has been set, false otherwise.
      */
    public boolean hasDeceleration() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'deceleration' field.
      * @return This builder.
      */
    public com.datawhisperers.restfulexample.avromodel.SpeedAvro.Builder clearDeceleration() {
      deceleration = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SpeedAvro build() {
      try {
        SpeedAvro record = new SpeedAvro();
        record.engine = fieldSetFlags()[0] ? this.engine : (java.math.BigDecimal) defaultValue(fields()[0]);
        if (wheelsBuilder != null) {
          try {
            record.wheels = this.wheelsBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("wheels"));
            throw e;
          }
        } else {
          record.wheels = fieldSetFlags()[1] ? this.wheels : (com.datawhisperers.restfulexample.avromodel.WheelsAvro) defaultValue(fields()[1]);
        }
        record.gps = fieldSetFlags()[2] ? this.gps : (java.math.BigDecimal) defaultValue(fields()[2]);
        record.acceleration = fieldSetFlags()[3] ? this.acceleration : (java.math.BigDecimal) defaultValue(fields()[3]);
        record.deceleration = fieldSetFlags()[4] ? this.deceleration : (java.math.BigDecimal) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SpeedAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<SpeedAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SpeedAvro>
    READER$ = (org.apache.avro.io.DatumReader<SpeedAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.engine.toString());

    this.wheels.customEncode(out);

    out.writeString(this.gps.toString());

    out.writeString(this.acceleration.toString());

    out.writeString(this.deceleration.toString());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.engine = new java.math.BigDecimal(in.readString());

      if (this.wheels == null) {
        this.wheels = new com.datawhisperers.restfulexample.avromodel.WheelsAvro();
      }
      this.wheels.customDecode(in);

      this.gps = new java.math.BigDecimal(in.readString());

      this.acceleration = new java.math.BigDecimal(in.readString());

      this.deceleration = new java.math.BigDecimal(in.readString());

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.engine = new java.math.BigDecimal(in.readString());
          break;

        case 1:
          if (this.wheels == null) {
            this.wheels = new com.datawhisperers.restfulexample.avromodel.WheelsAvro();
          }
          this.wheels.customDecode(in);
          break;

        case 2:
          this.gps = new java.math.BigDecimal(in.readString());
          break;

        case 3:
          this.acceleration = new java.math.BigDecimal(in.readString());
          break;

        case 4:
          this.deceleration = new java.math.BigDecimal(in.readString());
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









