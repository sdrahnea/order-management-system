package com.oms.model;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author sdrahnea
 */
@Entity
@Table(name = "message")
public class Message extends CoreEntity {

  @JoinColumn(name = "message_type_id", referencedColumnName = "id")
  @ManyToOne(fetch = FetchType.EAGER)
  private MessageType messageType;

  @Column(name = "sent_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date sentDate;

  @Column(name = "deliver_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date deliver_date;

  @Column(name = "email")
  private String email;

  @Column(name = "phone")
  private String phone;

  public Date getSentDate() {
    return sentDate;
  }

  public void setSentDate(Date sentDate) {
    this.sentDate = sentDate;
  }

  public Date getDeliver_date() {
    return deliver_date;
  }

  public void setDeliver_date(Date deliver_date) {
    this.deliver_date = deliver_date;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MessageType getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageType messageType) {
    this.messageType = messageType;
  }
}
