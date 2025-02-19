/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Data extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2977431254910919057L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"com.example.avro\",\"fields\":[{\"name\":\"ALL\",\"type\":{\"type\":\"record\",\"name\":\"ALL\",\"fields\":[{\"name\":\"allbrokeragePrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcoMrgnReqd\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmfAmt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allvarMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcollateralVal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allrealizedPNL\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allelmMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alllossLimit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncRealMTM\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncElmrMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allbookedPnl\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allexpMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allttlCashBal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncUnRealMTM\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allremarks\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allstockCFS\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncMrgnUsed\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allbuypwr\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allFD\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncVarMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allpremiumPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alldebits\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcategory\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alldirctColatrl\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmargnUsed\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allViewUnrealMTM\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allt1GrossCollatrl\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncCredit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmfssAmntUsed\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allsegment\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alladhocMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alldelivryMrgn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alllien\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmrgnSrpBskPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allsellExp\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alladdPreExpMrgnPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alltotalCollateralVal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alladhocSrpMrgn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allfoExpMgnNrmlPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allpayout\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allrealLoss\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allnetCashAvail\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmargnBlocked\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allutilizedMargin\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcmMrgnCncPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alltenderMrgnPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allnotnalCash\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allscrpBsktMrgn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allgrosscoltrl\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allunRealM2MLoss\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allgrossExp\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allvalDelry\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allunrealizedPNL\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alladdMrgnPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allboMrgnReqd\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcmMrgnMisPrct\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allmultiplier\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcredits\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allunrealMTM\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allpayin\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allnfoSprdBenefit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcashBal\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allremarksAmnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcurSpnMrgNrmlPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allunbookPNL\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcncBrkPrst\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allunRealLoss\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcurExpMrgMisPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allfoExpMrgnMisPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allbuyExp\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcdssprdBenefits\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allUnSetldCredit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allspanMrgnNRML\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allrealPNL\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allspanMrgnMIS\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allbrnchAdhoc\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allipoAmt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"alladhoc\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allturnover\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allrealMTM\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allcurExpMrgNrmlPrsnt\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allspanMargn\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"allrealM2MLoss\",\"type\":[\"null\",\"string\"],\"default\":null}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Data> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Data> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Data> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Data> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Data> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Data to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Data from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Data instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Data fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.example.avro.ALL ALL;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Data() {}

  /**
   * All-args constructor.
   * @param ALL The new value for ALL
   */
  public Data(com.example.avro.ALL ALL) {
    this.ALL = ALL;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ALL;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ALL = (com.example.avro.ALL)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ALL' field.
   * @return The value of the 'ALL' field.
   */
  public com.example.avro.ALL getALL() {
    return ALL;
  }


  /**
   * Sets the value of the 'ALL' field.
   * @param value the value to set.
   */
  public void setALL(com.example.avro.ALL value) {
    this.ALL = value;
  }

  /**
   * Creates a new Data RecordBuilder.
   * @return A new Data RecordBuilder
   */
  public static com.example.avro.Data.Builder newBuilder() {
    return new com.example.avro.Data.Builder();
  }

  /**
   * Creates a new Data RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Data RecordBuilder
   */
  public static com.example.avro.Data.Builder newBuilder(com.example.avro.Data.Builder other) {
    if (other == null) {
      return new com.example.avro.Data.Builder();
    } else {
      return new com.example.avro.Data.Builder(other);
    }
  }

  /**
   * Creates a new Data RecordBuilder by copying an existing Data instance.
   * @param other The existing instance to copy.
   * @return A new Data RecordBuilder
   */
  public static com.example.avro.Data.Builder newBuilder(com.example.avro.Data other) {
    if (other == null) {
      return new com.example.avro.Data.Builder();
    } else {
      return new com.example.avro.Data.Builder(other);
    }
  }

  /**
   * RecordBuilder for Data instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data>
    implements org.apache.avro.data.RecordBuilder<Data> {

    private com.example.avro.ALL ALL;
    private com.example.avro.ALL.Builder ALLBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.Data.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ALL)) {
        this.ALL = data().deepCopy(fields()[0].schema(), other.ALL);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasALLBuilder()) {
        this.ALLBuilder = com.example.avro.ALL.newBuilder(other.getALLBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Data instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.Data other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.ALL)) {
        this.ALL = data().deepCopy(fields()[0].schema(), other.ALL);
        fieldSetFlags()[0] = true;
      }
      this.ALLBuilder = null;
    }

    /**
      * Gets the value of the 'ALL' field.
      * @return The value.
      */
    public com.example.avro.ALL getALL() {
      return ALL;
    }


    /**
      * Sets the value of the 'ALL' field.
      * @param value The value of 'ALL'.
      * @return This builder.
      */
    public com.example.avro.Data.Builder setALL(com.example.avro.ALL value) {
      validate(fields()[0], value);
      this.ALLBuilder = null;
      this.ALL = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ALL' field has been set.
      * @return True if the 'ALL' field has been set, false otherwise.
      */
    public boolean hasALL() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'ALL' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.example.avro.ALL.Builder getALLBuilder() {
      if (ALLBuilder == null) {
        if (hasALL()) {
          setALLBuilder(com.example.avro.ALL.newBuilder(ALL));
        } else {
          setALLBuilder(com.example.avro.ALL.newBuilder());
        }
      }
      return ALLBuilder;
    }

    /**
     * Sets the Builder instance for the 'ALL' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.example.avro.Data.Builder setALLBuilder(com.example.avro.ALL.Builder value) {
      clearALL();
      ALLBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'ALL' field has an active Builder instance
     * @return True if the 'ALL' field has an active Builder instance
     */
    public boolean hasALLBuilder() {
      return ALLBuilder != null;
    }

    /**
      * Clears the value of the 'ALL' field.
      * @return This builder.
      */
    public com.example.avro.Data.Builder clearALL() {
      ALL = null;
      ALLBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Data build() {
      try {
        Data record = new Data();
        if (ALLBuilder != null) {
          try {
            record.ALL = this.ALLBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("ALL"));
            throw e;
          }
        } else {
          record.ALL = fieldSetFlags()[0] ? this.ALL : (com.example.avro.ALL) defaultValue(fields()[0]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Data>
    WRITER$ = (org.apache.avro.io.DatumWriter<Data>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Data>
    READER$ = (org.apache.avro.io.DatumReader<Data>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.ALL.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.ALL == null) {
        this.ALL = new com.example.avro.ALL();
      }
      this.ALL.customDecode(in);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.ALL == null) {
            this.ALL = new com.example.avro.ALL();
          }
          this.ALL.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










