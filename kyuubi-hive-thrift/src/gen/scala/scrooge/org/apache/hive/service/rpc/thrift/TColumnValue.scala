/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.scrooge.{
  TFieldBlob,
  ThriftStruct,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ThriftUnion,
  ThriftUnionFieldInfo,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3}
import org.apache.thrift.protocol._
import scala.collection.immutable.{Map => immutable$Map}

@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
sealed trait TColumnValue
  extends ThriftUnion
  with ThriftStruct
  with ValidatingThriftStruct[TColumnValue] {

  def _codec: ValidatingThriftStructCodec3[TColumnValue] = TColumnValue
}

private object TColumnValueDecoder {
  def apply(_iprot: TProtocol, newUnknown: TFieldBlob => TColumnValue): TColumnValue = {
    var _result: TColumnValue = null
    _iprot.readStructBegin()
    val _field = _iprot.readFieldBegin()
    _field.id match {
      case 1 => // boolVal
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.BoolVal({
              org.apache.hive.service.rpc.thrift.TBoolValue.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 2 => // byteVal
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.ByteVal({
              org.apache.hive.service.rpc.thrift.TByteValue.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 3 => // i16Val
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.I16Val({
              org.apache.hive.service.rpc.thrift.TI16Value.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 4 => // i32Val
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.I32Val({
              org.apache.hive.service.rpc.thrift.TI32Value.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 5 => // i64Val
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.I64Val({
              org.apache.hive.service.rpc.thrift.TI64Value.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 6 => // doubleVal
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.DoubleVal({
              org.apache.hive.service.rpc.thrift.TDoubleValue.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case 7 => // stringVal
        _field.`type` match {
          case TType.STRUCT =>
            _result = TColumnValue.StringVal({
              org.apache.hive.service.rpc.thrift.TStringValue.decode(_iprot)
            })
          case _ => TProtocolUtil.skip(_iprot, _field.`type`)
        }
      case _ =>
        if (_field.`type` != TType.STOP) {
          _result = newUnknown(TFieldBlob.read(_field, _iprot))
        } else {
          TProtocolUtil.skip(_iprot, _field.`type`)
        }
    }
    if (_field.`type` != TType.STOP) {
      _iprot.readFieldEnd()
      var _done = false
      var _moreThanOne = false
      while (!_done) {
        val _field = _iprot.readFieldBegin()
        if (_field.`type` == TType.STOP)
          _done = true
        else {
          _moreThanOne = true
          TProtocolUtil.skip(_iprot, _field.`type`)
          _iprot.readFieldEnd()
        }
      }
      if (_moreThanOne) {
        _iprot.readStructEnd()
        throw new TProtocolException("Cannot read a TUnion with more than one set value!")
      }
    }
    _iprot.readStructEnd()
    if (_result == null)
      throw new TProtocolException("Cannot read a TUnion with no set value!")
    _result
  }
}

object TColumnValueAliases {

  type BoolValAlias = org.apache.hive.service.rpc.thrift.TBoolValue

  def withoutPassthroughFields_BoolVal(obj: TColumnValue.BoolVal): TColumnValue.BoolVal = {
    val field = obj.boolVal
    TColumnValue.BoolVal(
      org.apache.hive.service.rpc.thrift.TBoolValue.withoutPassthroughFields(field)
    )
  }

  val BoolValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val BoolValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type ByteValAlias = org.apache.hive.service.rpc.thrift.TByteValue

  def withoutPassthroughFields_ByteVal(obj: TColumnValue.ByteVal): TColumnValue.ByteVal = {
    val field = obj.byteVal
    TColumnValue.ByteVal(
      org.apache.hive.service.rpc.thrift.TByteValue.withoutPassthroughFields(field)
    )
  }

  val ByteValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val ByteValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type I16ValAlias = org.apache.hive.service.rpc.thrift.TI16Value

  def withoutPassthroughFields_I16Val(obj: TColumnValue.I16Val): TColumnValue.I16Val = {
    val field = obj.i16Val
    TColumnValue.I16Val(
      org.apache.hive.service.rpc.thrift.TI16Value.withoutPassthroughFields(field)
    )
  }

  val I16ValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val I16ValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type I32ValAlias = org.apache.hive.service.rpc.thrift.TI32Value

  def withoutPassthroughFields_I32Val(obj: TColumnValue.I32Val): TColumnValue.I32Val = {
    val field = obj.i32Val
    TColumnValue.I32Val(
      org.apache.hive.service.rpc.thrift.TI32Value.withoutPassthroughFields(field)
    )
  }

  val I32ValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val I32ValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type I64ValAlias = org.apache.hive.service.rpc.thrift.TI64Value

  def withoutPassthroughFields_I64Val(obj: TColumnValue.I64Val): TColumnValue.I64Val = {
    val field = obj.i64Val
    TColumnValue.I64Val(
      org.apache.hive.service.rpc.thrift.TI64Value.withoutPassthroughFields(field)
    )
  }

  val I64ValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val I64ValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type DoubleValAlias = org.apache.hive.service.rpc.thrift.TDoubleValue

  def withoutPassthroughFields_DoubleVal(obj: TColumnValue.DoubleVal): TColumnValue.DoubleVal = {
    val field = obj.doubleVal
    TColumnValue.DoubleVal(
      org.apache.hive.service.rpc.thrift.TDoubleValue.withoutPassthroughFields(field)
    )
  }

  val DoubleValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val DoubleValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  type StringValAlias = org.apache.hive.service.rpc.thrift.TStringValue

  def withoutPassthroughFields_StringVal(obj: TColumnValue.StringVal): TColumnValue.StringVal = {
    val field = obj.stringVal
    TColumnValue.StringVal(
      org.apache.hive.service.rpc.thrift.TStringValue.withoutPassthroughFields(field)
    )
  }

  val StringValKeyTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None

  val StringValValueTypeManifest: _root_.scala.Option[Manifest[_]] = _root_.scala.None
}


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
object TColumnValue extends ValidatingThriftStructCodec3[TColumnValue] {
  val Union: TStruct = new TStruct("TColumnValue")
  val BoolValField: TField = new TField("boolVal", TType.STRUCT, 1)
  val BoolValFieldManifest: Manifest[BoolVal] = implicitly[Manifest[BoolVal]]
  val ByteValField: TField = new TField("byteVal", TType.STRUCT, 2)
  val ByteValFieldManifest: Manifest[ByteVal] = implicitly[Manifest[ByteVal]]
  val I16ValField: TField = new TField("i16Val", TType.STRUCT, 3)
  val I16ValFieldManifest: Manifest[I16Val] = implicitly[Manifest[I16Val]]
  val I32ValField: TField = new TField("i32Val", TType.STRUCT, 4)
  val I32ValFieldManifest: Manifest[I32Val] = implicitly[Manifest[I32Val]]
  val I64ValField: TField = new TField("i64Val", TType.STRUCT, 5)
  val I64ValFieldManifest: Manifest[I64Val] = implicitly[Manifest[I64Val]]
  val DoubleValField: TField = new TField("doubleVal", TType.STRUCT, 6)
  val DoubleValFieldManifest: Manifest[DoubleVal] = implicitly[Manifest[DoubleVal]]
  val StringValField: TField = new TField("stringVal", TType.STRUCT, 7)
  val StringValFieldManifest: Manifest[StringVal] = implicitly[Manifest[StringVal]]

  lazy val structAnnotations: immutable$Map[java.lang.String, java.lang.String] =
    immutable$Map.empty[java.lang.String, java.lang.String]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftUnionFieldInfo[_ <: TColumnValue, _]] = scala.List(
    new ThriftUnionFieldInfo[BoolVal, TColumnValueAliases.BoolValAlias](
      BoolVal.fieldInfo,
      BoolVal.unapply
    ),
    new ThriftUnionFieldInfo[ByteVal, TColumnValueAliases.ByteValAlias](
      ByteVal.fieldInfo,
      ByteVal.unapply
    ),
    new ThriftUnionFieldInfo[I16Val, TColumnValueAliases.I16ValAlias](
      I16Val.fieldInfo,
      I16Val.unapply
    ),
    new ThriftUnionFieldInfo[I32Val, TColumnValueAliases.I32ValAlias](
      I32Val.fieldInfo,
      I32Val.unapply
    ),
    new ThriftUnionFieldInfo[I64Val, TColumnValueAliases.I64ValAlias](
      I64Val.fieldInfo,
      I64Val.unapply
    ),
    new ThriftUnionFieldInfo[DoubleVal, TColumnValueAliases.DoubleValAlias](
      DoubleVal.fieldInfo,
      DoubleVal.unapply
    ),
    new ThriftUnionFieldInfo[StringVal, TColumnValueAliases.StringValAlias](
      StringVal.fieldInfo,
      StringVal.unapply
    )
  )

  override lazy val metaData = new ThriftStructMetaData(
    this,
    Seq(),
    Seq(),
    fieldInfos.asInstanceOf[Seq[ThriftUnionFieldInfo[_root_.com.twitter.scrooge.ThriftUnion with _root_.com.twitter.scrooge.ThriftStruct, _]]],
    structAnnotations)

  override def encode(_item: TColumnValue, _oprot: TProtocol): Unit =
    _item.write(_oprot)

  override def decode(_iprot: TProtocol): TColumnValue =
    TColumnValueDecoder(_iprot, UnknownUnionField(_))

  def apply(_iprot: TProtocol): TColumnValue = decode(_iprot)

  import TColumnValueAliases._

  def withoutPassthroughFields(struct: TColumnValue): TColumnValue = {
    struct match {
      case obj: BoolVal => withoutPassthroughFields_BoolVal(obj)
      case obj: ByteVal => withoutPassthroughFields_ByteVal(obj)
      case obj: I16Val => withoutPassthroughFields_I16Val(obj)
      case obj: I32Val => withoutPassthroughFields_I32Val(obj)
      case obj: I64Val => withoutPassthroughFields_I64Val(obj)
      case obj: DoubleVal => withoutPassthroughFields_DoubleVal(obj)
      case obj: StringVal => withoutPassthroughFields_StringVal(obj)
      case unknown: UnknownUnionField => unknown // by definition pass-through
    }
  }

  object BoolVal extends (BoolValAlias => BoolVal) {
    def withoutPassthroughFields(obj: BoolVal): BoolVal =
      withoutPassthroughFields_BoolVal(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        BoolValField,
        false,
        false,
        manifest[BoolValAlias],
        BoolValKeyTypeManifest,
        BoolValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class BoolVal(
      boolVal: BoolValAlias)
    extends TColumnValue {

    protected type ContainedType = BoolValAlias

    def containedValue(): ContainedType = boolVal

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(BoolVal.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (boolVal == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (boolVal ne null) {
        val boolVal_item = boolVal
        _oprot.writeFieldBegin(BoolValField)
        boolVal_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object ByteVal extends (ByteValAlias => ByteVal) {
    def withoutPassthroughFields(obj: ByteVal): ByteVal =
      withoutPassthroughFields_ByteVal(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        ByteValField,
        false,
        false,
        manifest[ByteValAlias],
        ByteValKeyTypeManifest,
        ByteValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class ByteVal(
      byteVal: ByteValAlias)
    extends TColumnValue {

    protected type ContainedType = ByteValAlias

    def containedValue(): ContainedType = byteVal

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(ByteVal.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (byteVal == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (byteVal ne null) {
        val byteVal_item = byteVal
        _oprot.writeFieldBegin(ByteValField)
        byteVal_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object I16Val extends (I16ValAlias => I16Val) {
    def withoutPassthroughFields(obj: I16Val): I16Val =
      withoutPassthroughFields_I16Val(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        I16ValField,
        false,
        false,
        manifest[I16ValAlias],
        I16ValKeyTypeManifest,
        I16ValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class I16Val(
      i16Val: I16ValAlias)
    extends TColumnValue {

    protected type ContainedType = I16ValAlias

    def containedValue(): ContainedType = i16Val

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(I16Val.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (i16Val == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (i16Val ne null) {
        val i16Val_item = i16Val
        _oprot.writeFieldBegin(I16ValField)
        i16Val_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object I32Val extends (I32ValAlias => I32Val) {
    def withoutPassthroughFields(obj: I32Val): I32Val =
      withoutPassthroughFields_I32Val(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        I32ValField,
        false,
        false,
        manifest[I32ValAlias],
        I32ValKeyTypeManifest,
        I32ValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class I32Val(
      i32Val: I32ValAlias)
    extends TColumnValue {

    protected type ContainedType = I32ValAlias

    def containedValue(): ContainedType = i32Val

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(I32Val.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (i32Val == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (i32Val ne null) {
        val i32Val_item = i32Val
        _oprot.writeFieldBegin(I32ValField)
        i32Val_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object I64Val extends (I64ValAlias => I64Val) {
    def withoutPassthroughFields(obj: I64Val): I64Val =
      withoutPassthroughFields_I64Val(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        I64ValField,
        false,
        false,
        manifest[I64ValAlias],
        I64ValKeyTypeManifest,
        I64ValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class I64Val(
      i64Val: I64ValAlias)
    extends TColumnValue {

    protected type ContainedType = I64ValAlias

    def containedValue(): ContainedType = i64Val

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(I64Val.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (i64Val == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (i64Val ne null) {
        val i64Val_item = i64Val
        _oprot.writeFieldBegin(I64ValField)
        i64Val_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object DoubleVal extends (DoubleValAlias => DoubleVal) {
    def withoutPassthroughFields(obj: DoubleVal): DoubleVal =
      withoutPassthroughFields_DoubleVal(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        DoubleValField,
        false,
        false,
        manifest[DoubleValAlias],
        DoubleValKeyTypeManifest,
        DoubleValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class DoubleVal(
      doubleVal: DoubleValAlias)
    extends TColumnValue {

    protected type ContainedType = DoubleValAlias

    def containedValue(): ContainedType = doubleVal

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(DoubleVal.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (doubleVal == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (doubleVal ne null) {
        val doubleVal_item = doubleVal
        _oprot.writeFieldBegin(DoubleValField)
        doubleVal_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  object StringVal extends (StringValAlias => StringVal) {
    def withoutPassthroughFields(obj: StringVal): StringVal =
      withoutPassthroughFields_StringVal(obj)

    val fieldInfo: ThriftStructFieldInfo =
      new ThriftStructFieldInfo(
        StringValField,
        false,
        false,
        manifest[StringValAlias],
        StringValKeyTypeManifest,
        StringValValueTypeManifest,
        immutable$Map.empty[java.lang.String, java.lang.String],
        immutable$Map.empty[java.lang.String, java.lang.String]
      )
  }

  case class StringVal(
      stringVal: StringValAlias)
    extends TColumnValue {

    protected type ContainedType = StringValAlias

    def containedValue(): ContainedType = stringVal

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] =
      _root_.scala.Some(StringVal.fieldInfo)

    override def write(_oprot: TProtocol): Unit = {
      if (stringVal == null)
        throw new TProtocolException("Cannot write a TUnion with no set value!")
      _oprot.writeStructBegin(Union)
      if (stringVal ne null) {
        val stringVal_item = stringVal
        _oprot.writeFieldBegin(StringValField)
        stringVal_item.write(_oprot)
        _oprot.writeFieldEnd()
      }
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

  case class UnknownUnionField private[TColumnValue](
      field: TFieldBlob)
    extends TColumnValue {

    protected type ContainedType = Unit

    def containedValue(): ContainedType = ()

    def unionStructFieldInfo: _root_.scala.Option[ThriftStructFieldInfo] = _root_.scala.None

    override def write(_oprot: TProtocol): Unit = {
      _oprot.writeStructBegin(Union)
      field.write(_oprot)
      _oprot.writeFieldStop()
      _oprot.writeStructEnd()
    }
  }

 /**
  * Checks that the struct is a valid as a new instance. If there are any missing required or
  * construction required fields, return a non-empty list.
  */
  override def validateNewInstance(
    item: TColumnValue
  ): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    validateField(item.containedValue())
  }
}