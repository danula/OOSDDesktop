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
@Table(name = "student", catalog = "oosd", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByDate", query = "SELECT s FROM Student s WHERE s.date = :date"),
    @NamedQuery(name = "Student.findByMonth", query = "SELECT s FROM Student s WHERE s.month = :month"),
    @NamedQuery(name = "Student.findByYear", query = "SELECT s FROM Student s WHERE s.year = :year"),
    @NamedQuery(name = "Student.findByPvtApplicant", query = "SELECT s FROM Student s WHERE s.pvtApplicant = :pvtApplicant"),
    @NamedQuery(name = "Student.findByAssignedClassrm", query = "SELECT s FROM Student s WHERE s.assignedClassrm = :assignedClassrm"),
    @NamedQuery(name = "Student.findByIndex", query = "SELECT s FROM Student s WHERE s.index = :index"),
    @NamedQuery(name = "Student.findById", query = "SELECT s FROM Student s WHERE s.id = :id"),
    @NamedQuery(name = "Student.findByPayment", query = "SELECT s FROM Student s WHERE s.payment = :payment"),
    @NamedQuery(name = "Student.findByMarks", query = "SELECT s FROM Student s WHERE s.marks = :marks"),
    @NamedQuery(name = "Student.findByWithin16", query = "SELECT s FROM Student s WHERE s.within16 = :within16"),
    @NamedQuery(name = "Student.findByVerified", query = "SELECT s FROM Student s WHERE s.verified = :verified"),
    @NamedQuery(name = "Student.findBySchoolId", query = "SELECT s FROM Student s WHERE s.schoolId = :schoolId")})
public class Student implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "date")
    private int date;
    @Basic(optional = false)
    @Column(name = "month")
    private int month;
    @Basic(optional = false)
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Lob
    @Column(name = "school")
    private String school;
    @Basic(optional = false)
    @Lob
    @Column(name = "school_addr")
    private String schoolAddr;
    @Basic(optional = false)
    @Lob
    @Column(name = "home_addr")
    private String homeAddr;
    @Basic(optional = false)
    @Column(name = "pvt_applicant")
    private int pvtApplicant;
    @Basic(optional = false)
    @Lob
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Lob
    @Column(name = "medium")
    private String medium;
    @Basic(optional = false)
    @Lob
    @Column(name = "preferred_centre")
    private String preferredCentre;
    @Column(name = "assigned_classrm")
    private Integer assignedClassrm;
    @Column(name = "index")
    private Integer index;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Column(name = "assigned_centre")
    private String assignedCentre;
    @Basic(optional = false)
    @Column(name = "payment")
    private int payment;
    @Column(name = "marks")
    private Integer marks;
    @Lob
    @Column(name = "award")
    private String award;
    @Column(name = "within16")
    private Integer within16;
    @Lob
    @Column(name = "verification")
    private String verification;
    @Basic(optional = false)
    @Column(name = "verified")
    private int verified;
    @Column(name = "school_id")
    private Integer schoolId;

    public Student() {
    }

    public Student(Integer id) {
        this.id = id;
    }

    public Student(Integer id, String name, int date, int month, int year, String email, String school, String schoolAddr, String homeAddr, int pvtApplicant, String phone, String medium, String preferredCentre, int payment, int verified) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.month = month;
        this.year = year;
        this.email = email;
        this.school = school;
        this.schoolAddr = schoolAddr;
        this.homeAddr = homeAddr;
        this.pvtApplicant = pvtApplicant;
        this.phone = phone;
        this.medium = medium;
        this.preferredCentre = preferredCentre;
        this.payment = payment;
        this.verified = verified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        int oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        int oldMonth = this.month;
        this.month = month;
        changeSupport.firePropertyChange("month", oldMonth, month);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int oldYear = this.year;
        this.year = year;
        changeSupport.firePropertyChange("year", oldYear, year);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        String oldSchool = this.school;
        this.school = school;
        changeSupport.firePropertyChange("school", oldSchool, school);
    }

    public String getSchoolAddr() {
        return schoolAddr;
    }

    public void setSchoolAddr(String schoolAddr) {
        String oldSchoolAddr = this.schoolAddr;
        this.schoolAddr = schoolAddr;
        changeSupport.firePropertyChange("schoolAddr", oldSchoolAddr, schoolAddr);
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        String oldHomeAddr = this.homeAddr;
        this.homeAddr = homeAddr;
        changeSupport.firePropertyChange("homeAddr", oldHomeAddr, homeAddr);
    }

    public int getPvtApplicant() {
        return pvtApplicant;
    }

    public void setPvtApplicant(int pvtApplicant) {
        int oldPvtApplicant = this.pvtApplicant;
        this.pvtApplicant = pvtApplicant;
        changeSupport.firePropertyChange("pvtApplicant", oldPvtApplicant, pvtApplicant);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        String oldMedium = this.medium;
        this.medium = medium;
        changeSupport.firePropertyChange("medium", oldMedium, medium);
    }

    public String getPreferredCentre() {
        return preferredCentre;
    }

    public void setPreferredCentre(String preferredCentre) {
        String oldPreferredCentre = this.preferredCentre;
        this.preferredCentre = preferredCentre;
        changeSupport.firePropertyChange("preferredCentre", oldPreferredCentre, preferredCentre);
    }

    public Integer getAssignedClassrm() {
        return assignedClassrm;
    }

    public void setAssignedClassrm(Integer assignedClassrm) {
        Integer oldAssignedClassrm = this.assignedClassrm;
        this.assignedClassrm = assignedClassrm;
        changeSupport.firePropertyChange("assignedClassrm", oldAssignedClassrm, assignedClassrm);
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        Integer oldIndex = this.index;
        this.index = index;
        changeSupport.firePropertyChange("index", oldIndex, index);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getAssignedCentre() {
        return assignedCentre;
    }

    public void setAssignedCentre(String assignedCentre) {
        String oldAssignedCentre = this.assignedCentre;
        this.assignedCentre = assignedCentre;
        changeSupport.firePropertyChange("assignedCentre", oldAssignedCentre, assignedCentre);
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        int oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        Integer oldMarks = this.marks;
        this.marks = marks;
        changeSupport.firePropertyChange("marks", oldMarks, marks);
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        String oldAward = this.award;
        this.award = award;
        changeSupport.firePropertyChange("award", oldAward, award);
    }

    public Integer getWithin16() {
        return within16;
    }

    public void setWithin16(Integer within16) {
        Integer oldWithin16 = this.within16;
        this.within16 = within16;
        changeSupport.firePropertyChange("within16", oldWithin16, within16);
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

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        Integer oldSchoolId = this.schoolId;
        this.schoolId = schoolId;
        changeSupport.firePropertyChange("schoolId", oldSchoolId, schoolId);
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interfaces.Student[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
