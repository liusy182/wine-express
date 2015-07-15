/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wx.account.form;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hao
 */
@Entity
@Table(name = "is_acc_userinfo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IsAccUserinfo.findAll", query = "SELECT i FROM IsAccUserinfo i"),
    @NamedQuery(name = "IsAccUserinfo.findByEmail", query = "SELECT i FROM IsAccUserinfo i WHERE i.email = :email"),
    @NamedQuery(name = "IsAccUserinfo.findByType", query = "SELECT i FROM IsAccUserinfo i WHERE i.type = :type"),
    @NamedQuery(name = "IsAccUserinfo.findByPassword", query = "SELECT i FROM IsAccUserinfo i WHERE i.password = :password"),
    @NamedQuery(name = "IsAccUserinfo.findBySex", query = "SELECT i FROM IsAccUserinfo i WHERE i.sex = :sex"),
    @NamedQuery(name = "IsAccUserinfo.findByBirthday", query = "SELECT i FROM IsAccUserinfo i WHERE i.birthday = :birthday"),
    @NamedQuery(name = "IsAccUserinfo.findByActived", query = "SELECT i FROM IsAccUserinfo i WHERE i.actived = :actived"),
    @NamedQuery(name = "IsAccUserinfo.findByPrivatekey", query = "SELECT i FROM IsAccUserinfo i WHERE i.privatekey = :privatekey")})
public class IsAccUserinfo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "sex")
    private String sex;
    @Column(name = "birthday")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "actived")
    private String actived;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "privatekey")
    private String privatekey;

    public IsAccUserinfo() {
    }

    public IsAccUserinfo(String email) {
        this.email = email;
    }

    public IsAccUserinfo(String email, String type, String password, String sex, String actived, String privatekey) {
        this.email = email;
        this.type = type;
        this.password = password;
        this.sex = sex;
        this.actived = actived;
        this.privatekey = privatekey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getActived() {
        return actived;
    }

    public void setActived(String actived) {
        this.actived = actived;
    }

    public String getPrivatekey() {
        return privatekey;
    }

    public void setPrivatekey(String privatekey) {
        this.privatekey = privatekey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IsAccUserinfo)) {
            return false;
        }
        IsAccUserinfo other = (IsAccUserinfo) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wx.account.form.IsAccUserinfo[ email=" + email + " ]";
    }
    
}
