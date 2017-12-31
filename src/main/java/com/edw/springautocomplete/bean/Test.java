package com.edw.springautocomplete.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <pre>
 *  com.edw.springautocomplete.bean.Test 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Dec 31, 2017 11:18:19 PM
 *
 */
@Entity
@Table(name = "test")
public class Test implements Serializable {

    @Id
    public String field1;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }
}
