/*
 * package com.ssp.phoenix.model;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Table;
 * 
 * import org.springframework.data.annotation.Id;
 * 
 * @Entity
 * 
 * @Table(name = "BLOOD_FINDER_HISTORY") public class BloodFinderHistory {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private long id; private
 * String bloodGroup; private String requestorName; private String note; private
 * String requestorPhoneNumber;
 * 
 * public BloodFinderHistory() {
 * 
 * }
 * 
 * public BloodFinderHistory(long id, String bloodGroup, String requestorName,
 * String note, String requestorPhoneNumber) { super(); this.id = id;
 * this.bloodGroup = bloodGroup; this.requestorName = requestorName; this.note =
 * note; this.requestorPhoneNumber = requestorPhoneNumber; }
 * 
 * public long getId() { return id; }
 * 
 * public void setId(long id) { this.id = id; }
 * 
 * @Column(name = "blood_group", nullable = false) public String getBloodGroup()
 * { return bloodGroup; }
 * 
 * public void setBloodGroup(String bloodGroup) { this.bloodGroup = bloodGroup;
 * }
 * 
 * @Column(name = "requestor_name", nullable = false) public String
 * getRequestorName() { return requestorName; }
 * 
 * public void setRequestorName(String requestorName) { this.requestorName =
 * requestorName; }
 * 
 * @Column(name = "note", nullable = false) public String getNote() { return
 * note; }
 * 
 * public void setNote(String note) { this.note = note; }
 * 
 * @Column(name = "requestor_mobile", nullable = false) public String
 * getRequestorPhoneNumber() { return requestorPhoneNumber; }
 * 
 * public void setRequestorPhoneNumber(String requestorPhoneNumber) {
 * this.requestorPhoneNumber = requestorPhoneNumber; }
 * 
 * @Override public String toString() { return "BloodFinderHistory [bloodGroup="
 * + bloodGroup + ", requestorName=" + requestorName + ", note=" + note +
 * ", requestorPhoneNumber=" + requestorPhoneNumber + "]"; }
 * 
 * }
 */