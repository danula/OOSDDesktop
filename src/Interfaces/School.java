/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Danula
 */
@Entity
@Table(name = "school", catalog = "oosd", schema = "")
@NamedQueries({
    @NamedQuery(name = "School.findAll", query = "SELECT s FROM School s"),
    @NamedQuery(name = "School.findById", query = "SELECT s FROM School s WHERE s.id = :id"),
    @NamedQuery(name = "School.findByPayment", query = "SELECT s FROM School s WHERE s.payment = :payment"),
    @NamedQuery(name = "School.findByVerified", query = "SELECT s FROM School s WHERE s.verified = :verified")})
public class School implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "contactname")
    private String contactname;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Lob
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Lob
    @Column(name = "school_addr")
    private String schoolAddr;
    @Basic(optional = false)
    @Lob
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Lob
    @Column(name = "preferred_centre")
    private String preferredCentre;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "payment")
    private int payment;
    @Lob
    @Column(name = "verification")
    private String verification;
    @Basic(optional = false)
    @Column(name = "verified")
    private int verified;

    public School() {
    }

    public School(Integer id) {
        this.id = id;
    }

    public School(Integer id, String contactname, String email, String name, String password, String schoolAddr, String phone, String preferredCentre, int payment, int verified) {
        this.id = id;
        this.contactname = contactname;
        this.email = email;
        this.name = name;
        this.password = password;
        this.schoolAddr = schoolAddr;
        this.phone = phone;
        this.preferredCentre = preferredCentre;
        this.payment = payment;
        this.verified = verified;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        String oldContactname = this.contactname;
        this.contactname = contactname;
        changeSupport.firePropertyChange("contactname", oldContactname, contactname);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        String oldSchoolAddr = this.schoolAddr;
        this.schoolAddr = schoolAddr;
        changeSupport.firePropertyChange("schoolAddr", oldSchoolAddr, schoolAddr);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getPreferredCentre() {
        return preferredCentre;
    }

    public void setPreferredCentre(String preferredCentre) {
        String oldPreferredCentre = this.preferredCentre;
        this.preferredCentre = preferredCentre;
        changeSupport.firePropertyChange("preferredCentre", oldPreferredCentre, preferredCentre);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        int oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        String oldVerification = this.verification;
        this.verification = verification;
        changeSupport.firePropertyChange("verification", oldVerification, verification);
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        int oldVerified = this.verified;
        this.verified = verified;
        changeSupport.firePropertyChange("verified", oldVerified, verified);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof School)) {
            return false;
        }
        School other = (School) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interfaces.School[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
