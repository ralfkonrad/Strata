/**
 * Copyright (C) 2015 - present by OpenGamma Inc. and the OpenGamma group of companies
 *
 * Please see distribution for license.
 */
package com.opengamma.strata.calc;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.Property;
import org.joda.beans.PropertyDefinition;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;

import com.opengamma.strata.calc.config.Measure;

/**
 * A column definition for a simple column that displays the same measure for all targets.
 * <p>
 * The column name defaults to the measure name but a different name can be specified.
 */
@BeanDefinition
final class SimpleColumnDefinition implements ColumnDefinition, ImmutableBean {

  /** The measure displayed in the column. */
  @PropertyDefinition(validate = "notNull", overrideGet = true)
  private final Measure measure;

  /** The column name. */
  @PropertyDefinition(validate = "notNull", overrideGet = true)
  private final ColumnName name;

  //------------------------- AUTOGENERATED START -------------------------
  ///CLOVER:OFF
  /**
   * The meta-bean for {@code SimpleColumnDefinition}.
   * @return the meta-bean, not null
   */
  public static SimpleColumnDefinition.Meta meta() {
    return SimpleColumnDefinition.Meta.INSTANCE;
  }

  static {
    JodaBeanUtils.registerMetaBean(SimpleColumnDefinition.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static SimpleColumnDefinition.Builder builder() {
    return new SimpleColumnDefinition.Builder();
  }

  private SimpleColumnDefinition(
      Measure measure,
      ColumnName name) {
    JodaBeanUtils.notNull(measure, "measure");
    JodaBeanUtils.notNull(name, "name");
    this.measure = measure;
    this.name = name;
  }

  @Override
  public SimpleColumnDefinition.Meta metaBean() {
    return SimpleColumnDefinition.Meta.INSTANCE;
  }

  @Override
  public <R> Property<R> property(String propertyName) {
    return metaBean().<R>metaProperty(propertyName).createProperty(this);
  }

  @Override
  public Set<String> propertyNames() {
    return metaBean().metaPropertyMap().keySet();
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the measure displayed in the column.
   * @return the value of the property, not null
   */
  @Override
  public Measure getMeasure() {
    return measure;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the column name.
   * @return the value of the property, not null
   */
  @Override
  public ColumnName getName() {
    return name;
  }

  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      SimpleColumnDefinition other = (SimpleColumnDefinition) obj;
      return JodaBeanUtils.equal(measure, other.measure) &&
          JodaBeanUtils.equal(name, other.name);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(measure);
    hash = hash * 31 + JodaBeanUtils.hashCode(name);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("SimpleColumnDefinition{");
    buf.append("measure").append('=').append(measure).append(',').append(' ');
    buf.append("name").append('=').append(JodaBeanUtils.toString(name));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code SimpleColumnDefinition}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code measure} property.
     */
    private final MetaProperty<Measure> measure = DirectMetaProperty.ofImmutable(
        this, "measure", SimpleColumnDefinition.class, Measure.class);
    /**
     * The meta-property for the {@code name} property.
     */
    private final MetaProperty<ColumnName> name = DirectMetaProperty.ofImmutable(
        this, "name", SimpleColumnDefinition.class, ColumnName.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "measure",
        "name");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 938321246:  // measure
          return measure;
        case 3373707:  // name
          return name;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public SimpleColumnDefinition.Builder builder() {
      return new SimpleColumnDefinition.Builder();
    }

    @Override
    public Class<? extends SimpleColumnDefinition> beanType() {
      return SimpleColumnDefinition.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code measure} property.
     * @return the meta-property, not null
     */
    public MetaProperty<Measure> measure() {
      return measure;
    }

    /**
     * The meta-property for the {@code name} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ColumnName> name() {
      return name;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 938321246:  // measure
          return ((SimpleColumnDefinition) bean).getMeasure();
        case 3373707:  // name
          return ((SimpleColumnDefinition) bean).getName();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code SimpleColumnDefinition}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<SimpleColumnDefinition> {

    private Measure measure;
    private ColumnName name;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(SimpleColumnDefinition beanToCopy) {
      this.measure = beanToCopy.getMeasure();
      this.name = beanToCopy.getName();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 938321246:  // measure
          return measure;
        case 3373707:  // name
          return name;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 938321246:  // measure
          this.measure = (Measure) newValue;
          break;
        case 3373707:  // name
          this.name = (ColumnName) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public Builder setString(String propertyName, String value) {
      setString(meta().metaProperty(propertyName), value);
      return this;
    }

    @Override
    public Builder setString(MetaProperty<?> property, String value) {
      super.setString(property, value);
      return this;
    }

    @Override
    public Builder setAll(Map<String, ? extends Object> propertyValueMap) {
      super.setAll(propertyValueMap);
      return this;
    }

    @Override
    public SimpleColumnDefinition build() {
      return new SimpleColumnDefinition(
          measure,
          name);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the measure displayed in the column.
     * @param measure  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder measure(Measure measure) {
      JodaBeanUtils.notNull(measure, "measure");
      this.measure = measure;
      return this;
    }

    /**
     * Sets the column name.
     * @param name  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder name(ColumnName name) {
      JodaBeanUtils.notNull(name, "name");
      this.name = name;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("SimpleColumnDefinition.Builder{");
      buf.append("measure").append('=').append(JodaBeanUtils.toString(measure)).append(',').append(' ');
      buf.append("name").append('=').append(JodaBeanUtils.toString(name));
      buf.append('}');
      return buf.toString();
    }

  }

  ///CLOVER:ON
  //-------------------------- AUTOGENERATED END --------------------------
}
