package com.example.audit_ui.model;


import java.util.ArrayList;
import java.util.List;

public class OpenScheduleModel {
 private  String sheduleDate;
 private  String hubName;
 private String warehouseName;
 private String auditType;

 public OpenScheduleModel(String sheduleDate, String hubName, String warehouseName, String auditType) {
  this.sheduleDate = sheduleDate;
  this.hubName = hubName;
  this.warehouseName = warehouseName;
  this.auditType = auditType;

 }

 public OpenScheduleModel() {
 }

 public String getSheduleDate() {
  return sheduleDate;
 }

 public void setSheduleDate(String sheduleDate) {
  this.sheduleDate = sheduleDate;
 }

 public String getHubName() {
  return hubName;
 }

 public void setHubName(String hubName) {
  this.hubName = hubName;
 }

 public String getWarehouseName() {
  return warehouseName;
 }

 public void setWarehouseName(String warehouseName) {
  this.warehouseName = warehouseName;
 }

 public String getAuditType() {
  return auditType;
 }

 public void setAuditType(String auditType) {
  this.auditType = auditType;
 }




}
