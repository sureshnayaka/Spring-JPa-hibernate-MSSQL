package com.spring.jpa.mssql.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee_details")
	

public class EmployeeModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "employee_name")
    private String employeeName;

    @Column(name = "employee_type")
    private String employeeType;

    @Column(name = "employee_age")
    private Integer employeeAge;

    @Column(name = "employee_department")
    private String employeeDepartment;

    @Column(name = "employee_joining_date")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date employeeJoiningDate;

    @Column(name = "employee_current_project")
    private String employeeCurrentProject;

    @Column(name = "employee_project_count")
    private Integer employeeProjectCount;

    @Column(name = "employee_active")
    private Boolean employeeActive;

    @Column(name = "employee_feedbacks")
    private String employeeFeedbacks;

    @Column(name = "employee_status")
    private Boolean employeeStatus;

    @Column(name = "employee_actions")
    private String employeeActions;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_reporting_manager")
    private String employeeReportingManager;


}
