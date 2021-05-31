/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheoryOfAlgorithms.Markichev.Lab5;

import java.util.Objects;

public class Model {
    private String _stringField;
    private Byte _byteField;

    public Model(String stringField, Byte byteField) {
        _stringField = stringField;
        _byteField = byteField;
    }

    public String getStringField() {
        return _stringField;
    }

    public void setStringField(String _stringField) {
        this._stringField = _stringField;
    }

    public Byte getByteField() {
        return _byteField;
    }

    public void setByteField(Byte _byteField) {
        this._byteField = _byteField;
    }

    @Override
    public String toString() {
        return "Model{" + "StringField=" + _stringField + ", ByteField=" + _byteField + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Model other = (Model) obj;
        if (!Objects.equals(this._byteField, other._byteField))
            return false;
        if (!Objects.equals(this._stringField, other._stringField))
            return false;
        return true;
    }
}
