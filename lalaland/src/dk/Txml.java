package dk;

import java.io.Serializable;

public class Txml implements Serializable{
	Integer id;//��һ�ӵ�id
	String name;//��һ�ӵ�Ŀ䛵�name
	Integer node_order;//��һ���Ŀ¼������
	String details;//��һ��Ŀ¼������
	Integer id2;//�ڶ���Ŀ¼��id
	String name3;//�ڶ���Ŀ¼������
	Integer node_order4;//�ڶ���Ŀ¼������
	String details5;//�ڶ���Ŀ¼������
	Integer internalid;//testcase�������ڲ���
	String name6;//testcase��name
	Integer node_order7;//testcase������
	Integer externalid;//testcase������
	Integer version;//�汾��
	String summary;//
	String preconditions;
	Integer execution_type;//����
	Integer importance;//��Ҫ��
	String estimated_exec_duration;
	Integer status;//״̬
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getNode_order() {
		return node_order;
	}
	public String getDetails() {
		return details;
	}
	public Integer getId2() {
		return id2;
	}
	public String getName3() {
		return name3;
	}
	public Integer getNode_order4() {
		return node_order4;
	}
	public String getDetails5() {
		return details5;
	}
	public Integer getInternalid() {
		return internalid;
	}
	public String getName6() {
		return name6;
	}
	public Integer getNode_order7() {
		return node_order7;
	}
	public Integer getExternalid() {
		return externalid;
	}
	public Integer getVersion() {
		return version;
	}
	public String getSummary() {
		return summary;
	}
	public String getPreconditions() {
		return preconditions;
	}
	public Integer getExecution_type() {
		return execution_type;
	}
	public Integer getImportance() {
		return importance;
	}
	public String getEstimated_exec_duration() {
		return estimated_exec_duration;
	}
	public Integer getStatus() {
		return status;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNode_order(Integer node_order) {
		this.node_order = node_order;
	}
	public void setDetails(String details) {
		if(details==null){
			details="";
		}
		this.details = details;
	}
	public void setId2(Integer id2) {
		this.id2 = id2;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public void setNode_order4(Integer node_order4) {
		this.node_order4 = node_order4;
	}
	public void setDetails5(String details5) {
		if(details5==null){
			details5="";
		}
		this.details5 = details5;
	}
	public void setInternalid(Integer internalid) {
		this.internalid = internalid;
	}
	public void setName6(String name6) {
		this.name6 = name6;
	}
	public void setNode_order7(Integer node_order7) {
		this.node_order7 = node_order7;
	}
	public void setExternalid(Integer externalid) {
		this.externalid = externalid;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public void setSummary(String summary) {
		if(summary==null){
			summary="";
		}
		this.summary = summary;
	}
	public void setPreconditions(String preconditions) {
		if(preconditions==null){
			preconditions="";
		}
		this.preconditions = preconditions;
	}
	public void setExecution_type(Integer execution_type) {
		this.execution_type = execution_type;
	}
	public void setImportance(Integer importance) {
		this.importance = importance;
	}
	public void setEstimated_exec_duration(String estimated_exec_duration) {
		if(estimated_exec_duration==null){
			estimated_exec_duration="";
		}
		this.estimated_exec_duration = estimated_exec_duration;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
}
